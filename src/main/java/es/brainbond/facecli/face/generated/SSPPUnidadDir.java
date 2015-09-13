
package es.brainbond.facecli.face.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SSPPUnidadDir complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SSPPUnidadDir"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="codigo_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPPUnidadDir", propOrder = {

})
public class SSPPUnidadDir {

    @XmlElement(name = "codigo_dir", required = true, nillable = true)
    protected String codigoDir;
    @XmlElement(required = true, nillable = true)
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad codigoDir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDir() {
        return codigoDir;
    }

    /**
     * Define el valor de la propiedad codigoDir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDir(String value) {
        this.codigoDir = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
