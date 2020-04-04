
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The result object for the Mobile Login Multi operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * DeviceName: The name of the device that matched the input forensics data.
 * DeviceExpirationDate: The date/time when the matched device will expire.
 * PasswordExpirationDate: The date/time that the users password will expire.
 * PasswordLastChangedData: The data/time that the user last changed their
 * password.
 * AggregatorLogin: A flag to indicate if this login was performed by a data
 * aggregator rather than an actual user.
 * AggregatorGracePeriodEndDate: The date/time when aggregator access to this user
 * account will expire. Aggregator logins after this date/time will be denied
 * outright.
 * DeviceUniquenessScore: A value (normally between 0 and 10) indicating how
 * unique the users device forensics are. This value is mostly informational, but
 * can be passed on to Actimize if necessary.
 * LastLoginDate: The most recent data/time (excluding this login) that the
 * user logged in successfully.
 * HasRetiredChallengeQuestions: A flag to indicate if the user has challenge
 * questions on their ID that are no longer active. If true, the user should be
 * asked to select a new set of questions.
 * 
 * <p>Java class for LoginMultiResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginMultiResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DeviceExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PasswordExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PasswordLastChangedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AggregatorLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AggregatorGracePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeviceUniquenessScore" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HasRetiredChallengeQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginMultiResult", propOrder = {
    "statusInfo",
    "deviceName",
    "deviceExpirationDate",
    "passwordExpirationDate",
    "passwordLastChangedDate",
    "aggregatorLogin",
    "aggregatorGracePeriodEndDate",
    "deviceUniquenessScore",
    "lastLoginDate",
    "hasRetiredChallengeQuestions"
})
public class LoginMultiResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "DeviceName", required = true)
    protected String deviceName;
    @XmlElement(name = "DeviceExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deviceExpirationDate;
    @XmlElement(name = "PasswordExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordExpirationDate;
    @XmlElement(name = "PasswordLastChangedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordLastChangedDate;
    @XmlElement(name = "AggregatorLogin")
    protected boolean aggregatorLogin;
    @XmlElement(name = "AggregatorGracePeriodEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aggregatorGracePeriodEndDate;
    @XmlElement(name = "DeviceUniquenessScore")
    protected double deviceUniquenessScore;
    @XmlElement(name = "LastLoginDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "HasRetiredChallengeQuestions")
    protected boolean hasRetiredChallengeQuestions;

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
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceExpirationDate() {
        return deviceExpirationDate;
    }

    /**
     * Sets the value of the deviceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceExpirationDate(XMLGregorianCalendar value) {
        this.deviceExpirationDate = value;
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
     * Gets the value of the aggregatorLogin property.
     * 
     */
    public boolean isAggregatorLogin() {
        return aggregatorLogin;
    }

    /**
     * Sets the value of the aggregatorLogin property.
     * 
     */
    public void setAggregatorLogin(boolean value) {
        this.aggregatorLogin = value;
    }

    /**
     * Gets the value of the aggregatorGracePeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAggregatorGracePeriodEndDate() {
        return aggregatorGracePeriodEndDate;
    }

    /**
     * Sets the value of the aggregatorGracePeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAggregatorGracePeriodEndDate(XMLGregorianCalendar value) {
        this.aggregatorGracePeriodEndDate = value;
    }

    /**
     * Gets the value of the deviceUniquenessScore property.
     * 
     */
    public double getDeviceUniquenessScore() {
        return deviceUniquenessScore;
    }

    /**
     * Sets the value of the deviceUniquenessScore property.
     * 
     */
    public void setDeviceUniquenessScore(double value) {
        this.deviceUniquenessScore = value;
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

    /**
     * Gets the value of the hasRetiredChallengeQuestions property.
     * 
     */
    public boolean isHasRetiredChallengeQuestions() {
        return hasRetiredChallengeQuestions;
    }

    /**
     * Sets the value of the hasRetiredChallengeQuestions property.
     * 
     */
    public void setHasRetiredChallengeQuestions(boolean value) {
        this.hasRetiredChallengeQuestions = value;
    }

}
