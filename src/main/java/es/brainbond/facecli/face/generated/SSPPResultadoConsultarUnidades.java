
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPResultadoConsultarUnidades complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPResultadoConsultarUnidades"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="unidades" type="{https://webservice.face.gob.es}ArrayOfSSPPOrganoGestorUnidadTramitadora"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPResultadoConsultarUnidades", propOrder = {

})
public class SSPPResultadoConsultarUnidades {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSSPPOrganoGestorUnidadTramitadora unidades;

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSSPPOrganoGestorUnidadTramitadora }
     *     
     */
    public ArrayOfSSPPOrganoGestorUnidadTramitadora getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSSPPOrganoGestorUnidadTramitadora }
     *     
     */
    public void setUnidades(ArrayOfSSPPOrganoGestorUnidadTramitadora value) {
        this.unidades = value;
    }

}
