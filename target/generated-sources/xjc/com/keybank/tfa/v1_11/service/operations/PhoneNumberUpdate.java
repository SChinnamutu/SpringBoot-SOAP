
package com.keybank.tfa.v1_11.service.operations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.PhoneNumberData;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Set Phone Number operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * AdminUID: (Optional) The user ID of the administrator running the operation.
 * PhoneNumber: A set of data for defining a phone number.
 * 
 * <p>Java class for PhoneNumberUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumberUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://tfa.keybank.com/v1_11/service/objects}PhoneNumberData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumberUpdate", propOrder = {
    "tamuid",
    "adminUID",
    "phoneNumber"
})
public class PhoneNumberUpdate
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "AdminUID")
    protected String adminUID;
    @XmlElement(name = "PhoneNumber")
    protected List<PhoneNumberData> phoneNumber;

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
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumberData }
     * 
     * 
     */
    public List<PhoneNumberData> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumberData>();
        }
        return this.phoneNumber;
    }

}
