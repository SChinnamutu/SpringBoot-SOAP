
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDAnswers complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDAnswers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionSetID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Answer" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDAnswer" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDAnswers", propOrder = {
    "questionSetID",
    "answer"
})
public class VerIDAnswers {

    @XmlElement(name = "QuestionSetID")
    protected long questionSetID;
    @XmlElement(name = "Answer", required = true)
    protected List<VerIDAnswer> answer;

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
     * Gets the value of the answer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDAnswer }
     * 
     * 
     */
    public List<VerIDAnswer> getAnswer() {
        if (answer == null) {
            answer = new ArrayList<VerIDAnswer>();
        }
        return this.answer;
    }

}
