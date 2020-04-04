
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Change Username operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * CurrentPassword: The password for the TAMUID.
 * OldTAMUID: The user ID that the user is migrating from.
 * 
 * <p>Java class for ChangeUsername complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeUsername"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OldTAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeUsername", propOrder = {
    "tamuid",
    "currentPassword",
    "oldTAMUID"
})
public class ChangeUsername
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "CurrentPassword", required = true)
    protected String currentPassword;
    @XmlElement(name = "OldTAMUID", required = true)
    protected String oldTAMUID;

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
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

    /**
     * Gets the value of the oldTAMUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTAMUID() {
        return oldTAMUID;
    }

    /**
     * Sets the value of the oldTAMUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTAMUID(String value) {
        this.oldTAMUID = value;
    }

}
