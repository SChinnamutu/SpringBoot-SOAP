
package com.keybank.tfa.v1_11.service.objects.verid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Suite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ZipPlus4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Context" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDAddress", propOrder = {
    "street1",
    "street2",
    "suite",
    "city",
    "state",
    "zip",
    "zipPlus4",
    "country",
    "context"
})
public class VerIDAddress {

    @XmlElement(name = "Street1", required = true)
    protected String street1;
    @XmlElement(name = "Street2")
    protected String street2;
    @XmlElement(name = "Suite")
    protected String suite;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Zip", required = true)
    protected String zip;
    @XmlElement(name = "ZipPlus4")
    protected String zipPlus4;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Context", required = true)
    protected String context;

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuite(String value) {
        this.suite = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zipPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipPlus4() {
        return zipPlus4;
    }

    /**
     * Sets the value of the zipPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipPlus4(String value) {
        this.zipPlus4 = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

}
