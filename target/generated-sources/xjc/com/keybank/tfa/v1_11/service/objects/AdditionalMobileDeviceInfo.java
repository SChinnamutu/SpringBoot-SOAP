
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalMobileDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalMobileDeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalMobileDeviceInfo", propOrder = {
    "mobileID",
    "carrier"
})
public class AdditionalMobileDeviceInfo {

    @XmlElement(name = "MobileID", required = true)
    protected String mobileID;
    @XmlElement(name = "Carrier")
    protected String carrier;

    /**
     * Gets the value of the mobileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileID() {
        return mobileID;
    }

    /**
     * Sets the value of the mobileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileID(String value) {
        this.mobileID = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
