
package es.brainbond.facecli.face.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSSPPOrganoGestorUnidadTramitadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSSPPOrganoGestorUnidadTramitadora"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSPPOrganoGestorUnidadTramitadora" type="{https://webservice.face.gob.es}SSPPOrganoGestorUnidadTramitadora" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSSPPOrganoGestorUnidadTramitadora", propOrder = {
    "ssppOrganoGestorUnidadTramitadora"
})
public class ArrayOfSSPPOrganoGestorUnidadTramitadora {

    @XmlElement(name = "SSPPOrganoGestorUnidadTramitadora")
    protected List<SSPPOrganoGestorUnidadTramitadora> ssppOrganoGestorUnidadTramitadora;

    /**
     * Gets the value of the ssppOrganoGestorUnidadTramitadora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssppOrganoGestorUnidadTramitadora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSPPOrganoGestorUnidadTramitadora().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSPPOrganoGestorUnidadTramitadora }
     * 
     * 
     */
    public List<SSPPOrganoGestorUnidadTramitadora> getSSPPOrganoGestorUnidadTramitadora() {
        if (ssppOrganoGestorUnidadTramitadora == null) {
            ssppOrganoGestorUnidadTramitadora = new ArrayList<SSPPOrganoGestorUnidadTramitadora>();
        }
        return this.ssppOrganoGestorUnidadTramitadora;
    }

}
