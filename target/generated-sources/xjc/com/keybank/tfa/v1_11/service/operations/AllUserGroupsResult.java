
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.GroupList;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Get All User Groups operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * FirstName: The users first name.
 * LastName: The users last name.
 * AccountValid: The status of the users account. True = enabled, false =
 * disabled.
 * PasswordValid: The status of the users password. True = valid, false = expired.
 * GSOUser: Flag to indicate if the user has a GSO resource associated with their
 * account. This can be ignored by most applications.
 * GroupList: A list of TAM groups that the user has associated with their ID.
 * 
 * <p>Java class for AllUserGroupsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllUserGroupsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PasswordValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GSOUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GroupList" type="{http://tfa.keybank.com/v1_11/service/objects}GroupList"/&gt;
 *         &lt;element name="FraudAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllUserGroupsResult", propOrder = {
    "statusInfo",
    "firstName",
    "lastName",
    "accountValid",
    "passwordValid",
    "gsoUser",
    "groupList",
    "fraudAlert"
})
public class AllUserGroupsResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "AccountValid")
    protected boolean accountValid;
    @XmlElement(name = "PasswordValid")
    protected boolean passwordValid;
    @XmlElement(name = "GSOUser")
    protected boolean gsoUser;
    @XmlElement(name = "GroupList", required = true)
    protected GroupList groupList;
    @XmlElement(name = "FraudAlert")
    protected boolean fraudAlert;

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
     * Gets the value of the accountValid property.
     * 
     */
    public boolean isAccountValid() {
        return accountValid;
    }

    /**
     * Sets the value of the accountValid property.
     * 
     */
    public void setAccountValid(boolean value) {
        this.accountValid = value;
    }

    /**
     * Gets the value of the passwordValid property.
     * 
     */
    public boolean isPasswordValid() {
        return passwordValid;
    }

    /**
     * Sets the value of the passwordValid property.
     * 
     */
    public void setPasswordValid(boolean value) {
        this.passwordValid = value;
    }

    /**
     * Gets the value of the gsoUser property.
     * 
     */
    public boolean isGSOUser() {
        return gsoUser;
    }

    /**
     * Sets the value of the gsoUser property.
     * 
     */
    public void setGSOUser(boolean value) {
        this.gsoUser = value;
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
     * Gets the value of the fraudAlert property.
     * 
     */
    public boolean isFraudAlert() {
        return fraudAlert;
    }

    /**
     * Sets the value of the fraudAlert property.
     * 
     */
    public void setFraudAlert(boolean value) {
        this.fraudAlert = value;
    }

}
