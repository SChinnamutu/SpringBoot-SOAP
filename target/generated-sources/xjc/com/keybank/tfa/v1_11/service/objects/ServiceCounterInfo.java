
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCounterInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvalidAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Uses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InvalidAttemptsMax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsesMax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCounterInfo", propOrder = {
    "serviceName",
    "invalidAttempts",
    "uses",
    "invalidAttemptsMax",
    "usesMax"
})
public class ServiceCounterInfo {

    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "InvalidAttempts")
    protected int invalidAttempts;
    @XmlElement(name = "Uses")
    protected int uses;
    @XmlElement(name = "InvalidAttemptsMax")
    protected int invalidAttemptsMax;
    @XmlElement(name = "UsesMax")
    protected int usesMax;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the invalidAttempts property.
     * 
     */
    public int getInvalidAttempts() {
        return invalidAttempts;
    }

    /**
     * Sets the value of the invalidAttempts property.
     * 
     */
    public void setInvalidAttempts(int value) {
        this.invalidAttempts = value;
    }

    /**
     * Gets the value of the uses property.
     * 
     */
    public int getUses() {
        return uses;
    }

    /**
     * Sets the value of the uses property.
     * 
     */
    public void setUses(int value) {
        this.uses = value;
    }

    /**
     * Gets the value of the invalidAttemptsMax property.
     * 
     */
    public int getInvalidAttemptsMax() {
        return invalidAttemptsMax;
    }

    /**
     * Sets the value of the invalidAttemptsMax property.
     * 
     */
    public void setInvalidAttemptsMax(int value) {
        this.invalidAttemptsMax = value;
    }

    /**
     * Gets the value of the usesMax property.
     * 
     */
    public int getUsesMax() {
        return usesMax;
    }

    /**
     * Sets the value of the usesMax property.
     * 
     */
    public void setUsesMax(int value) {
        this.usesMax = value;
    }

}
