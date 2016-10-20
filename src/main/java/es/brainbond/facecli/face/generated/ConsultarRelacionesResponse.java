
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarRelacionesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarRelacionesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resultado" type="{https://webservice.face.gob.es}Resultado"/&gt;
 *         &lt;element name="relaciones" type="{https://webservice.face.gob.es}ArrayOfOGUTOC"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarRelacionesResponse", propOrder = {

})
public class ConsultarRelacionesResponse {

    @XmlElement(required = true)
    protected Resultado resultado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfOGUTOC relaciones;

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
     * Obtiene el valor de la propiedad relaciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOGUTOC }
     *     
     */
    public ArrayOfOGUTOC getRelaciones() {
        return relaciones;
    }

    /**
     * Define el valor de la propiedad relaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOGUTOC }
     *     
     */
    public void setRelaciones(ArrayOfOGUTOC value) {
        this.relaciones = value;
    }

}
