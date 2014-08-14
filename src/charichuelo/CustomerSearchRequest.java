//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 08:36:31 PM EDT 
//


package charichuelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cst_customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cst_first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cst_middle_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cst_last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cst_customer_phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cst_customer_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cst_other_customer_details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSearchRequest", propOrder = {
    "cstCustomerId",
    "cstFirstName",
    "cstMiddleName",
    "cstLastName",
    "cstCustomerPhone",
    "cstCustomerEmail",
    "cstOtherCustomerDetails"
})
public class CustomerSearchRequest {

    @XmlElement(name = "cst_customer_id")
    protected int cstCustomerId;
    @XmlElement(name = "cst_first_name", required = true)
    protected String cstFirstName;
    @XmlElement(name = "cst_middle_name", required = true)
    protected String cstMiddleName;
    @XmlElement(name = "cst_last_name", required = true)
    protected String cstLastName;
    @XmlElement(name = "cst_customer_phone", required = true)
    protected String cstCustomerPhone;
    @XmlElement(name = "cst_customer_email", required = true)
    protected String cstCustomerEmail;
    @XmlElement(name = "cst_other_customer_details", required = true)
    protected String cstOtherCustomerDetails;

    /**
     * Gets the value of the cstCustomerId property.
     * 
     */
    public int getCstCustomerId() {
        return cstCustomerId;
    }

    /**
     * Sets the value of the cstCustomerId property.
     * 
     */
    public void setCstCustomerId(int value) {
        this.cstCustomerId = value;
    }

    /**
     * Gets the value of the cstFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstFirstName() {
        return cstFirstName;
    }

    /**
     * Sets the value of the cstFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstFirstName(String value) {
        this.cstFirstName = value;
    }

    /**
     * Gets the value of the cstMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstMiddleName() {
        return cstMiddleName;
    }

    /**
     * Sets the value of the cstMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstMiddleName(String value) {
        this.cstMiddleName = value;
    }

    /**
     * Gets the value of the cstLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstLastName() {
        return cstLastName;
    }

    /**
     * Sets the value of the cstLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstLastName(String value) {
        this.cstLastName = value;
    }

    /**
     * Gets the value of the cstCustomerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstCustomerPhone() {
        return cstCustomerPhone;
    }

    /**
     * Sets the value of the cstCustomerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstCustomerPhone(String value) {
        this.cstCustomerPhone = value;
    }

    /**
     * Gets the value of the cstCustomerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstCustomerEmail() {
        return cstCustomerEmail;
    }

    /**
     * Sets the value of the cstCustomerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstCustomerEmail(String value) {
        this.cstCustomerEmail = value;
    }

    /**
     * Gets the value of the cstOtherCustomerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstOtherCustomerDetails() {
        return cstOtherCustomerDetails;
    }

    /**
     * Sets the value of the cstOtherCustomerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstOtherCustomerDetails(String value) {
        this.cstOtherCustomerDetails = value;
    }

}
