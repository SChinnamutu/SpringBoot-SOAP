
package com.keybank.tfa.v1_11.service.operations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;
import com.keybank.tfa.v1_11.service.objects.TAMUIDLastActivityDate;


/**
 * The response object for the Last Activity Date operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * TAMUIDActivityDate: A list of objects containing information on the most recent
 * date/time that users performed an operation.
 * 
 * <p>Java class for LastActivityDateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastActivityDateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="TAMUIDActivityDate" type="{http://tfa.keybank.com/v1_11/service/objects}TAMUIDLastActivityDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastActivityDateResult", propOrder = {
    "statusInfo",
    "tamuidActivityDate"
})
public class LastActivityDateResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "TAMUIDActivityDate")
    protected List<TAMUIDLastActivityDate> tamuidActivityDate;

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
     * Gets the value of the tamuidActivityDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tamuidActivityDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTAMUIDActivityDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAMUIDLastActivityDate }
     * 
     * 
     */
    public List<TAMUIDLastActivityDate> getTAMUIDActivityDate() {
        if (tamuidActivityDate == null) {
            tamuidActivityDate = new ArrayList<TAMUIDLastActivityDate>();
        }
        return this.tamuidActivityDate;
    }

}
