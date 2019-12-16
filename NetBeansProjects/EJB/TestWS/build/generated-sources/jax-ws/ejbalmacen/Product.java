
package ejbalmacen;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerId" type="{http://ejbalmacen/}manufacturer" minOccurs="0"/>
 *         &lt;element name="markup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://ejbalmacen/}productCode" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="purchaseCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "available",
    "description",
    "manufacturerId",
    "markup",
    "productCode",
    "productId",
    "purchaseCost",
    "quantityOnHand"
})
public class Product {

    protected String available;
    protected String description;
    protected Manufacturer manufacturerId;
    protected BigDecimal markup;
    protected ProductCode productCode;
    protected Integer productId;
    protected BigDecimal purchaseCost;
    protected Integer quantityOnHand;

    /**
     * Obtiene el valor de la propiedad available.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailable(String value) {
        this.available = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad manufacturerId.
     * 
     * @return
     *     possible object is
     *     {@link Manufacturer }
     *     
     */
    public Manufacturer getManufacturerId() {
        return manufacturerId;
    }

    /**
     * Define el valor de la propiedad manufacturerId.
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturer }
     *     
     */
    public void setManufacturerId(Manufacturer value) {
        this.manufacturerId = value;
    }

    /**
     * Obtiene el valor de la propiedad markup.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Define el valor de la propiedad markup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link ProductCode }
     *     
     */
    public ProductCode getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCode }
     *     
     */
    public void setProductCode(ProductCode value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Define el valor de la propiedad purchaseCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPurchaseCost(BigDecimal value) {
        this.purchaseCost = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityOnHand.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Define el valor de la propiedad quantityOnHand.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityOnHand(Integer value) {
        this.quantityOnHand = value;
    }

}
