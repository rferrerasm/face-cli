
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarListadoFacturasOffLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarListadoFacturasOffLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="facturas" type="{https://webservice.face.gob.es}ArrayOfFacturaOffLine"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarListadoFacturasOffLine", propOrder = {

})
public class ConsultarListadoFacturasOffLine {

    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFacturaOffLine facturas;

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the facturas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaOffLine }
     *     
     */
    public ArrayOfFacturaOffLine getFacturas() {
        return facturas;
    }

    /**
     * Sets the value of the facturas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaOffLine }
     *     
     */
    public void setFacturas(ArrayOfFacturaOffLine value) {
        this.facturas = value;
    }

}
