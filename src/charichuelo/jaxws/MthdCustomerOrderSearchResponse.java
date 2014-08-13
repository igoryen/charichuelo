
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdCustomerOrderSearchResponse", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdCustomerOrderSearchResponse", namespace = "http://charichuelo/")
public class MthdCustomerOrderSearchResponse {

    @XmlElement(name = "CustomerOrderSearchResponse", namespace = "")
    private charichuelo.CustomerOrderSearchResponse customerOrderSearchResponse;

    /**
     * 
     * @return
     *     returns CustomerOrderSearchResponse
     */
    public charichuelo.CustomerOrderSearchResponse getCustomerOrderSearchResponse() {
        return this.customerOrderSearchResponse;
    }

    /**
     * 
     * @param customerOrderSearchResponse
     *     the value for the customerOrderSearchResponse property
     */
    public void setCustomerOrderSearchResponse(charichuelo.CustomerOrderSearchResponse customerOrderSearchResponse) {
        this.customerOrderSearchResponse = customerOrderSearchResponse;
    }

}
