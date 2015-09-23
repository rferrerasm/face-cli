
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OGUTOC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the organoGestor property.
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
     * Sets the value of the organoGestor property.
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
     * Gets the value of the unidadTramitadora property.
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
     * Sets the value of the unidadTramitadora property.
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
     * Gets the value of the oficinaContable property.
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
     * Sets the value of the oficinaContable property.
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
