
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Verify Temp PIN operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * TempPIN: The temporary PIN to validate.
 * ApplicationTempPIN: The application temporary PIN to validate.
 * 
 * <p>Java class for VerifyTempPIN complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyTempPIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TempPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationTempPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyTempPIN", propOrder = {
    "tamuid",
    "tempPIN",
    "applicationTempPIN"
})
public class VerifyTempPIN
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "TempPIN", required = true)
    protected String tempPIN;
    @XmlElement(name = "ApplicationTempPIN", required = true)
    protected String applicationTempPIN;

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
     * Gets the value of the tempPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPIN() {
        return tempPIN;
    }

    /**
     * Sets the value of the tempPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPIN(String value) {
        this.tempPIN = value;
    }

    /**
     * Gets the value of the applicationTempPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationTempPIN() {
        return applicationTempPIN;
    }

    /**
     * Sets the value of the applicationTempPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationTempPIN(String value) {
        this.applicationTempPIN = value;
    }

}
