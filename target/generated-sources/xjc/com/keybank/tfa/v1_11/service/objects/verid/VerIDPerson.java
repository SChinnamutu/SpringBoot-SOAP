
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SSNLast4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDAddress" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDPhoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Birthdate" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDBirthdate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDPerson", propOrder = {
    "ssnLast4",
    "firstName",
    "middleName",
    "lastName",
    "email",
    "address",
    "phoneNumber",
    "birthdate"
})
public class VerIDPerson {

    @XmlElement(name = "SSNLast4", required = true)
    protected String ssnLast4;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Email")
    protected List<String> email;
    @XmlElement(name = "Address", required = true)
    protected List<VerIDAddress> address;
    @XmlElement(name = "PhoneNumber")
    protected List<VerIDPhoneNumber> phoneNumber;
    @XmlElement(name = "Birthdate")
    protected VerIDBirthdate birthdate;

    /**
     * Gets the value of the ssnLast4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSNLast4() {
        return ssnLast4;
    }

    /**
     * Sets the value of the ssnLast4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSNLast4(String value) {
        this.ssnLast4 = value;
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
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
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
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmail() {
        if (email == null) {
            email = new ArrayList<String>();
        }
        return this.email;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDAddress }
     * 
     * 
     */
    public List<VerIDAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<VerIDAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDPhoneNumber }
     * 
     * 
     */
    public List<VerIDPhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<VerIDPhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link VerIDBirthdate }
     *     
     */
    public VerIDBirthdate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerIDBirthdate }
     *     
     */
    public void setBirthdate(VerIDBirthdate value) {
        this.birthdate = value;
    }

}
