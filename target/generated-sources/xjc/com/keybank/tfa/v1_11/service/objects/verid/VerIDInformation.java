
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InformationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "VerIDInformation", propOrder = {
    "informationCode",
    "detailCode",
    "detailDescription",
    "detail",
    "complexDetail"
})
public class VerIDInformation {

    @XmlElement(name = "InformationCode", required = true)
    protected String informationCode;
    @XmlElement(name = "DetailCode", required = true)
    protected String detailCode;
    @XmlElement(name = "DetailDescription", required = true)
    protected String detailDescription;
    @XmlElement(name = "Detail")
    protected List<VerIDDetail> detail;
    @XmlElement(name = "ComplexDetail")
    protected List<VerIDComplexDetail> complexDetail;

    /**
     * Gets the value of the informationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationCode() {
        return informationCode;
    }

    /**
     * Sets the value of the informationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationCode(String value) {
        this.informationCode = value;
    }

    /**
     * Gets the value of the detailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Sets the value of the detailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailCode(String value) {
        this.detailCode = value;
    }

    /**
     * Gets the value of the detailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailDescription() {
        return detailDescription;
    }

    /**
     * Sets the value of the detailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailDescription(String value) {
        this.detailDescription = value;
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
