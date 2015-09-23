
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarFactura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="numeroRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tramitacion" type="{https://webservice.face.gob.es}EstadoFactura"/&gt;
 *         &lt;element name="anulacion" type="{https://webservice.face.gob.es}EstadoFactura"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarFactura", propOrder = {

})
public class ConsultarFactura {

    @XmlElement(required = true)
    protected String numeroRegistro;
    @XmlElement(required = true)
    protected EstadoFactura tramitacion;
    @XmlElement(required = true)
    protected EstadoFactura anulacion;

    /**
     * Gets the value of the numeroRegistro property.
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
     * Sets the value of the numeroRegistro property.
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
     * Gets the value of the tramitacion property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFactura }
     *     
     */
    public EstadoFactura getTramitacion() {
        return tramitacion;
    }

    /**
     * Sets the value of the tramitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFactura }
     *     
     */
    public void setTramitacion(EstadoFactura value) {
        this.tramitacion = value;
    }

    /**
     * Gets the value of the anulacion property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFactura }
     *     
     */
    public EstadoFactura getAnulacion() {
        return anulacion;
    }

    /**
     * Sets the value of the anulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFactura }
     *     
     */
    public void setAnulacion(EstadoFactura value) {
        this.anulacion = value;
    }

}
