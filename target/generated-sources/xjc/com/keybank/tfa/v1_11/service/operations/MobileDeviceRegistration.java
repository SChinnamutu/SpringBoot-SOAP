
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.MobileDeviceInfo;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * 
 * 		    			The request object for the Mobile Device Registration operation.
 * 						Properties:
 * 						TAMUID: The user ID to run the operation on.
 * 						CurrentPassword: The users current password.
 * 						MobileDeviceInfo: A set of mobile device forensics to register for the user.
 * 					
 * 
 * <p>Java class for MobileDeviceRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MobileDeviceInfo" type="{http://tfa.keybank.com/v1_11/service/objects}MobileDeviceInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceRegistration", propOrder = {
    "tamuid",
    "currentPassword",
    "mobileDeviceInfo"
})
public class MobileDeviceRegistration
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "CurrentPassword", required = true)
    protected String currentPassword;
    @XmlElement(name = "MobileDeviceInfo", required = true)
    protected MobileDeviceInfo mobileDeviceInfo;

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

}
