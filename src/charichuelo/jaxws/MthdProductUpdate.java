
package charichuelo.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mthdProductUpdate", namespace = "http://charichuelo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mthdProductUpdate", namespace = "http://charichuelo/")
public class MthdProductUpdate {

    @XmlElement(name = "ProductUpdateRequest", namespace = "")
    private charichuelo.ProductUpdateRequest productUpdateRequest;

    /**
     * 
     * @return
     *     returns ProductUpdateRequest
     */
    public charichuelo.ProductUpdateRequest getProductUpdateRequest() {
        return this.productUpdateRequest;
    }

    /**
     * 
     * @param productUpdateRequest
     *     the value for the productUpdateRequest property
     */
    public void setProductUpdateRequest(charichuelo.ProductUpdateRequest productUpdateRequest) {
        this.productUpdateRequest = productUpdateRequest;
    }

}
