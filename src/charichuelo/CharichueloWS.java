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
  
  @WebMethod
  @WebResult(name = "CustomerSearchResponse")
  public CustomerSearchResponse mthdCustomerSearch(@WebParam(name = "CustomerSearchRequest") CustomerSearchRequest request) {
    ObjectFactory objFactory = new ObjectFactory();
    CustomerSearchResponse response = objFactory.createCustomerSearchResponse();
    response.setCstCustomerId(request.getCstCustomerId());
    return response;
  }
  
  @WebMethod
  @WebResult(name = "CustomerOrderSearchResponse")
  public CustomerOrderSearchResponse mthdCustomerOrderSearch(@WebParam(name = "CustomerOrderSearchRequest") CustomerOrderSearchRequest request) {
    ObjectFactory objFactory = new ObjectFactory();
    CustomerOrderSearchResponse response = objFactory.createCustomerOrderSearchResponse();
    response.setCorOrderId(request.getCorOrderId());
    return response;
  }
  
}
