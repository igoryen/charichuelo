//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.13 at 07:04:57 PM EDT 
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
 * <p>Java class for ProductUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUpdateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prd_product_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prd_product_type_code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="prd_supplier_code" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="prd_product_price" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded"/>
 *         &lt;element name="prd_book_isbn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="prd_book_author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="prd_book_publication_date" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
 *         &lt;element name="prd_book_title" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="prd_book_price" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prd_other_product_details" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUpdateResponse", propOrder = {
    "prdProductId",
    "prdProductTypeCode",
    "prdSupplierCode",
    "prdProductPrice",
    "prdBookIsbn",
    "prdBookAuthor",
    "prdBookPublicationDate",
    "prdBookTitle",
    "prdBookPrice",
    "prdOtherProductDetails"
})
public class ProductUpdateResponse {

    @XmlElement(name = "prd_product_id")
    protected int prdProductId;
    @XmlElement(name = "prd_product_type_code", required = true)
    protected List<String> prdProductTypeCode;
    @XmlElement(name = "prd_supplier_code", required = true)
    protected List<String> prdSupplierCode;
    @XmlElement(name = "prd_product_price", required = true)
    protected List<BigDecimal> prdProductPrice;
    @XmlElement(name = "prd_book_isbn", required = true)
    protected List<String> prdBookIsbn;
    @XmlElement(name = "prd_book_author", required = true)
    protected List<String> prdBookAuthor;
    @XmlElement(name = "prd_book_publication_date", required = true)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> prdBookPublicationDate;
    @XmlElement(name = "prd_book_title", required = true)
    protected List<String> prdBookTitle;
    @XmlElement(name = "prd_book_price")
    protected List<BigDecimal> prdBookPrice;
    @XmlElement(name = "prd_other_product_details")
    protected List<String> prdOtherProductDetails;

    /**
     * Gets the value of the prdProductId property.
     * 
     */
    public int getPrdProductId() {
        return prdProductId;
    }

    /**
     * Sets the value of the prdProductId property.
     * 
     */
    public void setPrdProductId(int value) {
        this.prdProductId = value;
    }

    /**
     * Gets the value of the prdProductTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdProductTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdProductTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdProductTypeCode() {
        if (prdProductTypeCode == null) {
            prdProductTypeCode = new ArrayList<String>();
        }
        return this.prdProductTypeCode;
    }

    /**
     * Gets the value of the prdSupplierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdSupplierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdSupplierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdSupplierCode() {
        if (prdSupplierCode == null) {
            prdSupplierCode = new ArrayList<String>();
        }
        return this.prdSupplierCode;
    }

    /**
     * Gets the value of the prdProductPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdProductPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdProductPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getPrdProductPrice() {
        if (prdProductPrice == null) {
            prdProductPrice = new ArrayList<BigDecimal>();
        }
        return this.prdProductPrice;
    }

    /**
     * Gets the value of the prdBookIsbn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdBookIsbn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdBookIsbn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdBookIsbn() {
        if (prdBookIsbn == null) {
            prdBookIsbn = new ArrayList<String>();
        }
        return this.prdBookIsbn;
    }

    /**
     * Gets the value of the prdBookAuthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdBookAuthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdBookAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdBookAuthor() {
        if (prdBookAuthor == null) {
            prdBookAuthor = new ArrayList<String>();
        }
        return this.prdBookAuthor;
    }

    /**
     * Gets the value of the prdBookPublicationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdBookPublicationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdBookPublicationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getPrdBookPublicationDate() {
        if (prdBookPublicationDate == null) {
            prdBookPublicationDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.prdBookPublicationDate;
    }

    /**
     * Gets the value of the prdBookTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdBookTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdBookTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdBookTitle() {
        if (prdBookTitle == null) {
            prdBookTitle = new ArrayList<String>();
        }
        return this.prdBookTitle;
    }

    /**
     * Gets the value of the prdBookPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdBookPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdBookPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getPrdBookPrice() {
        if (prdBookPrice == null) {
            prdBookPrice = new ArrayList<BigDecimal>();
        }
        return this.prdBookPrice;
    }

    /**
     * Gets the value of the prdOtherProductDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prdOtherProductDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrdOtherProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrdOtherProductDetails() {
        if (prdOtherProductDetails == null) {
            prdOtherProductDetails = new ArrayList<String>();
        }
        return this.prdOtherProductDetails;
    }

}
