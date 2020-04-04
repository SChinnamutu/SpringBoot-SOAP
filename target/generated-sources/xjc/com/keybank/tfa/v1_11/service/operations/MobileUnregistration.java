
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Mobile Device Unregistration operation.
 * 						Properties:
 * 						TAMUID: The user ID to run the operation on.
 * 						AdminUID: The user ID of the administrator running the operation. Making this
 * 						the same as the TAMUID allows a user to unregister their own device.
 * 						MobileToken: Mobile Token that was provided during mobile registration.
 * 					
 * 
 * <p>Java class for MobileUnregistration complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileUnregistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MobileToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisableAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileUnregistration", propOrder = {
    "tamuid",
    "adminUID",
    "mobileToken",
    "disableAll"
})
public class MobileUnregistration
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "AdminUID", required = true)
    protected String adminUID;
    @XmlElement(name = "MobileToken")
    protected String mobileToken;
    @XmlElement(name = "DisableAll")
    protected boolean disableAll;

    /**
     * Gets the value of the tamuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAMUID() {
        return tamuid;
    }

    /**
     * Sets the value of the tamuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAMUID(String value) {
        this.tamuid = value;
    }

    /**
     * Gets the value of the adminUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUID() {
        return adminUID;
    }

    /**
     * Sets the value of the adminUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUID(String value) {
        this.adminUID = value;
    }

    /**
     * Gets the value of the mobileToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileToken() {
        return mobileToken;
    }

    /**
     * Sets the value of the mobileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileToken(String value) {
        this.mobileToken = value;
    }

    /**
     * Gets the value of the disableAll property.
     * 
     */
    public boolean isDisableAll() {
        return disableAll;
    }

    /**
     * Sets the value of the disableAll property.
     * 
     */
    public void setDisableAll(boolean value) {
        this.disableAll = value;
    }

}
