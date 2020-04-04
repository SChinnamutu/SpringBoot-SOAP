
package com.keybank.tfa.v1_11.service.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCounterList complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCounterList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceCounterInfo" type="{http://tfa.keybank.com/v1_11/service/objects}ServiceCounterInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCounterList", propOrder = {
    "serviceCounterInfo"
})
public class ServiceCounterList {

    @XmlElement(name = "ServiceCounterInfo")
    protected List<ServiceCounterInfo> serviceCounterInfo;

    /**
     * Gets the value of the serviceCounterInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCounterInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCounterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCounterInfo }
     * 
     * 
     */
    public List<ServiceCounterInfo> getServiceCounterInfo() {
        if (serviceCounterInfo == null) {
            serviceCounterInfo = new ArrayList<ServiceCounterInfo>();
        }
        return this.serviceCounterInfo;
    }

}
