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

package es.brainbond.facecli.face;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.brainbond.facecli.face.generated.ArrayConsultarListadoFactura;
import es.brainbond.facecli.face.generated.ArrayOfSSPPResultadoConsultarFactura;
import es.brainbond.facecli.face.generated.ArrayOfSSPPUnidadDir;
import es.brainbond.facecli.face.generated.SSPPEstado;
import es.brainbond.facecli.face.generated.SSPPEstados;
import es.brainbond.facecli.face.generated.SSPPFactura;
import es.brainbond.facecli.face.generated.SSPPFicheroFactura;
import es.brainbond.facecli.face.generated.SSPPOrganoGestorUnidadTramitadora;
import es.brainbond.facecli.face.generated.SSPPResultadoAnularFactura;
import es.brainbond.facecli.face.generated.SSPPResultadoConsultarFactura;
import es.brainbond.facecli.face.generated.SSPPResultadoConsultarUnidades;
import es.brainbond.facecli.face.generated.SSPPResultadoEnviarFactura;
import es.brainbond.facecli.face.generated.SSPPUnidadDir;
import es.brainbond.facecli.face.generated.SSPPWebServiceProxyPort;

@Service
public class FaceServiceImpl implements FaceService {

    private SSPPWebServiceProxyPort face;
    
    @Autowired
    public FaceServiceImpl(SSPPWebServiceProxyPort face) {
        this.face = face;
    }
    
    @Override
    public SSPPResultadoEnviarFactura enviarFactura(String correo, String rutaFactura) {
        checkNotNull(correo);
        checkNotNull(rutaFactura);
        
        SSPPFactura factura = new SSPPFactura();
        factura.setCorreo(correo);
        
        Path path = Paths.get(rutaFactura);
        
        SSPPFicheroFactura fichero = new SSPPFicheroFactura();
        fichero.setFactura(toBase64(path));
        fichero.setNombre(path.getFileName().toString());
        fichero.setMime("application/xml");
        factura.setFicheroFactura(fichero);
        
        return face.enviarFactura(factura);
    }
    
