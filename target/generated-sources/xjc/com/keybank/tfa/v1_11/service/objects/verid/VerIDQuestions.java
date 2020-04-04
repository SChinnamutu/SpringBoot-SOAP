
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDQuestions complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDQuestions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionSetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Question" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDQuestion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDQuestions", propOrder = {
    "questionSetID",
    "question"
})
public class VerIDQuestions {

    @XmlElement(name = "QuestionSetID")
    protected long questionSetID;
    @XmlElement(name = "Question", required = true)
    protected List<VerIDQuestion> question;

    /**
     * Gets the value of the questionSetID property.
     * 
     */
    public long getQuestionSetID() {
        return questionSetID;
    }

    /**
     * Sets the value of the questionSetID property.
     * 
     */
    public void setQuestionSetID(long value) {
        this.questionSetID = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDQuestion }
     * 
     * 
     */
    public List<VerIDQuestion> getQuestion() {
        if (question == null) {
            question = new ArrayList<VerIDQuestion>();
        }
        return this.question;
    }

}
