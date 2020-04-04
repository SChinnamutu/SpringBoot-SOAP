
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * <p>Java class for MaintainAppIdCIX complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainAppIdCIX"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CIXNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelegationGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainAppIdCIX", propOrder = {
    "adminUID",
    "tamuid",
    "cixNumber",
    "delegationGroup"
})
public class MaintainAppIdCIX
    extends Request
{

    @XmlElement(name = "AdminUID", required = true)
    protected String adminUID;
    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "CIXNumber")
    protected String cixNumber;
    @XmlElement(name = "DelegationGroup")
    protected String delegationGroup;

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
     * Gets the value of the cixNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIXNumber() {
        return cixNumber;
    }

    /**
     * Sets the value of the cixNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIXNumber(String value) {
        this.cixNumber = value;
    }

    /**
     * Gets the value of the delegationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationGroup() {
        return delegationGroup;
    }

    /**
     * Sets the value of the delegationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationGroup(String value) {
        this.delegationGroup = value;
    }

}
