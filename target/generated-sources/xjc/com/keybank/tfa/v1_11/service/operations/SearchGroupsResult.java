
package com.keybank.tfa.v1_11.service.operations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.GroupList;
import com.keybank.tfa.v1_11.service.objects.Result;
import com.keybank.tfa.v1_11.service.objects.StatusInfo;


/**
 * The response object for the Search Groups operation.
 * Properties:
 * StatusInfo: Standard operation result status object.
 * GroupList: A list of TAM groups matching the input group name.
 * 
 * <p>Java class for SearchGroupsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchGroupsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Result"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusInfo" type="{http://tfa.keybank.com/v1_11/service/objects}StatusInfo"/&gt;
 *         &lt;element name="GroupList" type="{http://tfa.keybank.com/v1_11/service/objects}GroupList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchGroupsResult", propOrder = {
    "statusInfo",
    "groupList"
})
public class SearchGroupsResult
    extends Result
{

    @XmlElement(name = "StatusInfo", required = true)
    protected StatusInfo statusInfo;
    @XmlElement(name = "GroupList", required = true)
    protected GroupList groupList;

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
     * Gets the value of the groupList property.
     * 
     * @return
     *     possible object is
     *     {@link GroupList }
     *     
     */
    public GroupList getGroupList() {
        return groupList;
    }

    /**
     * Sets the value of the groupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupList }
     *     
     */
    public void setGroupList(GroupList value) {
        this.groupList = value;
    }

}
