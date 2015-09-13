
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPEstados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPEstados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="estados" type="{https://webservice.face.gob.es}ArrayOfSSPPEstado"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPEstados", propOrder = {

})
public class SSPPEstados {

    @XmlElement(required = true)
    protected ArrayOfSSPPEstado estados;

    /**
     * Obtiene el valor de la propiedad estados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSSPPEstado }
     *     
     */
    public ArrayOfSSPPEstado getEstados() {
        return estados;
    }

    /**
     * Define el valor de la propiedad estados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSSPPEstado }
     *     
     */
    public void setEstados(ArrayOfSSPPEstado value) {
        this.estados = value;
    }

}
