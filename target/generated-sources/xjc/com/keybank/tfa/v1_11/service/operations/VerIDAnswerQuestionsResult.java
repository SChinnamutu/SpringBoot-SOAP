
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;
import com.keybank.tfa.v1_11.service.objects.verid.VerIDTransactionResult;


/**
 * The response object for the VerID Answer Questions operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * VerIDTransactionResult: A set of data indicating the result of running the
 * VerID operation, also (potentially) a further set of questions for the user to
 * answer.
 * 
 * <p>Java class for VerIDAnswerQuestionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDAnswerQuestionsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="VerIDResult" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDTransactionResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDAnswerQuestionsResult", propOrder = {
    "statusInfo",
    "verIDResult"
})
public class VerIDAnswerQuestionsResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "VerIDResult", required = true)
    protected VerIDTransactionResult verIDResult;

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
     * Gets the value of the verIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link VerIDTransactionResult }
     *     
     */
    public VerIDTransactionResult getVerIDResult() {
        return verIDResult;
    }

    /**
     * Sets the value of the verIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerIDTransactionResult }
     *     
     */
    public void setVerIDResult(VerIDTransactionResult value) {
        this.verIDResult = value;
    }

}
