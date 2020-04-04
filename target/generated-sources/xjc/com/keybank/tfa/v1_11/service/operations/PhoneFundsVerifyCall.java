
package com.keybank.tfa.v1_11.service.operations;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for contacting the user via phone to verify a funds transfer.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * PhoneNumberAlias: The phone number alias to contact the user with. Aliases are
 * set up via the Set Phone Number operation. Alternatively this may be the actual
 * phone number to call. An invalid alias or phone number will return an error.
 * AmountDollars: The dollar amount of the funds transfer.
 * AmountCents: The cents amount of the funds transfer.
 * AccountNumber: The partial account number to speak to the user over the phone.
 * 
 * <p>Java class for PhoneFundsVerifyCall complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneFundsVerifyCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneNumberID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AmountDollars" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AmountCents" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneFundsVerifyCall", propOrder = {
    "tamuid",
    "phoneNumberID",
    "amountDollars",
    "amountCents",
    "accountNumber"
})
public class PhoneFundsVerifyCall
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "PhoneNumberID", required = true)
    protected String phoneNumberID;
    @XmlElement(name = "AmountDollars", required = true)
    protected BigInteger amountDollars;
    @XmlElement(name = "AmountCents", required = true)
    protected BigInteger amountCents;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;

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
     * Gets the value of the amountDollars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountDollars() {
        return amountDollars;
    }

    /**
     * Sets the value of the amountDollars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountDollars(BigInteger value) {
        this.amountDollars = value;
    }

    /**
     * Gets the value of the amountCents property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountCents() {
        return amountCents;
    }

    /**
     * Sets the value of the amountCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountCents(BigInteger value) {
        this.amountCents = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

}
