
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accept" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AcceptEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Referer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CharacterEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemoteAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RemoteHost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Plugins" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fonts" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Hostname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {
    "accept",
    "acceptEncoding",
    "referer",
    "userAgent",
    "characterEncoding",
    "locale",
    "remoteAddress",
    "remoteHost",
    "plugins",
    "fonts",
    "resolution",
    "hostname"
})
public class DeviceInfo {

    @XmlElement(name = "Accept", required = true)
    protected String accept;
    @XmlElement(name = "AcceptEncoding", required = true)
    protected String acceptEncoding;
    @XmlElement(name = "Referer", required = true)
    protected String referer;
    @XmlElement(name = "UserAgent", required = true)
    protected String userAgent;
    @XmlElement(name = "CharacterEncoding", required = true)
    protected String characterEncoding;
    @XmlElement(name = "Locale", required = true)
    protected String locale;
    @XmlElement(name = "RemoteAddress", required = true)
    protected String remoteAddress;
    @XmlElement(name = "RemoteHost", required = true)
    protected String remoteHost;
    @XmlElement(name = "Plugins", required = true)
    protected String plugins;
    @XmlElement(name = "Fonts", required = true)
    protected String fonts;
    @XmlElement(name = "Resolution", required = true)
    protected String resolution;
    @XmlElement(name = "Hostname", required = true)
    protected String hostname;

    /**
     * Gets the value of the accept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccept() {
        return accept;
    }

    /**
     * Sets the value of the accept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccept(String value) {
        this.accept = value;
    }

    /**
     * Gets the value of the acceptEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    /**
     * Sets the value of the acceptEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptEncoding(String value) {
        this.acceptEncoding = value;
    }

    /**
     * Gets the value of the referer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferer() {
        return referer;
    }

    /**
     * Sets the value of the referer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferer(String value) {
        this.referer = value;
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
     * Gets the value of the characterEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * Sets the value of the characterEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterEncoding(String value) {
        this.characterEncoding = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
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
     * Gets the value of the remoteHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteHost() {
        return remoteHost;
    }

    /**
     * Sets the value of the remoteHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteHost(String value) {
        this.remoteHost = value;
    }

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugins(String value) {
        this.plugins = value;
    }

    /**
     * Gets the value of the fonts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonts() {
        return fonts;
    }

    /**
     * Sets the value of the fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonts(String value) {
        this.fonts = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

}
