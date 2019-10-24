
package com.adictosaltrabajo.webservice.almacen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adictosaltrabajo.webservice.almacen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComprobarStockResponse_QNAME = new QName("http://almacen.webservice.adictosaltrabajo.com/", "comprobarStockResponse");
    private final static QName _ComprobarStock_QNAME = new QName("http://almacen.webservice.adictosaltrabajo.com/", "comprobarStock");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adictosaltrabajo.webservice.almacen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComprobarStock }
     * 
     */
    public ComprobarStock createComprobarStock() {
        return new ComprobarStock();
    }

    /**
     * Create an instance of {@link ComprobarStockResponse }
     * 
     */
    public ComprobarStockResponse createComprobarStockResponse() {
        return new ComprobarStockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://almacen.webservice.adictosaltrabajo.com/", name = "comprobarStockResponse")
    public JAXBElement<ComprobarStockResponse> createComprobarStockResponse(ComprobarStockResponse value) {
        return new JAXBElement<ComprobarStockResponse>(_ComprobarStockResponse_QNAME, ComprobarStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://almacen.webservice.adictosaltrabajo.com/", name = "comprobarStock")
    public JAXBElement<ComprobarStock> createComprobarStock(ComprobarStock value) {
        return new JAXBElement<ComprobarStock>(_ComprobarStock_QNAME, ComprobarStock.class, null, value);
    }

}
