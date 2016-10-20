
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarNIFsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarNIFsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resultado" type="{https://webservice.face.gob.es}Resultado"/&gt;
 *         &lt;element name="nifs" type="{https://webservice.face.gob.es}ArrayOfOGNIFs"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarNIFsResponse", propOrder = {

})
public class ConsultarNIFsResponse {

    @XmlElement(required = true)
    protected Resultado resultado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfOGNIFs nifs;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad nifs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOGNIFs }
     *     
     */
    public ArrayOfOGNIFs getNifs() {
        return nifs;
    }

    /**
     * Define el valor de la propiedad nifs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOGNIFs }
     *     
     */
    public void setNifs(ArrayOfOGNIFs value) {
        this.nifs = value;
    }

}
