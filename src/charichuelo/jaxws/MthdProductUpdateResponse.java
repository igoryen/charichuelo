
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdProductUpdateResponse", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdProductUpdateResponse", namespace = "http://charichuelo/")
public class MthdProductUpdateResponse {

    @XmlElement(name = "ProductUpdateResponse", namespace = "")
    private charichuelo.ProductUpdateResponse productUpdateResponse;

    /**
     * 
     * @return
     *     returns ProductUpdateResponse
     */
    public charichuelo.ProductUpdateResponse getProductUpdateResponse() {
        return this.productUpdateResponse;
    }

    /**
     * 
     * @param productUpdateResponse
     *     the value for the productUpdateResponse property
     */
    public void setProductUpdateResponse(charichuelo.ProductUpdateResponse productUpdateResponse) {
        this.productUpdateResponse = productUpdateResponse;
    }

}
