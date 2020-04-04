
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDComplexDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDComplexDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Detail" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ComplexDetail" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDComplexDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDComplexDetail", propOrder = {
    "heading",
    "detail",
    "complexDetail"
})
public class VerIDComplexDetail {

    @XmlElement(name = "Heading", required = true)
    protected String heading;
    @XmlElement(name = "Detail")
    protected List<VerIDDetail> detail;
    @XmlElement(name = "ComplexDetail")
    protected List<VerIDComplexDetail> complexDetail;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDDetail }
     * 
     * 
     */
    public List<VerIDDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<VerIDDetail>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the complexDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDComplexDetail }
     * 
     * 
     */
    public List<VerIDComplexDetail> getComplexDetail() {
        if (complexDetail == null) {
            complexDetail = new ArrayList<VerIDComplexDetail>();
        }
        return this.complexDetail;
    }

}
