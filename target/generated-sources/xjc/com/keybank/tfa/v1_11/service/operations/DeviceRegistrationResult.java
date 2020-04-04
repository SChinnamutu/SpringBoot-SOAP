
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.CookieInfo;
import com.keybank.tfa.v1_11.service.objects.FlashInfo;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * 
 * 		    			The response object for the Device Registration operation.
 * 						Properties:
 * 						StatusInfo: Standard operation result status object.
 * 						CookieInfo: A set of device information containing data to be stored on the
 * 						users machine in a cookie. 
 * 						FlashInfo: A set of device information containing data to be stored on the
 * 						users machine in a flash object.
 * 					
 * 
 * <p>Java class for DeviceRegistrationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceRegistrationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="CookieInfo" type="{http://tfa.keybank.com/v1_11/service/objects}CookieInfo"/&gt;
 *         &lt;element name="FlashInfo" type="{http://tfa.keybank.com/v1_11/service/objects}FlashInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRegistrationResult", propOrder = {
    "statusInfo",
    "cookieInfo",
    "flashInfo"
})
public class DeviceRegistrationResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "CookieInfo", required = true)
    protected CookieInfo cookieInfo;
    @XmlElement(name = "FlashInfo", required = true)
    protected FlashInfo flashInfo;

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusInfo }
     *     
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInfo }
     *     
     */
    public void setStatusInfo(StatusInfo value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the cookieInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CookieInfo }
     *     
     */
    public CookieInfo getCookieInfo() {
        return cookieInfo;
    }

    /**
     * Sets the value of the cookieInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieInfo }
     *     
     */
    public void setCookieInfo(CookieInfo value) {
        this.cookieInfo = value;
    }

    /**
     * Gets the value of the flashInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FlashInfo }
     *     
     */
    public FlashInfo getFlashInfo() {
        return flashInfo;
    }

    /**
     * Sets the value of the flashInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashInfo }
     *     
     */
    public void setFlashInfo(FlashInfo value) {
        this.flashInfo = value;
    }

}
