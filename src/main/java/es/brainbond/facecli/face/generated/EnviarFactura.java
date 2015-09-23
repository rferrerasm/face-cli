
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnviarFactura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnviarFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="numeroRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organoGestor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unidadTramitadora" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oficinaContable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificadorEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serieFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarFactura", propOrder = {

})
public class EnviarFactura {

    @XmlElement(required = true)
    protected String numeroRegistro;
    @XmlElement(required = true)
    protected String organoGestor;
    @XmlElement(required = true)
    protected String unidadTramitadora;
    @XmlElement(required = true)
    protected String oficinaContable;
    @XmlElement(required = true)
    protected String identificadorEmisor;
    @XmlElement(required = true, nillable = true)
    protected String numeroFactura;
    @XmlElement(required = true, nillable = true)
    protected String serieFactura;
    @XmlElement(required = true)
    protected String fechaRecepcion;

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
     * Gets the value of the organoGestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganoGestor() {
        return organoGestor;
    }

    /**
     * Sets the value of the organoGestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganoGestor(String value) {
        this.organoGestor = value;
    }

    /**
     * Gets the value of the unidadTramitadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadTramitadora() {
        return unidadTramitadora;
    }

    /**
     * Sets the value of the unidadTramitadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadTramitadora(String value) {
        this.unidadTramitadora = value;
    }

    /**
     * Gets the value of the oficinaContable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaContable() {
        return oficinaContable;
    }

    /**
     * Sets the value of the oficinaContable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaContable(String value) {
        this.oficinaContable = value;
    }

    /**
     * Gets the value of the identificadorEmisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorEmisor() {
        return identificadorEmisor;
    }

    /**
     * Sets the value of the identificadorEmisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorEmisor(String value) {
        this.identificadorEmisor = value;
    }

    /**
     * Gets the value of the numeroFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Sets the value of the numeroFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFactura(String value) {
        this.numeroFactura = value;
    }

    /**
     * Gets the value of the serieFactura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFactura() {
        return serieFactura;
    }

    /**
     * Sets the value of the serieFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFactura(String value) {
        this.serieFactura = value;
    }

    /**
     * Gets the value of the fechaRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Sets the value of the fechaRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRecepcion(String value) {
        this.fechaRecepcion = value;
    }

}
