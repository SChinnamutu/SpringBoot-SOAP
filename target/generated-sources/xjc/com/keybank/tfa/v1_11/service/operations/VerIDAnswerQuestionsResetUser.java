
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;
import com.keybank.tfa.v1_11.service.objects.verid.VerIDTransactionAnswer;


/**
 * The request object for the VerID Answer Questions Reset User operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * VerIDRequest: An object containing answers to the users VerID questions.
 * NewPassword: The users new password.
 * 
 * <p>Java class for VerIDAnswerQuestionsResetUser complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDAnswerQuestionsResetUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VerIDRequest" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDTransactionAnswer"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDAnswerQuestionsResetUser", propOrder = {
    "tamuid",
    "verIDRequest",
    "newPassword"
})
public class VerIDAnswerQuestionsResetUser
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "VerIDRequest", required = true)
    protected VerIDTransactionAnswer verIDRequest;
    @XmlElement(name = "NewPassword")
    protected String newPassword;

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
     * Gets the value of the verIDRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VerIDTransactionAnswer }
     *     
     */
    public VerIDTransactionAnswer getVerIDRequest() {
        return verIDRequest;
    }

    /**
     * Sets the value of the verIDRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerIDTransactionAnswer }
     *     
     */
    public void setVerIDRequest(VerIDTransactionAnswer value) {
        this.verIDRequest = value;
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

}
