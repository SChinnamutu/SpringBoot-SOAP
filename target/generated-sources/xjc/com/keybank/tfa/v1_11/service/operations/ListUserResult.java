
package com.keybank.tfa.v1_11.service.operations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The result object for the Reset Service Counter operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * CIXNumber: The CIX number associated with the users ID (if any).
 * FirstName: The users first name.
 * LastName: The users last name.
 * TAMUID: 
 * 
 * <p>Java class for ListUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListUserResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="CIXNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DelegationGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccountValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PasswordValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="GSOUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FraudAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserPartyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListUserResult", propOrder = {
    "statusInfo",
    "cixNumber",
    "firstName",
    "lastName",
    "tamuid",
    "delegationGroup",
    "accountValid",
    "passwordValid",
    "gsoUser",
    "fraudAlert",
    "userPartyId"
})
public class ListUserResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "CIXNumber")
    protected String cixNumber;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "DelegationGroup")
    protected List<String> delegationGroup;
    @XmlElement(name = "AccountValid")
    protected boolean accountValid;
    @XmlElement(name = "PasswordValid")
    protected boolean passwordValid;
    @XmlElement(name = "GSOUser")
    protected boolean gsoUser;
    @XmlElement(name = "FraudAlert")
    protected boolean fraudAlert;
    @XmlElement(name = "UserPartyId", required = true)
    protected String userPartyId;

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
     * Gets the value of the delegationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delegationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelegationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDelegationGroup() {
        if (delegationGroup == null) {
            delegationGroup = new ArrayList<String>();
        }
        return this.delegationGroup;
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

    /**
     * Gets the value of the userPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPartyId() {
        return userPartyId;
    }

    /**
     * Sets the value of the userPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPartyId(String value) {
        this.userPartyId = value;
    }

}
