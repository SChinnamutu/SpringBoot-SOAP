
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Test Phone Code Verify Poll operation.
 * 										Properties:
 * 										StatusInfo: Standard operation result status object.
 * 										TransactionToken: A token representing transactional data for the user. This
 * 										token must be passed in for any future Phone Code Verify Poll calls. This
 * 										token will always be a string, but it's content and size may change at any
 * 										time. This token may not be the same as the token passed in the operation
 * 										request.
 * 										InProgress: Flag to indicate if the users call is still in progress. This will
 * 										return as false after the user has hung up the phone or the SMS message has
 * 										been sent. Note that there is no confirmation for if the user actually received
 * 										the SMS (by it's nature SMS does not support this functionality).
 * 										PINVerified: Flag to indicate if the user's PIN was verified successfully. Once
 * 										this value is True, the PIN has been verified and there is no need to poll this
 * 										operation again.
 * 					
 * 
 * <p>Java class for TestPhoneCodeVerifyPollResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestPhoneCodeVerifyPollResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="TransactionToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PINVerified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StatusReset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestPhoneCodeVerifyPollResult", propOrder = {
    "statusInfo",
    "transactionToken",
    "inProgress",
    "pinVerified",
    "statusReset"
})
public class TestPhoneCodeVerifyPollResult
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
    @XmlElement(name = "StatusReset")
    protected Boolean statusReset;

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

    /**
     * Gets the value of the statusReset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusReset() {
        return statusReset;
    }

    /**
     * Sets the value of the statusReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusReset(Boolean value) {
        this.statusReset = value;
    }

}
