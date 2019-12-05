
package ejbenvios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para altaSolicitudDeEnvio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="altaSolicitudDeEnvio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Orden_Compra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altaSolicitudDeEnvio", propOrder = {
    "customerID",
    "ordenCompra",
    "status"
})
public class AltaSolicitudDeEnvio {

    @XmlElement(name = "Customer_ID")
    protected int customerID;
    @XmlElement(name = "Orden_Compra")
    protected int ordenCompra;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "unsignedShort")
    protected int status;

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenCompra.
     * 
     */
    public int getOrdenCompra() {
        return ordenCompra;
    }

    /**
     * Define el valor de la propiedad ordenCompra.
     * 
     */
    public void setOrdenCompra(int value) {
        this.ordenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
