
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.QuestionList;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Complete Registration operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * CurrentPassword: The users current password.
 * NewPassword: The new password to set for the user.
 * QuestionList: A set of question IDs and answers to set on the users ID.
 * 
 * <p>Java class for CompleteRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuestionList" type="{http://tfa.keybank.com/v1_11/service/objects}QuestionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRegistration", propOrder = {
    "tamuid",
    "currentPassword",
    "newPassword",
    "questionList"
})
public class CompleteRegistration
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "CurrentPassword", required = true)
    protected String currentPassword;
    @XmlElement(name = "NewPassword", required = true)
    protected String newPassword;
    @XmlElement(name = "QuestionList")
    protected QuestionList questionList;

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
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
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

}
