
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.QuestionList;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Security Questions operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * QuestionList: A list of all currently active questions in TFA.
 * 
 * <p>Java class for SecurityQuestionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityQuestionsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="QuestionList" type="{http://tfa.keybank.com/v1_11/service/objects}QuestionList"/&gt;
 *         &lt;element name="CustomQuestionsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CustomQuestionsStartID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CustomQuestionsMaxAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityQuestionsResult", propOrder = {
    "statusInfo",
    "questionList",
    "customQuestionsEnabled",
    "customQuestionsStartID",
    "customQuestionsMaxAllowed"
})
public class SecurityQuestionsResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "QuestionList", required = true)
    protected QuestionList questionList;
    @XmlElement(name = "CustomQuestionsEnabled")
    protected boolean customQuestionsEnabled;
    @XmlElement(name = "CustomQuestionsStartID")
    protected int customQuestionsStartID;
    @XmlElement(name = "CustomQuestionsMaxAllowed")
    protected int customQuestionsMaxAllowed;

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
     * Gets the value of the questionList property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionList }
     *     
     */
    public QuestionList getQuestionList() {
        return questionList;
    }

    /**
     * Sets the value of the questionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionList }
     *     
     */
    public void setQuestionList(QuestionList value) {
        this.questionList = value;
    }

    /**
     * Gets the value of the customQuestionsEnabled property.
     * 
     */
    public boolean isCustomQuestionsEnabled() {
        return customQuestionsEnabled;
    }

    /**
     * Sets the value of the customQuestionsEnabled property.
     * 
     */
    public void setCustomQuestionsEnabled(boolean value) {
        this.customQuestionsEnabled = value;
    }

    /**
     * Gets the value of the customQuestionsStartID property.
     * 
     */
    public int getCustomQuestionsStartID() {
        return customQuestionsStartID;
    }

    /**
     * Sets the value of the customQuestionsStartID property.
     * 
     */
    public void setCustomQuestionsStartID(int value) {
        this.customQuestionsStartID = value;
    }

    /**
     * Gets the value of the customQuestionsMaxAllowed property.
     * 
     */
    public int getCustomQuestionsMaxAllowed() {
        return customQuestionsMaxAllowed;
    }

    /**
     * Sets the value of the customQuestionsMaxAllowed property.
     * 
     */
    public void setCustomQuestionsMaxAllowed(int value) {
        this.customQuestionsMaxAllowed = value;
    }

}
