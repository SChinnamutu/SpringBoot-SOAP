
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.GroupList;
import com.keybank.tfa.v1_11.service.objects.QuestionList;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Self Registration operation.
 * 						Properties:
 * 						TAMUID: The user ID to run the operation on.
 * 						FirstName: The users first name.
 * 						LastName: The users last name.
 * 						NewPassword: The users new password. This value is optional.
 * 						CIXNumber: A CIX number used for delegated administration.
 * 						DelegationGroup: A delegation group used for delegated administration.
 * 						GroupList: A list of TAM group names to add to the users ID.
 * 						QuestionList: A question list containing question IDs and answers to set on the
 * 						users ID.
 * 						TemporaryID: Mark the ID as being temporary so that it can be cleaned up at a
 * 						later date.
 * 						FIKey: An FIKey to set for the user.
 * 					
 * 
 * <p>Java class for SelfRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelfRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CIXNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelegationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupList" type="{http://tfa.keybank.com/v1_11/service/objects}GroupList"/&gt;
 *         &lt;element name="QuestionList" type="{http://tfa.keybank.com/v1_11/service/objects}QuestionList" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FIKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelfRegistration", propOrder = {
    "tamuid",
    "firstName",
    "lastName",
    "newPassword",
    "cixNumber",
    "delegationGroup",
    "groupList",
    "questionList",
    "temporaryID",
    "fiKey"
})
public class SelfRegistration
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "NewPassword", required = true)
    protected String newPassword;
    @XmlElement(name = "CIXNumber")
    protected String cixNumber;
    @XmlElement(name = "DelegationGroup")
    protected String delegationGroup;
    @XmlElement(name = "GroupList", required = true)
    protected GroupList groupList;
    @XmlElement(name = "QuestionList")
    protected QuestionList questionList;
    @XmlElement(name = "TemporaryID")
    protected Boolean temporaryID;
    @XmlElement(name = "FIKey")
    protected String fiKey;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the cixNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIXNumber() {
        return cixNumber;
    }

    /**
     * Sets the value of the cixNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIXNumber(String value) {
        this.cixNumber = value;
    }

    /**
     * Gets the value of the delegationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationGroup() {
        return delegationGroup;
    }

    /**
     * Sets the value of the delegationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationGroup(String value) {
        this.delegationGroup = value;
    }

    /**
     * Gets the value of the groupList property.
     * 
     * @return
     *     possible object is
     *     {@link GroupList }
     *     
     */
    public GroupList getGroupList() {
        return groupList;
    }

    /**
     * Sets the value of the groupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupList }
     *     
     */
    public void setGroupList(GroupList value) {
        this.groupList = value;
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
     * Gets the value of the temporaryID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporaryID() {
        return temporaryID;
    }

    /**
     * Sets the value of the temporaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporaryID(Boolean value) {
        this.temporaryID = value;
    }

    /**
     * Gets the value of the fiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIKey() {
        return fiKey;
    }

    /**
     * Sets the value of the fiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIKey(String value) {
        this.fiKey = value;
    }

}
