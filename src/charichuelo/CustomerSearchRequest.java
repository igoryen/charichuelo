//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 06:29:29 PM EDT 
//


package charichuelo;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="cst_first_name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="cst_middle_name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cst_last_name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="cst_customer_phone" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cst_customer_email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cst_other_customer_details" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    protected List<String> cstFirstName;
    @XmlElement(name = "cst_middle_name")
    protected List<String> cstMiddleName;
    @XmlElement(name = "cst_last_name", required = true)
    protected List<String> cstLastName;
    @XmlElement(name = "cst_customer_phone")
    protected List<String> cstCustomerPhone;
    @XmlElement(name = "cst_customer_email")
    protected List<String> cstCustomerEmail;
    @XmlElement(name = "cst_other_customer_details")
    protected List<String> cstOtherCustomerDetails;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstFirstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstFirstName() {
        if (cstFirstName == null) {
            cstFirstName = new ArrayList<String>();
        }
        return this.cstFirstName;
    }

    /**
     * Gets the value of the cstMiddleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstMiddleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstMiddleName() {
        if (cstMiddleName == null) {
            cstMiddleName = new ArrayList<String>();
        }
        return this.cstMiddleName;
    }

    /**
     * Gets the value of the cstLastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstLastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstLastName() {
        if (cstLastName == null) {
            cstLastName = new ArrayList<String>();
        }
        return this.cstLastName;
    }

    /**
     * Gets the value of the cstCustomerPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstCustomerPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstCustomerPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstCustomerPhone() {
        if (cstCustomerPhone == null) {
            cstCustomerPhone = new ArrayList<String>();
        }
        return this.cstCustomerPhone;
    }

    /**
     * Gets the value of the cstCustomerEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstCustomerEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstCustomerEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstCustomerEmail() {
        if (cstCustomerEmail == null) {
            cstCustomerEmail = new ArrayList<String>();
        }
        return this.cstCustomerEmail;
    }

    /**
     * Gets the value of the cstOtherCustomerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstOtherCustomerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstOtherCustomerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCstOtherCustomerDetails() {
        if (cstOtherCustomerDetails == null) {
            cstOtherCustomerDetails = new ArrayList<String>();
        }
        return this.cstOtherCustomerDetails;
    }

}
