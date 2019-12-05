
package ejbenvios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para registro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entregaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaEntregado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaPrometida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ordenCompra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registro", propOrder = {
    "customerId",
    "entregaId",
    "fechaEntregado",
    "fechaPrometida",
    "ordenCompra",
    "status"
})
public class Registro {

    protected int customerId;
    protected Integer entregaId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEntregado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPrometida;
    protected int ordenCompra;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer status;

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
     * Obtiene el valor de la propiedad entregaId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntregaId() {
        return entregaId;
    }

    /**
     * Define el valor de la propiedad entregaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntregaId(Integer value) {
        this.entregaId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntregado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEntregado() {
        return fechaEntregado;
    }

    /**
     * Define el valor de la propiedad fechaEntregado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEntregado(XMLGregorianCalendar value) {
        this.fechaEntregado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPrometida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPrometida() {
        return fechaPrometida;
    }

    /**
     * Define el valor de la propiedad fechaPrometida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPrometida(XMLGregorianCalendar value) {
        this.fechaPrometida = value;
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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}
