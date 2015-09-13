
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPResultadoConsultarFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPResultadoConsultarFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="numero_registro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tramitacion" type="{https://webservice.face.gob.es}SSPPResultadoConsultarFacturaEstado"/&gt;
 *         &lt;element name="anulacion" type="{https://webservice.face.gob.es}SSPPResultadoConsultarFacturaEstado"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPResultadoConsultarFactura", propOrder = {

})
public class SSPPResultadoConsultarFactura {

    @XmlElement(name = "numero_registro", required = true, nillable = true)
    protected String numeroRegistro;
    @XmlElement(required = true, nillable = true)
    protected SSPPResultadoConsultarFacturaEstado tramitacion;
    @XmlElement(required = true, nillable = true)
    protected SSPPResultadoConsultarFacturaEstado anulacion;

    /**
     * Obtiene el valor de la propiedad numeroRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Define el valor de la propiedad numeroRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistro(String value) {
        this.numeroRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad tramitacion.
     * 
     * @return
     *     possible object is
     *     {@link SSPPResultadoConsultarFacturaEstado }
     *     
     */
    public SSPPResultadoConsultarFacturaEstado getTramitacion() {
        return tramitacion;
    }

    /**
     * Define el valor de la propiedad tramitacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPResultadoConsultarFacturaEstado }
     *     
     */
    public void setTramitacion(SSPPResultadoConsultarFacturaEstado value) {
        this.tramitacion = value;
    }

    /**
     * Obtiene el valor de la propiedad anulacion.
     * 
     * @return
     *     possible object is
     *     {@link SSPPResultadoConsultarFacturaEstado }
     *     
     */
    public SSPPResultadoConsultarFacturaEstado getAnulacion() {
        return anulacion;
    }

    /**
     * Define el valor de la propiedad anulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPResultadoConsultarFacturaEstado }
     *     
     */
    public void setAnulacion(SSPPResultadoConsultarFacturaEstado value) {
        this.anulacion = value;
    }

}
