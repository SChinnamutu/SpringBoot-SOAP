
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.keybank.tfa.v1_11.service.objects.DeviceList;
import com.keybank.tfa.v1_11.service.objects.QuestionList;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.ServiceCounterList;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the User Detail Status operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * QuestionList: A list of the users questions.
 * DeviceList: A list of the users registered and active devices.
 * ServiceCounterList: A list of the users counter information.
 * FirstName: The users first name.
 * LastName: The users last name.
 * AccountValid: The status of the users account. True = enabled, false =
 * disabled.
 * PasswordValid: The status of the users password. True = valid, false = expired.
 * PasswordExpirationDate: The date/time at which the users password will expire.
 * PasswordLastChangedDate: The last date/time at which the user changed their
 * password (or when the password was most recently made valid.)
 * GraceDateTime: The users grade period date/time if it is current set for their
 * ID.
 * FraudAlert: A flag indicating if the user has a fraud alert placed on their
 * account. A fraud alert will prevent the user from logging in.
 * RegistrationComplete: A flag to indicate if the user has completed the
 * registration process for their ID.
 * AggregatorGraceDateTime: The date/time at which aggregator access to the users
 * account will expire (and the aggregator will be blocked from accessing the
 * users account.)
 * LastLoginDate: The last time the user logged in.
 * 
 * 
 * <p>Java class for UserDetailStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="QuestionList" type="{http://tfa.keybank.com/v1_11/service/objects}QuestionList" minOccurs="0"/&gt;
 *         &lt;element name="DeviceList" type="{http://tfa.keybank.com/v1_11/service/objects}DeviceList" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCounterList" type="{http://tfa.keybank.com/v1_11/service/objects}ServiceCounterList" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PasswordValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PasswordExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PasswordLastChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GraceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FraudAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RegistrationComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AggregatorGraceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetailStatusResult", propOrder = {
    "statusInfo",
    "questionList",
    "deviceList",
    "serviceCounterList",
    "firstName",
    "lastName",
    "accountValid",
    "passwordValid",
    "passwordExpirationDate",
    "passwordLastChangedDate",
    "graceDateTime",
    "fraudAlert",
    "registrationComplete",
    "aggregatorGraceDateTime",
    "lastLoginDate"
})
public class UserDetailStatusResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "QuestionList")
    protected QuestionList questionList;
    @XmlElement(name = "DeviceList")
    protected DeviceList deviceList;
    @XmlElement(name = "ServiceCounterList")
    protected ServiceCounterList serviceCounterList;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "AccountValid")
    protected boolean accountValid;
    @XmlElement(name = "PasswordValid")
    protected boolean passwordValid;
    @XmlElement(name = "PasswordExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordExpirationDate;
    @XmlElement(name = "PasswordLastChangedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordLastChangedDate;
    @XmlElement(name = "GraceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graceDateTime;
    @XmlElement(name = "FraudAlert")
    protected boolean fraudAlert;
    @XmlElement(name = "RegistrationComplete")
    protected boolean registrationComplete;
    @XmlElement(name = "AggregatorGraceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aggregatorGraceDateTime;
    @XmlElement(name = "LastLoginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;

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
     * Gets the value of the deviceList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceList }
     *     
     */
    public DeviceList getDeviceList() {
        return deviceList;
    }

    /**
     * Sets the value of the deviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceList }
     *     
     */
    public void setDeviceList(DeviceList value) {
        this.deviceList = value;
    }

    /**
     * Gets the value of the serviceCounterList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCounterList }
     *     
     */
    public ServiceCounterList getServiceCounterList() {
        return serviceCounterList;
    }

    /**
     * Sets the value of the serviceCounterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCounterList }
     *     
     */
    public void setServiceCounterList(ServiceCounterList value) {
        this.serviceCounterList = value;
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
     * Gets the value of the passwordExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordExpirationDate() {
        return passwordExpirationDate;
    }

    /**
     * Sets the value of the passwordExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordExpirationDate(XMLGregorianCalendar value) {
        this.passwordExpirationDate = value;
    }

    /**
     * Gets the value of the passwordLastChangedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordLastChangedDate() {
        return passwordLastChangedDate;
    }

    /**
     * Sets the value of the passwordLastChangedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordLastChangedDate(XMLGregorianCalendar value) {
        this.passwordLastChangedDate = value;
    }

    /**
     * Gets the value of the graceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraceDateTime() {
        return graceDateTime;
    }

    /**
     * Sets the value of the graceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraceDateTime(XMLGregorianCalendar value) {
        this.graceDateTime = value;
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
     * Gets the value of the registrationComplete property.
     * 
     */
    public boolean isRegistrationComplete() {
        return registrationComplete;
    }

    /**
     * Sets the value of the registrationComplete property.
     * 
     */
    public void setRegistrationComplete(boolean value) {
        this.registrationComplete = value;
    }

    /**
     * Gets the value of the aggregatorGraceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAggregatorGraceDateTime() {
        return aggregatorGraceDateTime;
    }

    /**
     * Sets the value of the aggregatorGraceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAggregatorGraceDateTime(XMLGregorianCalendar value) {
        this.aggregatorGraceDateTime = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
    }

}
