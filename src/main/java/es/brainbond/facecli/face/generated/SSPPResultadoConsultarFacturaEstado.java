
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPResultadoConsultarFacturaEstado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPResultadoConsultarFacturaEstado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="codigo_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="motivo_estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPResultadoConsultarFacturaEstado", propOrder = {

})
public class SSPPResultadoConsultarFacturaEstado {

    @XmlElement(name = "codigo_estado", required = true, nillable = true)
    protected String codigoEstado;
    @XmlElement(name = "descripcion_estado", required = true, nillable = true)
    protected String descripcionEstado;
    @XmlElement(name = "motivo_estado", required = true, nillable = true)
    protected String motivoEstado;

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstado(String value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEstado() {
        return motivoEstado;
    }

    /**
     * Define el valor de la propiedad motivoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEstado(String value) {
        this.motivoEstado = value;
    }

}
