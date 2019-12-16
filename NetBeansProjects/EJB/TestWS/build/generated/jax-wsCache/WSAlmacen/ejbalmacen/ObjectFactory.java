
package ejbalmacen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejbalmacen package. 
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

    private final static QName _Product_QNAME = new QName("http://ejbalmacen/", "product");
    private final static QName _Edit_QNAME = new QName("http://ejbalmacen/", "edit");
    private final static QName _FindRange_QNAME = new QName("http://ejbalmacen/", "findRange");
    private final static QName _Count_QNAME = new QName("http://ejbalmacen/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://ejbalmacen/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://ejbalmacen/", "findResponse");
    private final static QName _FindAll_QNAME = new QName("http://ejbalmacen/", "findAll");
    private final static QName _Remove_QNAME = new QName("http://ejbalmacen/", "remove");
    private final static QName _Manufacturer_QNAME = new QName("http://ejbalmacen/", "manufacturer");
    private final static QName _FindRangeResponse_QNAME = new QName("http://ejbalmacen/", "findRangeResponse");
    private final static QName _ProductCode_QNAME = new QName("http://ejbalmacen/", "productCode");
    private final static QName _MontoVtayDescuentaExistencia_QNAME = new QName("http://ejbalmacen/", "MontoVtayDescuentaExistencia");
    private final static QName _Find_QNAME = new QName("http://ejbalmacen/", "find");
    private final static QName _MontoVtayDescuentaExistenciaResponse_QNAME = new QName("http://ejbalmacen/", "MontoVtayDescuentaExistenciaResponse");
    private final static QName _ReverseaDescuentaExistenciaResponse_QNAME = new QName("http://ejbalmacen/", "ReverseaDescuentaExistenciaResponse");
    private final static QName _Create_QNAME = new QName("http://ejbalmacen/", "create");
    private final static QName _FindAllResponse_QNAME = new QName("http://ejbalmacen/", "findAllResponse");
    private final static QName _ReverseaDescuentaExistencia_QNAME = new QName("http://ejbalmacen/", "ReverseaDescuentaExistencia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejbalmacen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link Manufacturer }
     * 
     */
    public Manufacturer createManufacturer() {
        return new Manufacturer();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link ProductCode }
     * 
     */
    public ProductCode createProductCode() {
        return new ProductCode();
    }

    /**
     * Create an instance of {@link MontoVtayDescuentaExistencia }
     * 
     */
    public MontoVtayDescuentaExistencia createMontoVtayDescuentaExistencia() {
        return new MontoVtayDescuentaExistencia();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link MontoVtayDescuentaExistenciaResponse }
     * 
     */
    public MontoVtayDescuentaExistenciaResponse createMontoVtayDescuentaExistenciaResponse() {
        return new MontoVtayDescuentaExistenciaResponse();
    }

    /**
     * Create an instance of {@link ReverseaDescuentaExistenciaResponse }
     * 
     */
    public ReverseaDescuentaExistenciaResponse createReverseaDescuentaExistenciaResponse() {
        return new ReverseaDescuentaExistenciaResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link ReverseaDescuentaExistencia }
     * 
     */
    public ReverseaDescuentaExistencia createReverseaDescuentaExistencia() {
        return new ReverseaDescuentaExistencia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "manufacturer")
    public JAXBElement<Manufacturer> createManufacturer(Manufacturer value) {
        return new JAXBElement<Manufacturer>(_Manufacturer_QNAME, Manufacturer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "productCode")
    public JAXBElement<ProductCode> createProductCode(ProductCode value) {
        return new JAXBElement<ProductCode>(_ProductCode_QNAME, ProductCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontoVtayDescuentaExistencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "MontoVtayDescuentaExistencia")
    public JAXBElement<MontoVtayDescuentaExistencia> createMontoVtayDescuentaExistencia(MontoVtayDescuentaExistencia value) {
        return new JAXBElement<MontoVtayDescuentaExistencia>(_MontoVtayDescuentaExistencia_QNAME, MontoVtayDescuentaExistencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontoVtayDescuentaExistenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "MontoVtayDescuentaExistenciaResponse")
    public JAXBElement<MontoVtayDescuentaExistenciaResponse> createMontoVtayDescuentaExistenciaResponse(MontoVtayDescuentaExistenciaResponse value) {
        return new JAXBElement<MontoVtayDescuentaExistenciaResponse>(_MontoVtayDescuentaExistenciaResponse_QNAME, MontoVtayDescuentaExistenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseaDescuentaExistenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "ReverseaDescuentaExistenciaResponse")
    public JAXBElement<ReverseaDescuentaExistenciaResponse> createReverseaDescuentaExistenciaResponse(ReverseaDescuentaExistenciaResponse value) {
        return new JAXBElement<ReverseaDescuentaExistenciaResponse>(_ReverseaDescuentaExistenciaResponse_QNAME, ReverseaDescuentaExistenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReverseaDescuentaExistencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbalmacen/", name = "ReverseaDescuentaExistencia")
    public JAXBElement<ReverseaDescuentaExistencia> createReverseaDescuentaExistencia(ReverseaDescuentaExistencia value) {
        return new JAXBElement<ReverseaDescuentaExistencia>(_ReverseaDescuentaExistencia_QNAME, ReverseaDescuentaExistencia.class, null, value);
    }

}
