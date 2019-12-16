
package ejbalmacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para altaOC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="altaOC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Product_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShippingCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="intSalesDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intShippingDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FreigthCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altaOC", propOrder = {
    "customerId",
    "productId",
    "quantity",
    "shippingCost",
    "intSalesDate",
    "intShippingDate",
    "freigthCompany"
})
public class AltaOC {

    @XmlElement(name = "Customer_Id")
    protected int customerId;
    @XmlElement(name = "Product_Id")
    protected int productId;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "ShippingCost")
    protected double shippingCost;
    protected int intSalesDate;
    protected int intShippingDate;
    @XmlElement(name = "FreigthCompany")
    protected String freigthCompany;

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCost.
     * 
     */
    public double getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     */
    public void setShippingCost(double value) {
        this.shippingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad intSalesDate.
     * 
     */
    public int getIntSalesDate() {
        return intSalesDate;
    }

    /**
     * Define el valor de la propiedad intSalesDate.
     * 
     */
    public void setIntSalesDate(int value) {
        this.intSalesDate = value;
    }

    /**
     * Obtiene el valor de la propiedad intShippingDate.
     * 
     */
    public int getIntShippingDate() {
        return intShippingDate;
    }

    /**
     * Define el valor de la propiedad intShippingDate.
     * 
     */
    public void setIntShippingDate(int value) {
        this.intShippingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad freigthCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreigthCompany() {
        return freigthCompany;
    }

    /**
     * Define el valor de la propiedad freigthCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreigthCompany(String value) {
        this.freigthCompany = value;
    }

}
