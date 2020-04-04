
package com.keybank.tfa.v1_11.service.operations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.keybank.tfa.v1_11.service.objects.Request;


/**
 * The request object for the Challenge User operation.
 * Properties:
 * TAMUID: The user ID to run the operation on.
 * QuestionCount: The number of questions to return. Valid values are 1 and 3.
 * QuestionsUser: A list of questions numbers that have already been used in the
 * current session. Question numbers in this list will not be returned from this
 * operation call.
 * 
 * <p>Java class for ChallengeUser complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChallengeUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tfa.keybank.com/v1_11/service/objects}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAMUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuestionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QuestionsUsed" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChallengeUser", propOrder = {
    "tamuid",
    "questionCount",
    "questionsUsed"
})
public class ChallengeUser
    extends Request
{

    @XmlElement(name = "TAMUID", required = true)
    protected String tamuid;
    @XmlElement(name = "QuestionCount")
    protected Integer questionCount;
    @XmlElement(name = "QuestionsUsed", type = Integer.class)
    protected List<Integer> questionsUsed;

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
     * Gets the value of the questionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuestionCount() {
        return questionCount;
    }

    /**
     * Sets the value of the questionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuestionCount(Integer value) {
        this.questionCount = value;
    }

    /**
     * Gets the value of the questionsUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionsUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionsUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getQuestionsUsed() {
        if (questionsUsed == null) {
            questionsUsed = new ArrayList<Integer>();
        }
        return this.questionsUsed;
    }

}
