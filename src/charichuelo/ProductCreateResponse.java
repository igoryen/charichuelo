//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.14 at 01:58:23 AM EDT 
//


package charichuelo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductCreateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCreateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prd_product_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prd_product_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prd_supplier_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prd_product_price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="prd_book_isbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prd_book_author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prd_book_publication_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="prd_book_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prd_book_price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="prd_other_product_details" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCreateResponse", propOrder = {
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
public class ProductCreateResponse {

    @XmlElement(name = "prd_product_id")
    protected int prdProductId;
    @XmlElement(name = "prd_product_type_code", required = true)
    protected String prdProductTypeCode;
    @XmlElement(name = "prd_supplier_code", required = true)
    protected String prdSupplierCode;
    @XmlElement(name = "prd_product_price", required = true)
    protected BigDecimal prdProductPrice;
    @XmlElement(name = "prd_book_isbn", required = true)
    protected String prdBookIsbn;
    @XmlElement(name = "prd_book_author", required = true)
    protected String prdBookAuthor;
    @XmlElement(name = "prd_book_publication_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prdBookPublicationDate;
    @XmlElement(name = "prd_book_title", required = true)
    protected String prdBookTitle;
    @XmlElement(name = "prd_book_price", required = true)
    protected BigDecimal prdBookPrice;
    @XmlElement(name = "prd_other_product_details", required = true)
    protected String prdOtherProductDetails;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdProductTypeCode() {
        return prdProductTypeCode;
    }

    /**
     * Sets the value of the prdProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdProductTypeCode(String value) {
        this.prdProductTypeCode = value;
    }

    /**
     * Gets the value of the prdSupplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdSupplierCode() {
        return prdSupplierCode;
    }

    /**
     * Sets the value of the prdSupplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdSupplierCode(String value) {
        this.prdSupplierCode = value;
    }

    /**
     * Gets the value of the prdProductPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrdProductPrice() {
        return prdProductPrice;
    }

    /**
     * Sets the value of the prdProductPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrdProductPrice(BigDecimal value) {
        this.prdProductPrice = value;
    }

    /**
     * Gets the value of the prdBookIsbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdBookIsbn() {
        return prdBookIsbn;
    }

    /**
     * Sets the value of the prdBookIsbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdBookIsbn(String value) {
        this.prdBookIsbn = value;
    }

    /**
     * Gets the value of the prdBookAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdBookAuthor() {
        return prdBookAuthor;
    }

    /**
     * Sets the value of the prdBookAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdBookAuthor(String value) {
        this.prdBookAuthor = value;
    }

    /**
     * Gets the value of the prdBookPublicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrdBookPublicationDate() {
        return prdBookPublicationDate;
    }

    /**
     * Sets the value of the prdBookPublicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrdBookPublicationDate(XMLGregorianCalendar value) {
        this.prdBookPublicationDate = value;
    }

    /**
     * Gets the value of the prdBookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdBookTitle() {
        return prdBookTitle;
    }

    /**
     * Sets the value of the prdBookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdBookTitle(String value) {
        this.prdBookTitle = value;
    }

    /**
     * Gets the value of the prdBookPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrdBookPrice() {
        return prdBookPrice;
    }

    /**
     * Sets the value of the prdBookPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrdBookPrice(BigDecimal value) {
        this.prdBookPrice = value;
    }

    /**
     * Gets the value of the prdOtherProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdOtherProductDetails() {
        return prdOtherProductDetails;
    }

    /**
     * Sets the value of the prdOtherProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdOtherProductDetails(String value) {
        this.prdOtherProductDetails = value;
    }

}
