
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdProductCreate", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdProductCreate", namespace = "http://charichuelo/")
public class MthdProductCreate {

    @XmlElement(name = "ProductCreateRequest", namespace = "")
    private charichuelo.ProductCreateRequest productCreateRequest;

    /**
     * 
     * @return
     *     returns ProductCreateRequest
     */
    public charichuelo.ProductCreateRequest getProductCreateRequest() {
        return this.productCreateRequest;
    }

    /**
     * 
     * @param productCreateRequest
     *     the value for the productCreateRequest property
     */
    public void setProductCreateRequest(charichuelo.ProductCreateRequest productCreateRequest) {
        this.productCreateRequest = productCreateRequest;
    }

}
