
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.GSOResourceList;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * <p>Java class for AssociateGSOResource complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateGSOResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GSOPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GSOResourceList" type="{http://tfa.keybank.com/v1_11/service/objects}GSOResourceList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateGSOResource", propOrder = {
    "adminUID",
    "tamuid",
    "gsoPassword",
    "gsoResourceList"
})
public class AssociateGSOResource
    extends Request
{

    @XmlElement(name = "AdminUID", required = true)
    protected String adminUID;
    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "GSOPassword", required = true)
    protected String gsoPassword;
    @XmlElement(name = "GSOResourceList", required = true)
    protected GSOResourceList gsoResourceList;

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
     * Gets the value of the gsoPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSOPassword() {
        return gsoPassword;
    }

    /**
     * Sets the value of the gsoPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSOPassword(String value) {
        this.gsoPassword = value;
    }

    /**
     * Gets the value of the gsoResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link GSOResourceList }
     *     
     */
    public GSOResourceList getGSOResourceList() {
        return gsoResourceList;
    }

    /**
     * Sets the value of the gsoResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSOResourceList }
     *     
     */
    public void setGSOResourceList(GSOResourceList value) {
        this.gsoResourceList = value;
    }

}
