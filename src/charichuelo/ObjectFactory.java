//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 08:36:31 PM EDT 
//


package charichuelo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the charichuelo package. 
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

    private final static QName _ProductCreateResponse_QNAME = new QName("", "productCreateResponse");
    private final static QName _CustomerOrderSearchResponse_QNAME = new QName("", "customerOrderSearchResponse");
    private final static QName _CustomerSearchRequest_QNAME = new QName("", "customerSearchRequest");
    private final static QName _ProductCreateRequest_QNAME = new QName("", "productCreateRequest");
    private final static QName _ProductUpdateRequest_QNAME = new QName("", "productUpdateRequest");
    private final static QName _CustomerOrderSearchRequest_QNAME = new QName("", "customerOrderSearchRequest");
    private final static QName _ProductUpdateResponse_QNAME = new QName("", "productUpdateResponse");
    private final static QName _CustomerSearchResponse_QNAME = new QName("", "customerSearchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: charichuelo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductCreateResponse }
     * 
     */
    public ProductCreateResponse createProductCreateResponse() {
        return new ProductCreateResponse();
    }

    /**
     * Create an instance of {@link CustomerOrderSearchResponse }
     * 
     */
    public CustomerOrderSearchResponse createCustomerOrderSearchResponse() {
        return new CustomerOrderSearchResponse();
    }

    /**
     * Create an instance of {@link CustomerSearchRequest }
     * 
     */
    public CustomerSearchRequest createCustomerSearchRequest() {
        return new CustomerSearchRequest();
    }

    /**
     * Create an instance of {@link ProductUpdateRequest }
     * 
     */
    public ProductUpdateRequest createProductUpdateRequest() {
        return new ProductUpdateRequest();
    }

    /**
     * Create an instance of {@link ProductCreateRequest }
     * 
     */
    public ProductCreateRequest createProductCreateRequest() {
        return new ProductCreateRequest();
    }

    /**
     * Create an instance of {@link CustomerOrderSearchRequest }
     * 
     */
    public CustomerOrderSearchRequest createCustomerOrderSearchRequest() {
        return new CustomerOrderSearchRequest();
    }

    /**
     * Create an instance of {@link ProductUpdateResponse }
     * 
     */
    public ProductUpdateResponse createProductUpdateResponse() {
        return new ProductUpdateResponse();
    }

    /**
     * Create an instance of {@link CustomerSearchResponse }
     * 
     */
    public CustomerSearchResponse createCustomerSearchResponse() {
        return new CustomerSearchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productCreateResponse")
    public JAXBElement<ProductCreateResponse> createProductCreateResponse(ProductCreateResponse value) {
        return new JAXBElement<ProductCreateResponse>(_ProductCreateResponse_QNAME, ProductCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerOrderSearchResponse")
    public JAXBElement<CustomerOrderSearchResponse> createCustomerOrderSearchResponse(CustomerOrderSearchResponse value) {
        return new JAXBElement<CustomerOrderSearchResponse>(_CustomerOrderSearchResponse_QNAME, CustomerOrderSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerSearchRequest")
    public JAXBElement<CustomerSearchRequest> createCustomerSearchRequest(CustomerSearchRequest value) {
        return new JAXBElement<CustomerSearchRequest>(_CustomerSearchRequest_QNAME, CustomerSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCreateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productCreateRequest")
    public JAXBElement<ProductCreateRequest> createProductCreateRequest(ProductCreateRequest value) {
        return new JAXBElement<ProductCreateRequest>(_ProductCreateRequest_QNAME, ProductCreateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductUpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productUpdateRequest")
    public JAXBElement<ProductUpdateRequest> createProductUpdateRequest(ProductUpdateRequest value) {
        return new JAXBElement<ProductUpdateRequest>(_ProductUpdateRequest_QNAME, ProductUpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrderSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerOrderSearchRequest")
    public JAXBElement<CustomerOrderSearchRequest> createCustomerOrderSearchRequest(CustomerOrderSearchRequest value) {
        return new JAXBElement<CustomerOrderSearchRequest>(_CustomerOrderSearchRequest_QNAME, CustomerOrderSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "productUpdateResponse")
    public JAXBElement<ProductUpdateResponse> createProductUpdateResponse(ProductUpdateResponse value) {
        return new JAXBElement<ProductUpdateResponse>(_ProductUpdateResponse_QNAME, ProductUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customerSearchResponse")
    public JAXBElement<CustomerSearchResponse> createCustomerSearchResponse(CustomerSearchResponse value) {
        return new JAXBElement<CustomerSearchResponse>(_CustomerSearchResponse_QNAME, CustomerSearchResponse.class, null, value);
    }

}
