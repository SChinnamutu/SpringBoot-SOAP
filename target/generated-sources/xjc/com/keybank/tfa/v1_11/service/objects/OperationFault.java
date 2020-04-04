
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="FaultHeader" type="{http://tfa.keybank.com/v1_11/service/objects}Header"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "faultInfo",
    "faultHeader"
})
@XmlRootElement(name = "OperationFault")
public class OperationFault {

    @XmlElement(name = "FaultInfo", required = true)
    protected StatusInfo faultInfo;
    @XmlElement(name = "FaultHeader", required = true)
    protected Header faultHeader;

    /**
     * Gets the value of the faultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StatusInfo }
     *     
     */
    public StatusInfo getFaultInfo() {
        return faultInfo;
    }

    /**
     * Sets the value of the faultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInfo }
     *     
     */
    public void setFaultInfo(StatusInfo value) {
        this.faultInfo = value;
    }

    /**
     * Gets the value of the faultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getFaultHeader() {
        return faultHeader;
    }

    /**
     * Sets the value of the faultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setFaultHeader(Header value) {
        this.faultHeader = value;
    }

}
