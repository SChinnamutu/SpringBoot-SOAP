
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for polling the status of the user's phone call to verify a
 * code.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * TransactionToken: A token representing transactional data for the user. This is
 * the token you received from the Phone Funds Verify Call operation or a previous
 * Phone Code Verify Poll call.
 * PIN: The PIN the user received from the phone call.
 * 
 * <p>Java class for PhoneFundsVerifyPoll complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneFundsVerifyPoll"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneFundsVerifyPoll", propOrder = {
    "tamuid",
    "transactionToken"
})
public class PhoneFundsVerifyPoll
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "TransactionToken", required = true)
    protected String transactionToken;

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
     * Gets the value of the transactionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * Sets the value of the transactionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionToken(String value) {
        this.transactionToken = value;
    }

}
