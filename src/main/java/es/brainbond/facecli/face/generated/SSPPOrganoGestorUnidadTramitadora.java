
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPOrganoGestorUnidadTramitadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPOrganoGestorUnidadTramitadora"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="organo_gestor" type="{https://webservice.face.gob.es}SSPPUnidadDir"/&gt;
 *         &lt;element name="unidad_tramitadora" type="{https://webservice.face.gob.es}SSPPUnidadDir"/&gt;
 *         &lt;element name="oficina_contable" type="{https://webservice.face.gob.es}SSPPUnidadDir"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPOrganoGestorUnidadTramitadora", propOrder = {

})
public class SSPPOrganoGestorUnidadTramitadora {

    @XmlElement(name = "organo_gestor", required = true, nillable = true)
    protected SSPPUnidadDir organoGestor;
    @XmlElement(name = "unidad_tramitadora", required = true, nillable = true)
    protected SSPPUnidadDir unidadTramitadora;
    @XmlElement(name = "oficina_contable", required = true, nillable = true)
    protected SSPPUnidadDir oficinaContable;

    /**
     * Obtiene el valor de la propiedad organoGestor.
     * 
     * @return
     *     possible object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public SSPPUnidadDir getOrganoGestor() {
        return organoGestor;
    }

    /**
     * Define el valor de la propiedad organoGestor.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public void setOrganoGestor(SSPPUnidadDir value) {
        this.organoGestor = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadTramitadora.
     * 
     * @return
     *     possible object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public SSPPUnidadDir getUnidadTramitadora() {
        return unidadTramitadora;
    }

    /**
     * Define el valor de la propiedad unidadTramitadora.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public void setUnidadTramitadora(SSPPUnidadDir value) {
        this.unidadTramitadora = value;
    }

    /**
     * Obtiene el valor de la propiedad oficinaContable.
     * 
     * @return
     *     possible object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public SSPPUnidadDir getOficinaContable() {
        return oficinaContable;
    }

    /**
     * Define el valor de la propiedad oficinaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPPUnidadDir }
     *     
     */
    public void setOficinaContable(SSPPUnidadDir value) {
        this.oficinaContable = value;
    }

}
