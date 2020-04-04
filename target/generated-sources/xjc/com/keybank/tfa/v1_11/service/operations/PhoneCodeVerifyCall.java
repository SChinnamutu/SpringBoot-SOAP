
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for contacting the user via phone to verify a code.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * PhoneNumberAlias: The phone number alias to contact the user with. Aliases are
 * set up via the Set Phone Number operation. Alternatively this may be the actual
 * phone number to call. An invalid alias or phone number will return an error.
 * SMS: Flag to control sending the PIN via SMS instead of a phone call. If
 * omitted, the default is a standard phone call. The phone must support SMS to
 * use this option.
 * EnterPINViaPhone: Flag to control sending the PIN to the user via phone as
 * opposed to entering the PIN in to the phone. If omitted, the default is to send
 * the PIN via phone. If set to true, the user's PIN will be returned by this
 * operation and should be displayed to the user on screen so that they can enter
 * the PIN in to their phone.
 * UserInactiveByPas: Flag to be used to bypass if user is inactive (true = bypass), 
 * the default in the code is false.
 * 
 * <p>Java class for PhoneCodeVerifyCall complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneCodeVerifyCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumberID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnterPINViaPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserInactiveByPass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneCodeVerifyCall", propOrder = {
    "tamuid",
    "phoneNumberID",
    "sms",
    "enterPINViaPhone",
    "userInactiveByPass"
})
public class PhoneCodeVerifyCall
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "PhoneNumberID", required = true)
    protected String phoneNumberID;
    @XmlElement(name = "SMS")
    protected Boolean sms;
    @XmlElement(name = "EnterPINViaPhone")
    protected Boolean enterPINViaPhone;
    @XmlElement(name = "UserInactiveByPass")
    protected Boolean userInactiveByPass;

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
     * Gets the value of the phoneNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberID() {
        return phoneNumberID;
    }

    /**
     * Sets the value of the phoneNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberID(String value) {
        this.phoneNumberID = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMS(Boolean value) {
        this.sms = value;
    }

    /**
     * Gets the value of the enterPINViaPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnterPINViaPhone() {
        return enterPINViaPhone;
    }

    /**
     * Sets the value of the enterPINViaPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnterPINViaPhone(Boolean value) {
        this.enterPINViaPhone = value;
    }

    /**
     * Gets the value of the userInactiveByPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserInactiveByPass() {
        return userInactiveByPass;
    }

    /**
     * Sets the value of the userInactiveByPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserInactiveByPass(Boolean value) {
        this.userInactiveByPass = value;
    }

}
