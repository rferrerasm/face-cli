
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarListadoFacturasOffLineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarListadoFacturasOffLineResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resultado" type="{https://webservice.face.gob.es}Resultado"/&gt;
 *         &lt;element name="solicitud" type="{https://webservice.face.gob.es}ConsultarListadoFacturasOffLine"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarListadoFacturasOffLineResponse", propOrder = {

})
public class ConsultarListadoFacturasOffLineResponse {

    @XmlElement(required = true)
    protected Resultado resultado;
    @XmlElement(required = true, nillable = true)
    protected ConsultarListadoFacturasOffLine solicitud;

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the solicitud property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarListadoFacturasOffLine }
     *     
     */
    public ConsultarListadoFacturasOffLine getSolicitud() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarListadoFacturasOffLine }
     *     
     */
    public void setSolicitud(ConsultarListadoFacturasOffLine value) {
        this.solicitud = value;
    }

}