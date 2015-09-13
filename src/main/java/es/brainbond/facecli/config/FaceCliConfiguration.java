/*
 * Copyright (C) 2015 Brainbond Ingeniería Informática SL.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.brainbond.facecli.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.net.ssl.TrustManagerFactory;
import javax.security.auth.callback.CallbackHandler;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import es.brainbond.facecli.face.generated.SSPPWebServiceProxyPort;

@Configuration
@ComponentScan("es.brainbond.facecli")
public class FaceCliConfiguration {
    
    @Autowired Environment environment;
    
    @Bean
    public SSPPWebServiceProxyPort faceClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(SSPPWebServiceProxyPort.class);
        factory.setAddress("https://se-face-webservice.redsara.es/sspp2");
        
        CallbackHandler passwordCallback =
                new PasswordCallback(
                        environment.getRequiredProperty("keystore.signature.alias"),
                        environment.getRequiredProperty("keystore.signature.password"));
        
        Map<String, Object> props = new HashMap<>();
        props.put("action", "Signature");
        props.put("signatureUser", environment.getRequiredProperty("keystore.signature.alias"));
        props.put("passwordCallbackRef", passwordCallback);
        props.put("signatureKeyIdentifier", "DirectReference");
        props.put("cryptoProperties", cryptoProperties());
        props.put("signaturePropRefId", "cryptoProperties");
        
        factory.getOutInterceptors().add(new WSS4JOutInterceptor(props));
        
        configureLogging(factory);
        
        SSPPWebServiceProxyPort faceClient = (SSPPWebServiceProxyPort) factory.create();
        
        configureHttpConduit(faceClient);
        
        return faceClient;
    }
    
    private Properties cryptoProperties() {
        Properties cryptoProperties = new Properties();
        
        cryptoProperties.setProperty(
                "org.apache.wss4j.crypto.provider",
                "org.apache.wss4j.common.crypto.Merlin");
        cryptoProperties.setProperty(
                "org.apache.wss4j.crypto.merlin.keystore.type",
                environment.getRequiredProperty("keystore.type"));
        cryptoProperties.setProperty(
                "org.apache.wss4j.crypto.merlin.keystore.file",
                environment.getRequiredProperty("keystore.location"));
        cryptoProperties.setProperty(
                "org.apache.wss4j.crypto.merlin.keystore.alias",
                environment.getRequiredProperty("keystore.signature.alias"));
        cryptoProperties.setProperty(
                "org.apache.wss4j.crypto.merlin.keystore.password",
                environment.getRequiredProperty("keystore.password"));
        
        return cryptoProperties;
    }
    
    private void configureLogging(JaxWsProxyFactoryBean factory) {
        int sizeLimit = 512 * 1024;
        
        LoggingInInterceptor logIn = new LoggingInInterceptor(sizeLimit);
        logIn.setPrettyLogging(true);
        
        factory.getInInterceptors().add(logIn);
        factory.getInFaultInterceptors().add(logIn);
        
        LoggingOutInterceptor logOut = new LoggingOutInterceptor(sizeLimit);
        logOut.setPrettyLogging(true);
        
        factory.getOutInterceptors().add(logOut);
        factory.getOutFaultInterceptors().add(logOut);
    }
    
    // Ver:
    //  - http://cxf.apache.org/docs/client-http-transport-including-ssl-support.html
    //  - org.apache.cxf.configuration.jsse.TLSParameterJaxBUtils
    private void configureHttpConduit(SSPPWebServiceProxyPort faceClient) {
        Client client = ClientProxy.getClient(faceClient);
        HTTPConduit httpConduit = (HTTPConduit) client.getConduit();
        TLSClientParameters tlsClientParameters = new TLSClientParameters();
        try {
            KeyStore keyStore = KeyStore.getInstance("jks");
            FileInputStream fis = new FileInputStream(
                    environment.getRequiredProperty("truststore.location"));
            char[] password = environment.getRequiredProperty("truststore.password").toCharArray();
            keyStore.load(fis, password);
            
            TrustManagerFactory trustManagerFactory =
                    TrustManagerFactory.getInstance(
                            TrustManagerFactory.getDefaultAlgorithm());
            
            trustManagerFactory.init(keyStore);
            
            tlsClientParameters.setTrustManagers(trustManagerFactory.getTrustManagers());
        }
        catch (NoSuchAlgorithmException | KeyStoreException | IllegalStateException |
               CertificateException | IOException e) {
            throw new RuntimeException(e);
        }
        
        httpConduit.setTlsClientParameters(tlsClientParameters);
    }
}
