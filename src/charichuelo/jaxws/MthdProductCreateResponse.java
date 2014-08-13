
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdProductCreateResponse", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdProductCreateResponse", namespace = "http://charichuelo/")
public class MthdProductCreateResponse {

    @XmlElement(name = "ProductCreateResponse", namespace = "")
    private charichuelo.ProductCreateResponse productCreateResponse;

    /**
     * 
     * @return
     *     returns ProductCreateResponse
     */
    public charichuelo.ProductCreateResponse getProductCreateResponse() {
        return this.productCreateResponse;
    }

    /**
     * 
     * @param productCreateResponse
     *     the value for the productCreateResponse property
     */
    public void setProductCreateResponse(charichuelo.ProductCreateResponse productCreateResponse) {
        this.productCreateResponse = productCreateResponse;
    }

}
