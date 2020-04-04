
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Verify Temp PIN Reset User operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * TempPIN: The temporary PIN send to the user via email.
 * ApplicationTempPIN: The ApplicationTempPIN returned to the application after
 * sending the email to the user via the SendTempPINByEmail operation.
 * NewPassword: The users new password.
 * 
 * <p>Java class for VerifyTempPINResetUser complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyTempPINResetUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TempPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationTempPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyTempPINResetUser", propOrder = {
    "tamuid",
    "tempPIN",
    "applicationTempPIN",
    "newPassword"
})
public class VerifyTempPINResetUser
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "TempPIN", required = true)
    protected String tempPIN;
    @XmlElement(name = "ApplicationTempPIN", required = true)
    protected String applicationTempPIN;
    @XmlElement(name = "NewPassword")
    protected String newPassword;

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
     * Gets the value of the tempPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPIN() {
        return tempPIN;
    }

    /**
     * Sets the value of the tempPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPIN(String value) {
        this.tempPIN = value;
    }

    /**
     * Gets the value of the applicationTempPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationTempPIN() {
        return applicationTempPIN;
    }

    /**
     * Sets the value of the applicationTempPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationTempPIN(String value) {
        this.applicationTempPIN = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

}
