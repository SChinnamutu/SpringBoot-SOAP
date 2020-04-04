
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Fraud Alert operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * AdminUID: The user ID of the administrator running the operation. This
 * administrator must have the tfaFraudInvestigator group.
 * FraudAlert: A flag to control adding or removing the fraud alert.
 * 
 * <p>Java class for FraudAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdminUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FraudAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudAlert", propOrder = {
    "tamuid",
    "adminUID",
    "fraudAlert"
})
public class FraudAlert
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "AdminUID", required = true)
    protected String adminUID;
    @XmlElement(name = "FraudAlert")
    protected boolean fraudAlert;

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
     * Gets the value of the fraudAlert property.
     * 
     */
    public boolean isFraudAlert() {
        return fraudAlert;
    }

    /**
     * Sets the value of the fraudAlert property.
     * 
     */
    public void setFraudAlert(boolean value) {
        this.fraudAlert = value;
    }

}
