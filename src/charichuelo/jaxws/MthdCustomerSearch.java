
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdCustomerSearch", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdCustomerSearch", namespace = "http://charichuelo/")
public class MthdCustomerSearch {

    @XmlElement(name = "CustomerSearchRequest", namespace = "")
    private charichuelo.CustomerSearchRequest customerSearchRequest;

    /**
     * 
     * @return
     *     returns CustomerSearchRequest
     */
    public charichuelo.CustomerSearchRequest getCustomerSearchRequest() {
        return this.customerSearchRequest;
    }

    /**
     * 
     * @param customerSearchRequest
     *     the value for the customerSearchRequest property
     */
    public void setCustomerSearchRequest(charichuelo.CustomerSearchRequest customerSearchRequest) {
        this.customerSearchRequest = customerSearchRequest;
    }

}
