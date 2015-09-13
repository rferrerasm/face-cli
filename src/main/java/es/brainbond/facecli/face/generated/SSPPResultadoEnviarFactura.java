
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPResultadoEnviarFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPResultadoEnviarFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="codigo_registro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organo_gestor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unidad_tramitadora" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oficina_contable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificador_emisor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numero_factura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serie_factura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecha_recepcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPResultadoEnviarFactura", propOrder = {

})
public class SSPPResultadoEnviarFactura {

    @XmlElement(name = "codigo_registro", required = true, nillable = true)
    protected String codigoRegistro;
    @XmlElement(name = "organo_gestor", required = true, nillable = true)
    protected String organoGestor;
    @XmlElement(name = "unidad_tramitadora", required = true, nillable = true)
    protected String unidadTramitadora;
    @XmlElement(name = "oficina_contable", required = true, nillable = true)
    protected String oficinaContable;
    @XmlElement(name = "identificador_emisor", required = true, nillable = true)
    protected String identificadorEmisor;
    @XmlElement(name = "numero_factura", required = true, nillable = true)
    protected String numeroFactura;
    @XmlElement(name = "serie_factura", required = true, nillable = true)
    protected String serieFactura;
    @XmlElement(name = "fecha_recepcion", required = true, nillable = true)
    protected String fechaRecepcion;

    /**
     * Obtiene el valor de la propiedad codigoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    /**
     * Define el valor de la propiedad codigoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegistro(String value) {
        this.codigoRegistro = value;
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
