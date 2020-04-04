
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ChoiceID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDAnswer", propOrder = {
    "questionID",
    "choiceID"
})
public class VerIDAnswer {

    @XmlElement(name = "QuestionID")
    protected long questionID;
    @XmlElement(name = "ChoiceID", type = Long.class)
    protected List<Long> choiceID;

    /**
     * Gets the value of the questionID property.
     * 
     */
    public long getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     */
    public void setQuestionID(long value) {
        this.questionID = value;
    }

    /**
     * Gets the value of the choiceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choiceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoiceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getChoiceID() {
        if (choiceID == null) {
            choiceID = new ArrayList<Long>();
        }
        return this.choiceID;
    }

}
