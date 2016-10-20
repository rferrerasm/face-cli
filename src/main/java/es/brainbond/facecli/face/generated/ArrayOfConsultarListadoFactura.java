
package es.brainbond.facecli.face.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConsultarListadoFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConsultarListadoFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarListadoFactura" type="{https://webservice.face.gob.es}ConsultarListadoFactura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConsultarListadoFactura", propOrder = {
    "consultarListadoFactura"
})
public class ArrayOfConsultarListadoFactura {

    protected List<ConsultarListadoFactura> consultarListadoFactura;

    /**
     * Gets the value of the consultarListadoFactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultarListadoFactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultarListadoFactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarListadoFactura }
     * 
     * 
     */
    public List<ConsultarListadoFactura> getConsultarListadoFactura() {
        if (consultarListadoFactura == null) {
            consultarListadoFactura = new ArrayList<ConsultarListadoFactura>();
        }
        return this.consultarListadoFactura;
    }

}
