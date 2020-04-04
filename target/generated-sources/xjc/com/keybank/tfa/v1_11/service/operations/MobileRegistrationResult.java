
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.MobileTokenInfo;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * 
 * 		    			The response object for the Mobile Registration operation.
 * 						Properties:
 * 						StatusInfo: Standard operation result status object.
 * 						CookieInfo: A set of device information containing data to be stored on the
 * 						users machine in a cookie. 
 * 						FlashInfo: A set of device information containing data to be stored on the
 * 						users machine in a flash object.
 * 					
 * 
 * <p>Java class for MobileRegistrationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileRegistrationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="MobileTokenInfo" type="{http://tfa.keybank.com/v1_11/service/objects}MobileTokenInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileRegistrationResult", propOrder = {
    "statusInfo",
    "mobileTokenInfo"
})
public class MobileRegistrationResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "MobileTokenInfo", required = true)
    protected MobileTokenInfo mobileTokenInfo;

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
     * Gets the value of the mobileTokenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTokenInfo }
     *     
     */
    public MobileTokenInfo getMobileTokenInfo() {
        return mobileTokenInfo;
    }

    /**
     * Sets the value of the mobileTokenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTokenInfo }
     *     
     */
    public void setMobileTokenInfo(MobileTokenInfo value) {
        this.mobileTokenInfo = value;
    }

}
