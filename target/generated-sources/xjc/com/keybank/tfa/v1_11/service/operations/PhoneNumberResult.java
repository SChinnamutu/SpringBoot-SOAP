
package com.keybank.tfa.v1_11.service.operations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.PhoneNumberData;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Set Phone Number operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * PhoneNumber: One or more sets of data defining phone numbers for the user.
 * 
 * <p>Java class for PhoneNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneNumberResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://tfa.keybank.com/v1_11/service/objects}PhoneNumberData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneNumberResult", propOrder = {
    "statusInfo",
    "phoneNumber"
})
public class PhoneNumberResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "PhoneNumber", required = true)
    protected List<PhoneNumberData> phoneNumber;

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusInfo }
     *     
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInfo }
     *     
     */
    public void setStatusInfo(StatusInfo value) {
        this.statusInfo = value;
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
