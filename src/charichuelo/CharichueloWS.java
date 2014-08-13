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
    return response;
  }
  
  // CustomerOrderSearch()
  
  @WebMethod
  @WebResult(name = "CustomerOrderSearchResponse")
  public CustomerOrderSearchResponse mthdCustomerOrderSearch(@WebParam(name = "CustomerOrderSearchRequest") CustomerOrderSearchRequest request) {
    CustomerOrderSearchResponse response = objFactory.createCustomerOrderSearchResponse();
    response.setCorOrderId(request.getCorOrderId());
    return response;
  }
  
  // ProductCreate()
  
  @WebMethod
  @WebResult(name = "ProductCreateResponse")
  public ProductCreateResponse mthdProductCreate(@WebParam(name = "ProductCreateRequest") ProductCreateRequest request) {
    ProductCreateResponse response = objFactory.createProductCreateResponse();
    response.setPrdProductId(request.getPrdProductId());
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
