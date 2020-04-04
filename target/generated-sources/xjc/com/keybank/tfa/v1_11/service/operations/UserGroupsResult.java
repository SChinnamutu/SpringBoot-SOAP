
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;
import com.keybank.tfa.v1_11.service.objects.TLAList;


/**
 * <p>Java class for UserGroupsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserGroupsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="TLAList" type="{http://tfa.keybank.com/v1_11/service/objects}TLAList"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PasswordValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SelfCare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "UserGroupsResult", propOrder = {
    "statusInfo",
    "tlaList",
    "firstName",
    "lastName",
    "accountValid",
    "passwordValid",
    "selfCare",
    "fraudAlert"
})
public class UserGroupsResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "TLAList", required = true)
    protected TLAList tlaList;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "AccountValid")
    protected Boolean accountValid;
    @XmlElement(name = "PasswordValid")
    protected Boolean passwordValid;
    @XmlElement(name = "SelfCare")
    protected String selfCare;
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
     * Gets the value of the tlaList property.
     * 
     * @return
     *     possible object is
     *     {@link TLAList }
     *     
     */
    public TLAList getTLAList() {
        return tlaList;
    }

    /**
     * Sets the value of the tlaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLAList }
     *     
     */
    public void setTLAList(TLAList value) {
        this.tlaList = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountValid() {
        return accountValid;
    }

    /**
     * Sets the value of the accountValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountValid(Boolean value) {
        this.accountValid = value;
    }

    /**
     * Gets the value of the passwordValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPasswordValid() {
        return passwordValid;
    }

    /**
     * Sets the value of the passwordValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPasswordValid(Boolean value) {
        this.passwordValid = value;
    }

    /**
     * Gets the value of the selfCare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfCare() {
        return selfCare;
    }

    /**
     * Sets the value of the selfCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfCare(String value) {
        this.selfCare = value;
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
