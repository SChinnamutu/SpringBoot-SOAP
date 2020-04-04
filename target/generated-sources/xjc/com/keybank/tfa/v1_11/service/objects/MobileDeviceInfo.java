
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileDeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemoteAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceInfo", propOrder = {
    "serialNumber",
    "userAgent",
    "remoteAddress",
    "macAddress"
})
public class MobileDeviceInfo {

    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "UserAgent", required = true)
    protected String userAgent;
    @XmlElement(name = "RemoteAddress", required = true)
    protected String remoteAddress;
    @XmlElement(name = "MacAddress")
    protected String macAddress;

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the remoteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAddress() {
        return remoteAddress;
    }

    /**
     * Sets the value of the remoteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAddress(String value) {
        this.remoteAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

}
