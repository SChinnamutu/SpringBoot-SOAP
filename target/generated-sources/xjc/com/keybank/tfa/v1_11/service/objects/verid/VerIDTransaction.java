
package com.keybank.tfa.v1_11.service.objects.verid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountMaintenanceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CredentialType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Person" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDPerson"/&gt;
 *         &lt;element name="SimulatorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDTransaction", propOrder = {
    "accountType",
    "accountMaintenanceType",
    "accountID",
    "userIPAddress",
    "credentialType",
    "person",
    "simulatorMode",
    "testMode"
})
public class VerIDTransaction {

    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "AccountMaintenanceType", required = true)
    protected String accountMaintenanceType;
    @XmlElement(name = "AccountID", required = true)
    protected String accountID;
    @XmlElement(name = "UserIPAddress", required = true)
    protected String userIPAddress;
    @XmlElement(name = "CredentialType", required = true)
    protected String credentialType;
    @XmlElement(name = "Person", required = true)
    protected VerIDPerson person;
    @XmlElement(name = "SimulatorMode")
    protected String simulatorMode;
    @XmlElement(name = "TestMode")
    protected Boolean testMode;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountMaintenanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMaintenanceType() {
        return accountMaintenanceType;
    }

    /**
     * Sets the value of the accountMaintenanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMaintenanceType(String value) {
        this.accountMaintenanceType = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the userIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIPAddress() {
        return userIPAddress;
    }

    /**
     * Sets the value of the userIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIPAddress(String value) {
        this.userIPAddress = value;
    }

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialType(String value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link VerIDPerson }
     *     
     */
    public VerIDPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerIDPerson }
     *     
     */
    public void setPerson(VerIDPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the simulatorMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulatorMode() {
        return simulatorMode;
    }

    /**
     * Sets the value of the simulatorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulatorMode(String value) {
        this.simulatorMode = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestMode(Boolean value) {
        this.testMode = value;
    }

}
