
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondFactor complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondFactor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceInfo" type="{http://tfa.keybank.com/v1_11/service/objects}DeviceInfo"/&gt;
 *         &lt;element name="CookieList" type="{http://tfa.keybank.com/v1_11/service/objects}CookieList" minOccurs="0"/&gt;
 *         &lt;element name="FlashList" type="{http://tfa.keybank.com/v1_11/service/objects}FlashList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondFactor", propOrder = {
    "deviceInfo",
    "cookieList",
    "flashList"
})
public class SecondFactor {

    @XmlElement(name = "DeviceInfo", required = true)
    protected DeviceInfo deviceInfo;
    @XmlElement(name = "CookieList")
    protected CookieList cookieList;
    @XmlElement(name = "FlashList")
    protected FlashList flashList;

    /**
     * Gets the value of the deviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInfo }
     *     
     */
    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * Sets the value of the deviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInfo }
     *     
     */
    public void setDeviceInfo(DeviceInfo value) {
        this.deviceInfo = value;
    }

    /**
     * Gets the value of the cookieList property.
     * 
     * @return
     *     possible object is
     *     {@link CookieList }
     *     
     */
    public CookieList getCookieList() {
        return cookieList;
    }

    /**
     * Sets the value of the cookieList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CookieList }
     *     
     */
    public void setCookieList(CookieList value) {
        this.cookieList = value;
    }

    /**
     * Gets the value of the flashList property.
     * 
     * @return
     *     possible object is
     *     {@link FlashList }
     *     
     */
    public FlashList getFlashList() {
        return flashList;
    }

    /**
     * Sets the value of the flashList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashList }
     *     
     */
    public void setFlashList(FlashList value) {
        this.flashList = value;
    }

}
