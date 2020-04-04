
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.AdditionalMobileDeviceInfo;
import com.keybank.tfa.v1_11.service.objects.MobileDeviceInfo;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Mobile Registration operation.
 * 										Properties:
 * 										TAMUID: The user ID to run the operation on.
 * 										SAML: Authentication Method
 * 										MobileDeviceInfo: A set of mobile device forensics to register for the user.
 * 					
 * 
 * <p>Java class for MobileRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SAML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceInfo" type="{http://tfa.keybank.com/v1_11/service/objects}MobileDeviceInfo"/&gt;
 *         &lt;element name="AdditionalMobileDeviceInfo" type="{http://tfa.keybank.com/v1_11/service/objects}AdditionalMobileDeviceInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileRegistration", propOrder = {
    "tamuid",
    "currentPassword",
    "saml",
    "mobileDeviceInfo",
    "additionalMobileDeviceInfo"
})
public class MobileRegistration
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "CurrentPassword", required = true)
    protected String currentPassword;
    @XmlElement(name = "SAML")
    protected String saml;
    @XmlElement(name = "MobileDeviceInfo", required = true)
    protected MobileDeviceInfo mobileDeviceInfo;
    @XmlElement(name = "AdditionalMobileDeviceInfo", required = true)
    protected AdditionalMobileDeviceInfo additionalMobileDeviceInfo;

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
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
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

    /**
     * Gets the value of the mobileDeviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileDeviceInfo }
     *     
     */
    public MobileDeviceInfo getMobileDeviceInfo() {
        return mobileDeviceInfo;
    }

    /**
     * Sets the value of the mobileDeviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileDeviceInfo }
     *     
     */
    public void setMobileDeviceInfo(MobileDeviceInfo value) {
        this.mobileDeviceInfo = value;
    }

    /**
     * Gets the value of the additionalMobileDeviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalMobileDeviceInfo }
     *     
     */
    public AdditionalMobileDeviceInfo getAdditionalMobileDeviceInfo() {
        return additionalMobileDeviceInfo;
    }

    /**
     * Sets the value of the additionalMobileDeviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalMobileDeviceInfo }
     *     
     */
    public void setAdditionalMobileDeviceInfo(AdditionalMobileDeviceInfo value) {
        this.additionalMobileDeviceInfo = value;
    }

}
