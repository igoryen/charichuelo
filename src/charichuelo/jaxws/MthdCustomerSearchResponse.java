
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdCustomerSearchResponse", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdCustomerSearchResponse", namespace = "http://charichuelo/")
public class MthdCustomerSearchResponse {

    @XmlElement(name = "CustomerSearchResponse", namespace = "")
    private charichuelo.CustomerSearchResponse customerSearchResponse;

    /**
     * 
     * @return
     *     returns CustomerSearchResponse
     */
    public charichuelo.CustomerSearchResponse getCustomerSearchResponse() {
        return this.customerSearchResponse;
    }

    /**
     * 
     * @param customerSearchResponse
     *     the value for the customerSearchResponse property
     */
    public void setCustomerSearchResponse(charichuelo.CustomerSearchResponse customerSearchResponse) {
        this.customerSearchResponse = customerSearchResponse;
    }

}
