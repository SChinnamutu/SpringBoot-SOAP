
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Mobile Enrollment operation.
 * 										Properties:
 * 										TAMUID: The user ID to run the operation on.
 * 										EnrollType: TCID,PIN,QKBL
 * 										MobileToken: 
 * 										MobileID: TrusteerID, MFP UserID.
 * 										SAML: Authenication Method
 * 					
 * 
 * <p>Java class for MobileEnrollment complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileEnrollment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EnrollType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MobileToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MobileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SAML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileEnrollment", propOrder = {
    "tamuid",
    "enrollType",
    "mobileToken",
    "mobileID",
    "saml"
})
public class MobileEnrollment
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "EnrollType", required = true)
    protected String enrollType;
    @XmlElement(name = "MobileToken", required = true)
    protected String mobileToken;
    @XmlElement(name = "MobileID", required = true)
    protected String mobileID;
    @XmlElement(name = "SAML")
    protected String saml;

    /**
     * Gets the value of the tamuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMUID() {
        return tamuid;
    }

    /**
     * Sets the value of the tamuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMUID(String value) {
        this.tamuid = value;
    }

    /**
     * Gets the value of the enrollType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollType() {
        return enrollType;
    }

    /**
     * Sets the value of the enrollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollType(String value) {
        this.enrollType = value;
    }

    /**
     * Gets the value of the mobileToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileToken() {
        return mobileToken;
    }

    /**
     * Sets the value of the mobileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileToken(String value) {
        this.mobileToken = value;
    }

    /**
     * Gets the value of the mobileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileID() {
        return mobileID;
    }

    /**
     * Sets the value of the mobileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileID(String value) {
        this.mobileID = value;
    }

    /**
     * Gets the value of the saml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAML() {
        return saml;
    }

    /**
     * Sets the value of the saml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAML(String value) {
        this.saml = value;
    }

}
