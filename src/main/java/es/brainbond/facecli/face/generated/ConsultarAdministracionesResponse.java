
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarAdministracionesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarAdministracionesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="resultado" type="{https://webservice.face.gob.es}Resultado"/&gt;
 *         &lt;element name="administraciones" type="{https://webservice.face.gob.es}ArrayOfAdministracion"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarAdministracionesResponse", propOrder = {

})
public class ConsultarAdministracionesResponse {

    @XmlElement(required = true)
    protected Resultado resultado;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAdministracion administraciones;

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
     * Obtiene el valor de la propiedad administraciones.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdministracion }
     *     
     */
    public ArrayOfAdministracion getAdministraciones() {
        return administraciones;
    }

    /**
     * Define el valor de la propiedad administraciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdministracion }
     *     
     */
    public void setAdministraciones(ArrayOfAdministracion value) {
        this.administraciones = value;
    }

}
