
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.GroupList;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * <p>Java class for AdminRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdminRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DelegationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CIXNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupList" type="{http://tfa.keybank.com/v1_11/service/objects}GroupList"/&gt;
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
@XmlType(name = "AdminRegistration", propOrder = {
    "adminUID",
    "tamuid",
    "firstName",
    "lastName",
    "newPassword",
    "delegationGroup",
    "cixNumber",
    "userPIN",
    "groupList",
    "temporaryID",
    "fiKey"
})
public class AdminRegistration
    extends Request
{

    @XmlElement(name = "AdminUID", required = true)
    protected String adminUID;
    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "NewPassword", required = true)
    protected String newPassword;
    @XmlElement(name = "DelegationGroup")
    protected String delegationGroup;
    @XmlElement(name = "CIXNumber")
    protected String cixNumber;
    @XmlElement(name = "UserPIN")
    protected String userPIN;
    @XmlElement(name = "GroupList", required = true)
    protected GroupList groupList;
    @XmlElement(name = "TemporaryID")
    protected Boolean temporaryID;
    @XmlElement(name = "FIKey")
    protected String fiKey;

    /**
     * Gets the value of the adminUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUID() {
        return adminUID;
    }

    /**
     * Sets the value of the adminUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUID(String value) {
        this.adminUID = value;
    }

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
     * Gets the value of the userPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPIN() {
        return userPIN;
    }

    /**
     * Sets the value of the userPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPIN(String value) {
        this.userPIN = value;
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
