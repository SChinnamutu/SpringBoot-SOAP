
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An object used for representation of challenge questions and their associated answers.
 * Properties:
 * Alias: An alias for the phone number. This should be a human readable
 * description of the phone number (ex. Home Phone). This may contains letters,
 * numbers, and spaces only. Must be 2 to 20 characters in length.
 * PhoneNumber: A phone number. This number must be 10 digits with no special
 * formatting, whitespace, or non-digit characters.
 * SMSCapable: A flag indicating if the phone number is SMS capable.
 * PhoneNumberID: An ID number associated with the phone number. This field is
 * only used when returning phone numbers via the Get Phone Number operation.
 * 
 * <p>Java class for PhoneNumberData complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumberData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SMSCapable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PhoneNumberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumberData", propOrder = {
    "alias",
    "phoneNumber",
    "smsCapable",
    "phoneNumberID"
})
public class PhoneNumberData {

    @XmlElement(name = "Alias", required = true)
    protected String alias;
    @XmlElement(name = "PhoneNumber", required = true)
    protected String phoneNumber;
    @XmlElement(name = "SMSCapable")
    protected boolean smsCapable;
    @XmlElement(name = "PhoneNumberID")
    protected String phoneNumberID;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the smsCapable property.
     * 
     */
    public boolean isSMSCapable() {
        return smsCapable;
    }

    /**
     * Sets the value of the smsCapable property.
     * 
     */
    public void setSMSCapable(boolean value) {
        this.smsCapable = value;
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

}
