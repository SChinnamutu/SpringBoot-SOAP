
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for contacting the user via phone to reset their password.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * AdminUID: If an administrator is performing the password reset, this should be
 * their username. If you populate this field, the phone number should be the
 * administrators phone number, not the phone number of the user who is having
 * their password reset.
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
 * 
 * <p>Java class for PhoneResetPasswordCall complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneResetPasswordCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumberID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnterPINViaPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneResetPasswordCall", propOrder = {
    "tamuid",
    "adminUID",
    "phoneNumberID",
    "sms",
    "enterPINViaPhone"
})
public class PhoneResetPasswordCall
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "AdminUID")
    protected String adminUID;
    @XmlElement(name = "PhoneNumberID", required = true)
    protected String phoneNumberID;
    @XmlElement(name = "SMS")
    protected Boolean sms;
    @XmlElement(name = "EnterPINViaPhone")
    protected Boolean enterPINViaPhone;

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
     * Gets the value of the adminUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUID() {
        return adminUID;
    }

    /**
     * Sets the value of the adminUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUID(String value) {
        this.adminUID = value;
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

}
