
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnviarFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad organoGestor.
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
     * Define el valor de la propiedad organoGestor.
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
     * Obtiene el valor de la propiedad unidadTramitadora.
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
     * Define el valor de la propiedad unidadTramitadora.
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
     * Obtiene el valor de la propiedad oficinaContable.
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
     * Define el valor de la propiedad oficinaContable.
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
     * Obtiene el valor de la propiedad identificadorEmisor.
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
     * Define el valor de la propiedad identificadorEmisor.
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
     * Obtiene el valor de la propiedad numeroFactura.
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
     * Define el valor de la propiedad numeroFactura.
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
     * Obtiene el valor de la propiedad serieFactura.
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
     * Define el valor de la propiedad serieFactura.
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
     * Obtiene el valor de la propiedad fechaRecepcion.
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
     * Define el valor de la propiedad fechaRecepcion.
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
