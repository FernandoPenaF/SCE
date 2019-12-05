
package ejbenvios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejbenvios package. 
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

    private final static QName _FindRangeResponse_QNAME = new QName("http://ejbenvios/", "findRangeResponse");
    private final static QName _Find_QNAME = new QName("http://ejbenvios/", "find");
    private final static QName _AltaSolicitudDeEnvioResponse_QNAME = new QName("http://ejbenvios/", "altaSolicitudDeEnvioResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://ejbenvios/", "findAllResponse");
    private final static QName _Create_QNAME = new QName("http://ejbenvios/", "create");
    private final static QName _FindRange_QNAME = new QName("http://ejbenvios/", "findRange");
    private final static QName _Edit_QNAME = new QName("http://ejbenvios/", "edit");
    private final static QName _AltaSolicitudDeEnvio_QNAME = new QName("http://ejbenvios/", "altaSolicitudDeEnvio");
    private final static QName _CountResponse_QNAME = new QName("http://ejbenvios/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://ejbenvios/", "findResponse");
    private final static QName _Count_QNAME = new QName("http://ejbenvios/", "count");
    private final static QName _Remove_QNAME = new QName("http://ejbenvios/", "remove");
    private final static QName _Registro_QNAME = new QName("http://ejbenvios/", "registro");
    private final static QName _FindAll_QNAME = new QName("http://ejbenvios/", "findAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejbenvios
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link AltaSolicitudDeEnvio }
     * 
     */
    public AltaSolicitudDeEnvio createAltaSolicitudDeEnvio() {
        return new AltaSolicitudDeEnvio();
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
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link AltaSolicitudDeEnvioResponse }
     * 
     */
    public AltaSolicitudDeEnvioResponse createAltaSolicitudDeEnvioResponse() {
        return new AltaSolicitudDeEnvioResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaSolicitudDeEnvioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "altaSolicitudDeEnvioResponse")
    public JAXBElement<AltaSolicitudDeEnvioResponse> createAltaSolicitudDeEnvioResponse(AltaSolicitudDeEnvioResponse value) {
        return new JAXBElement<AltaSolicitudDeEnvioResponse>(_AltaSolicitudDeEnvioResponse_QNAME, AltaSolicitudDeEnvioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaSolicitudDeEnvio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "altaSolicitudDeEnvio")
    public JAXBElement<AltaSolicitudDeEnvio> createAltaSolicitudDeEnvio(AltaSolicitudDeEnvio value) {
        return new JAXBElement<AltaSolicitudDeEnvio>(_AltaSolicitudDeEnvio_QNAME, AltaSolicitudDeEnvio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "registro")
    public JAXBElement<Registro> createRegistro(Registro value) {
        return new JAXBElement<Registro>(_Registro_QNAME, Registro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejbenvios/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

}
