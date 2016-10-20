
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarListadoFacturasOffLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad estado.
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
     * Define el valor de la propiedad estado.
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
     * Obtiene el valor de la propiedad facturas.
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
     * Define el valor de la propiedad facturas.
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
