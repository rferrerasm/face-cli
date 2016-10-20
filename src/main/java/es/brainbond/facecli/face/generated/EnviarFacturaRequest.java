
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnviarFacturaRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnviarFacturaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="factura" type="{https://webservice.face.gob.es}FacturaFile"/&gt;
 *         &lt;element name="anexos" type="{https://webservice.face.gob.es}ArrayOfAnexoFile"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarFacturaRequest", propOrder = {

})
public class EnviarFacturaRequest {

    @XmlElement(required = true)
    protected String correo;
    @XmlElement(required = true)
    protected FacturaFile factura;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAnexoFile anexos;

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
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link FacturaFile }
     *     
     */
    public FacturaFile getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaFile }
     *     
     */
    public void setFactura(FacturaFile value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad anexos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnexoFile }
     *     
     */
    public ArrayOfAnexoFile getAnexos() {
        return anexos;
    }

    /**
     * Define el valor de la propiedad anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnexoFile }
     *     
     */
    public void setAnexos(ArrayOfAnexoFile value) {
        this.anexos = value;
    }

}
