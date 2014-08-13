
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdCustomerOrderSearch", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdCustomerOrderSearch", namespace = "http://charichuelo/")
public class MthdCustomerOrderSearch {

    @XmlElement(name = "CustomerOrderSearchRequest", namespace = "")
    private charichuelo.CustomerOrderSearchRequest customerOrderSearchRequest;

    /**
     * 
     * @return
     *     returns CustomerOrderSearchRequest
     */
    public charichuelo.CustomerOrderSearchRequest getCustomerOrderSearchRequest() {
        return this.customerOrderSearchRequest;
    }

    /**
     * 
     * @param customerOrderSearchRequest
     *     the value for the customerOrderSearchRequest property
     */
    public void setCustomerOrderSearchRequest(charichuelo.CustomerOrderSearchRequest customerOrderSearchRequest) {
        this.customerOrderSearchRequest = customerOrderSearchRequest;
    }

}