    private String toBase64(Path path) {
        try {
            return Base64.getEncoder().encodeToString(Files.readAllBytes(path));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printSSPPResultadoEnviarFactura(SSPPResultadoEnviarFactura response) {
        checkNotNull(response);
        
        System.out.println("Resultado envío factura:");
        
        StringBuilder sb = new StringBuilder(100);
        sb.append("    Código registro: ");
        sb.append(response.getCodigoRegistro());
        sb.append('\n');
        sb.append("    Órgano gestor: ");
        sb.append(response.getOrganoGestor());
        sb.append('\n');
        sb.append("    Unidad tramitadora: ");
        sb.append(response.getUnidadTramitadora());
        sb.append('\n');
        sb.append("    Oficina contable: ");
        sb.append(response.getOficinaContable());
        sb.append('\n');
        sb.append("    Identificador emisor: ");
        sb.append(response.getIdentificadorEmisor());
        sb.append('\n');
        sb.append("    Número factura: ");
        sb.append(response.getNumeroFactura());
        sb.append('\n');
        sb.append("    Serie factura: ");
        sb.append(response.getSerieFactura());
        sb.append('\n');
        sb.append("    Fecha recepción: ");
        sb.append(response.getFechaRecepcion());
        sb.append('\n');
        
        System.out.print(sb.toString());
    }

    @Override
    public SSPPResultadoConsultarFactura consultarFactura(String codigoRegistro) {
        checkNotNull(codigoRegistro);
        
        return face.consultarFactura(codigoRegistro);
    }

    @Override
    public void printSSPPResultadoConsultarFactura(SSPPResultadoConsultarFactura response) {
        checkNotNull(response);
        
        System.out.println("Resultado consultar factura:");
        
        StringBuilder sb = new StringBuilder(100);
        sb.append("    Código registro: ");
        sb.append(response.getNumeroRegistro());
        sb.append('\n');
        
        if (response.getTramitacion() != null) {
            sb.append("    Tramitación: \n");
            sb.append("        Código estado: ");
            sb.append(response.getTramitacion().getCodigoEstado());
            sb.append('\n');
            sb.append("        Descripción estado: ");
            sb.append(response.getTramitacion().getDescripcionEstado());
            sb.append('\n');
            sb.append("        Motivo estado: ");
            sb.append(response.getTramitacion().getMotivoEstado());
            sb.append('\n');
        }
        
        if (response.getAnulacion() != null) {
            sb.append("    Anulación: \n");
            sb.append("        Código estado: ");
            sb.append(response.getTramitacion().getCodigoEstado());
            sb.append('\n');
            sb.append("        Descripción estado: ");
            sb.append(response.getTramitacion().getDescripcionEstado());
            sb.append('\n');
            sb.append("        Motivo estado: ");
            sb.append(response.getTramitacion().getMotivoEstado());
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
    
    @Override
    public SSPPResultadoAnularFactura anularFactura(String numeroRegistro, String motivo) {
        checkNotNull(numeroRegistro);
        checkNotNull(motivo);
        
        return face.anularFactura(numeroRegistro, motivo);
    }
    
    @Override
    public void printSSPPResultadoAnularFactura(SSPPResultadoAnularFactura response) {
        checkNotNull(response);
        
        System.out.println("Resultado anular factura:");
        
        StringBuilder sb = new StringBuilder(100);
        sb.append("    Número registro: ");
        sb.append(response.getNumeroRegistro());
        sb.append('\n');
        sb.append("    Mensaje: ");
        sb.append(response.getMensaje());
        sb.append('\n');
        
        System.out.print(sb.toString());
    }
    
    @Override
    public SSPPEstados estados() {
        return face.consultarEstados();
    }

    @Override
    public void printSSPPEstados(SSPPEstados response) {
        checkNotNull(response);
        
        System.out.println("Estados:");
        
        for (SSPPEstado estado: response.getEstados().getSSPPEstado()) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("    ");
            sb.append(estado.getNombre());
            sb.append(", ");
            sb.append(estado.getCodigo());
            sb.append(", ");
            sb.append(estado.getDescripcion());
            sb.append('\n');
            
            System.out.print(sb.toString());
        }
    }

    @Override
    public SSPPResultadoConsultarUnidades unidades() {
        return face.consultarUnidades();
    }

    @Override
    public void printSSPPResultadoConsultarUnidades(SSPPResultadoConsultarUnidades response) {
        checkNotNull(response);
        
        System.out.println("Unidades:");
        
        for (SSPPOrganoGestorUnidadTramitadora unidad:
                response.getUnidades().getSSPPOrganoGestorUnidadTramitadora()) {
            
            StringBuilder sb = new StringBuilder(100);
            sb.append("    - Órgano Gestor: ");
            sb.append(unidad.getOrganoGestor().getCodigoDir());
            sb.append(", ");
            sb.append(unidad.getOrganoGestor().getNombre());
            sb.append('\n');
            sb.append("      Unidad Tramitadora: ");
            sb.append(unidad.getUnidadTramitadora().getCodigoDir());
            sb.append(", ");
            sb.append(unidad.getUnidadTramitadora().getNombre());
            sb.append('\n');
            sb.append("      Oficina Contable: ");
            sb.append(unidad.getOficinaContable().getCodigoDir());
            sb.append(", ");
            sb.append(unidad.getOficinaContable().getNombre());
            sb.append('\n');
            
            System.out.print(sb.toString());
        }
    }

    @Override
    public ArrayOfSSPPUnidadDir administraciones() {
        return face.consultarAdministraciones();
    }

    @Override
    public void printArrayOfSSPPUnidadDir(ArrayOfSSPPUnidadDir response) {
        checkNotNull(response);
        
        System.out.println("Unidades:");
        
        for (SSPPUnidadDir unidad: response.getSSPPUnidadDir()) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("    ");
            sb.append(unidad.getCodigoDir());
            sb.append(", ");
            sb.append(unidad.getNombre());
            sb.append('\n');
            
            System.out.print(sb.toString());
        }
    }

    @Override
    public SSPPResultadoConsultarUnidades unidadesPorAdministracion(String codigoDir) {
        checkNotNull(codigoDir);
        
        return face.consultarUnidadesPorAdministracion(codigoDir);
    }

    @Override
    public ArrayOfSSPPResultadoConsultarFactura consultarListadoFacturas(
            List<String> codigosRegistro) {
        
        checkNotNull(codigosRegistro);
        
        ArrayConsultarListadoFactura listadoFacturas = new ArrayConsultarListadoFactura();
        
        codigosRegistro.forEach(cr -> listadoFacturas.getRegistro().add(cr));
        
        return face.consultarListadoFacturas(listadoFacturas);
    }

    @Override
    public void printArrayOfSSPPResultadoConsultarFactura(
            ArrayOfSSPPResultadoConsultarFactura response) {
        
        checkNotNull(response);
        
        System.out.println("Resultado consultar facturas:");
        
        for (SSPPResultadoConsultarFactura resultado: response.getSSPPResultadoConsultarFactura()) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("    ");
            sb.append(resultado.getNumeroRegistro());
            sb.append('\n');
            
            if (resultado.getTramitacion() != null) {
                sb.append("        Tramitación: \n");
                sb.append("            Código estado: ");
                sb.append(resultado.getTramitacion().getCodigoEstado());
                sb.append('\n');
                sb.append("            Descripción estado: ");
                sb.append(resultado.getTramitacion().getDescripcionEstado());
                sb.append('\n');
                sb.append("            Motivo estado: ");
                sb.append(resultado.getTramitacion().getMotivoEstado());
                sb.append('\n');
            }
            
            if (resultado.getAnulacion() != null) {
                sb.append("        Anulación: \n");
                sb.append("            Código estado: ");
                sb.append(resultado.getTramitacion().getCodigoEstado());
                sb.append('\n');
                sb.append("            Descripción estado: ");
                sb.append(resultado.getTramitacion().getDescripcionEstado());
                sb.append('\n');
                sb.append("            Motivo estado: ");
                sb.append(resultado.getTramitacion().getMotivoEstado());
                sb.append('\n');
            }
            
            System.out.print(sb.toString());
        }
    }
}
