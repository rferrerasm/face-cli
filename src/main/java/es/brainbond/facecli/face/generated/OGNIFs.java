
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OGNIFs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OGNIFs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="organoGestor" type="{https://webservice.face.gob.es}UnidadDir3"/&gt;
 *         &lt;element name="nif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGNIFs", propOrder = {

})
public class OGNIFs {

    @XmlElement(required = true, nillable = true)
    protected UnidadDir3 organoGestor;
    @XmlElement(required = true)
    protected String nif;

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
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNif() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNif(String value) {
        this.nif = value;
    }

}
