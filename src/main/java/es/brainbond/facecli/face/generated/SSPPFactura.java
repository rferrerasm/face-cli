
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fichero_factura" type="{https://webservice.face.gob.es}SSPPFicheroFactura"/&gt;
 *         &lt;element name="ficheros_anexos" type="{https://webservice.face.gob.es}ArrayOfSSPPFicheroAnexo"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPFactura", propOrder = {

})
public class SSPPFactura {

    @XmlElement(required = true, nillable = true)
    protected String correo;
    @XmlElement(name = "fichero_factura", required = true, nillable = true)
    protected SSPPFicheroFactura ficheroFactura;
    @XmlElement(name = "ficheros_anexos", required = true, nillable = true)
    protected ArrayOfSSPPFicheroAnexo ficherosAnexos;

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad ficheroFactura.
     * 
     * @return
     *     possible object is
     *     {@link SSPPFicheroFactura }
     *     
     */
    public SSPPFicheroFactura getFicheroFactura() {
        return ficheroFactura;
    }

    /**
     * Define el valor de la propiedad ficheroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPFicheroFactura }
     *     
     */
    public void setFicheroFactura(SSPPFicheroFactura value) {
        this.ficheroFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad ficherosAnexos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSSPPFicheroAnexo }
     *     
     */
    public ArrayOfSSPPFicheroAnexo getFicherosAnexos() {
        return ficherosAnexos;
    }

    /**
     * Define el valor de la propiedad ficherosAnexos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSSPPFicheroAnexo }
     *     
     */
    public void setFicherosAnexos(ArrayOfSSPPFicheroAnexo value) {
        this.ficherosAnexos = value;
    }

}
