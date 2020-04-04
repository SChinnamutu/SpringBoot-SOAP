
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Phone Code Verify Poll operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * TransactionToken: A token representing transactional data for the user. This
 * token must be passed in for any future Phone Funds Verify Poll calls. This
 * token will always be a string, but it's content and size may change at any
 * time. This token may not be the same as the token passed in the operation
 * request.
 * InProgress: Flag to indicate if the users call is still in progress. This will
 * return as false after the user has hung up the phone.
 * PINVerified: Flag to indicate if the user's PIN was verified successfully. Once
 * this value is True, the PIN has been verified and there is no need to poll this
 * operation again.
 * 
 * <p>Java class for PhoneFundsVerifyPollResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneFundsVerifyPollResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="TransactionToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PINVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneFundsVerifyPollResult", propOrder = {
    "statusInfo",
    "transactionToken",
    "inProgress",
    "pinVerified"
})
public class PhoneFundsVerifyPollResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "TransactionToken", required = true)
    protected String transactionToken;
    @XmlElement(name = "InProgress")
    protected boolean inProgress;
    @XmlElement(name = "PINVerified")
    protected boolean pinVerified;

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

    /**
     * Gets the value of the inProgress property.
     * 
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * Sets the value of the inProgress property.
     * 
     */
    public void setInProgress(boolean value) {
        this.inProgress = value;
    }

    /**
     * Gets the value of the pinVerified property.
     * 
     */
    public boolean isPINVerified() {
        return pinVerified;
    }

    /**
     * Sets the value of the pinVerified property.
     * 
     */
    public void setPINVerified(boolean value) {
        this.pinVerified = value;
    }

}
