
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OGUTOC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OGUTOC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="organoGestor" type="{https://webservice.face.gob.es}UnidadDir3"/&gt;
 *         &lt;element name="unidadTramitadora" type="{https://webservice.face.gob.es}UnidadDir3"/&gt;
 *         &lt;element name="oficinaContable" type="{https://webservice.face.gob.es}UnidadDir3"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGUTOC", propOrder = {

})
public class OGUTOC {

    @XmlElement(required = true, nillable = true)
    protected UnidadDir3 organoGestor;
    @XmlElement(required = true, nillable = true)
    protected UnidadDir3 unidadTramitadora;
    @XmlElement(required = true, nillable = true)
    protected UnidadDir3 oficinaContable;

    /**
     * Obtiene el valor de la propiedad organoGestor.
     * 
     * @return
     *     possible object is
     *     {@link UnidadDir3 }
     *     
     */
    public UnidadDir3 getOrganoGestor() {
        return organoGestor;
    }

    /**
     * Define el valor de la propiedad organoGestor.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadDir3 }
     *     
     */
    public void setOrganoGestor(UnidadDir3 value) {
        this.organoGestor = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadTramitadora.
     * 
     * @return
     *     possible object is
     *     {@link UnidadDir3 }
     *     
     */
    public UnidadDir3 getUnidadTramitadora() {
        return unidadTramitadora;
    }

    /**
     * Define el valor de la propiedad unidadTramitadora.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadDir3 }
     *     
     */
    public void setUnidadTramitadora(UnidadDir3 value) {
        this.unidadTramitadora = value;
    }

    /**
     * Obtiene el valor de la propiedad oficinaContable.
     * 
     * @return
     *     possible object is
     *     {@link UnidadDir3 }
     *     
     */
    public UnidadDir3 getOficinaContable() {
        return oficinaContable;
    }

    /**
     * Define el valor de la propiedad oficinaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadDir3 }
     *     
     */
    public void setOficinaContable(UnidadDir3 value) {
        this.oficinaContable = value;
    }

}
