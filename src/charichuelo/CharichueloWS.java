package charichuelo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(
    style = SOAPBinding.Style.DOCUMENT, 
    use = SOAPBinding.Use.LITERAL, 
    parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CharichueloWS {
  
  ObjectFactory objFactory = new ObjectFactory();
  
  // CustomerSearch()
  
  @WebMethod
  @WebResult(name = "CustomerSearchResponse")
  public CustomerSearchResponse mthdCustomerSearch(@WebParam(name = "CustomerSearchRequest") CustomerSearchRequest request) {
    CustomerSearchResponse response = objFactory.createCustomerSearchResponse();
    response.setCstCustomerId(request.getCstCustomerId());
    response.setCstFirstName(request.getCstFirstName());
    response.setCstMiddleName(request.getCstMiddleName());
    response.setCstLastName(request.getCstLastName());
    response.setCstCustomerPhone(request.getCstCustomerPhone());
    response.setCstCustomerEmail(request.getCstCustomerEmail());
    response.setCstOtherCustomerDetails(request.getCstOtherCustomerDetails());
    return response;
  }
  
  // CustomerOrderSearch()
  
  @WebMethod
  @WebResult(name = "CustomerOrderSearchResponse")
  public CustomerOrderSearchResponse mthdCustomerOrderSearch(@WebParam(name = "CustomerOrderSearchRequest") CustomerOrderSearchRequest request) {
    CustomerOrderSearchResponse response = objFactory.createCustomerOrderSearchResponse();
    response.setCorOrderId(request.getCorOrderId());
    response.setCorCustomerId(request.getCorCustomerId());
    response.setCorCustomerPaymentMethodId(request.getCorCustomerPaymentMethodId());
    response.setCorOrderStatusCode(request.getCorOrderStatusCode());
    response.setCorDateOrderPlaced(request.getCorDateOrderPlaced());
    response.setCorDateOrderPaid(request.getCorDateOrderPaid());
    response.setCorDerTotalOrderPrice(request.getCorDerTotalOrderPrice());
    response.setCorOtherOrderDetails(request.getCorOtherOrderDetails());
    return response;
  }
  
  // ProductCreate()
  
  @WebMethod
  @WebResult(name = "ProductCreateResponse")
  public ProductCreateResponse mthdProductCreate(@WebParam(name = "ProductCreateRequest") ProductCreateRequest request) {
    ProductCreateResponse response = objFactory.createProductCreateResponse();
    response.setPrdProductId(request.getPrdProductId());
    response.setPrdProductTypeCode(request.getPrdProductTypeCode());
    response.setPrdProductPrice(request.getPrdProductPrice());
    response.setPrdBookIsbn(request.getPrdBookIsbn());
    response.setPrdBookAuthor(request.getPrdBookAuthor());
    response.setPrdBookPublicationDate(request.getPrdBookPublicationDate());
    response.setPrdBookTitle(request.getPrdBookTitle());
    response.setPrdBookPrice(request.getPrdBookPrice());
    response.setPrdOtherProductDetails(request.getPrdOtherProductDetails());
    return response;
  }
  
//ProductUpdate()
  
 @WebMethod
 @WebResult(name = "ProductUpdateResponse")
 public ProductUpdateResponse mthdProductUpdate(@WebParam(name = "ProductUpdateRequest") ProductUpdateRequest request) {
   ProductUpdateResponse response = objFactory.createProductUpdateResponse();
   response.setPrdProductId(request.getPrdProductId());
   return response;
 }
  
}
