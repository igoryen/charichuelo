//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 07:44:43 PM EDT 
//


package charichuelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerOrderSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cor_order_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cor_customer_id" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cor_customer_payment_method_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cor_order_status_code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="cor_date_order_placed" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
 *         &lt;element name="cor_date_order_paid" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cor_der_total_order_price" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded"/>
 *         &lt;element name="cor_other_order_details" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderSearchRequest", propOrder = {
    "corOrderId",
    "corCustomerId",
    "corCustomerPaymentMethodId",
    "corOrderStatusCode",
    "corDateOrderPlaced",
    "corDateOrderPaid",
    "corDerTotalOrderPrice",
    "corOtherOrderDetails"
})
public class CustomerOrderSearchRequest {

    @XmlElement(name = "cor_order_id")
    protected int corOrderId;
    @XmlElement(name = "cor_customer_id", type = Integer.class)
    protected List<Integer> corCustomerId;
    @XmlElement(name = "cor_customer_payment_method_id")
    protected List<String> corCustomerPaymentMethodId;
    @XmlElement(name = "cor_order_status_code", required = true)
    protected List<String> corOrderStatusCode;
    @XmlElement(name = "cor_date_order_placed", required = true)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> corDateOrderPlaced;
    @XmlElement(name = "cor_date_order_paid")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> corDateOrderPaid;
    @XmlElement(name = "cor_der_total_order_price", required = true)
    protected List<BigDecimal> corDerTotalOrderPrice;
    @XmlElement(name = "cor_other_order_details")
    protected List<String> corOtherOrderDetails;

    /**
     * Gets the value of the corOrderId property.
     * 
     */
    public int getCorOrderId() {
        return corOrderId;
    }

    /**
     * Sets the value of the corOrderId property.
     * 
     */
    public void setCorOrderId(int value) {
        this.corOrderId = value;
    }

    /**
     * Gets the value of the corCustomerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corCustomerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorCustomerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCorCustomerId() {
        if (corCustomerId == null) {
            corCustomerId = new ArrayList<Integer>();
        }
        return this.corCustomerId;
    }

    /**
     * Gets the value of the corCustomerPaymentMethodId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corCustomerPaymentMethodId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorCustomerPaymentMethodId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorCustomerPaymentMethodId() {
        if (corCustomerPaymentMethodId == null) {
            corCustomerPaymentMethodId = new ArrayList<String>();
        }
        return this.corCustomerPaymentMethodId;
    }

    /**
     * Gets the value of the corOrderStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corOrderStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorOrderStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorOrderStatusCode() {
        if (corOrderStatusCode == null) {
            corOrderStatusCode = new ArrayList<String>();
        }
        return this.corOrderStatusCode;
    }

    /**
     * Gets the value of the corDateOrderPlaced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corDateOrderPlaced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorDateOrderPlaced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getCorDateOrderPlaced() {
        if (corDateOrderPlaced == null) {
            corDateOrderPlaced = new ArrayList<XMLGregorianCalendar>();
        }
        return this.corDateOrderPlaced;
    }

    /**
     * Gets the value of the corDateOrderPaid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corDateOrderPaid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorDateOrderPaid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getCorDateOrderPaid() {
        if (corDateOrderPaid == null) {
            corDateOrderPaid = new ArrayList<XMLGregorianCalendar>();
        }
        return this.corDateOrderPaid;
    }

    /**
     * Gets the value of the corDerTotalOrderPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corDerTotalOrderPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorDerTotalOrderPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCorDerTotalOrderPrice() {
        if (corDerTotalOrderPrice == null) {
            corDerTotalOrderPrice = new ArrayList<BigDecimal>();
        }
        return this.corDerTotalOrderPrice;
    }

    /**
     * Gets the value of the corOtherOrderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corOtherOrderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorOtherOrderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorOtherOrderDetails() {
        if (corOtherOrderDetails == null) {
            corOtherOrderDetails = new ArrayList<String>();
        }
        return this.corOtherOrderDetails;
    }

}
