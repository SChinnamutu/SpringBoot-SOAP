
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TAMUIDLastActivityDate complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAMUIDLastActivityDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAMUIDLastActivityDate", propOrder = {
    "tamuid",
    "lastActivityDate",
    "tla"
})
public class TAMUIDLastActivityDate {

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "LastActivityDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "TLA")
    protected String tla;

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
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDate(XMLGregorianCalendar value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the tla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLA() {
        return tla;
    }

    /**
     * Sets the value of the tla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLA(String value) {
        this.tla = value;
    }

}
