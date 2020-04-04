
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDQuestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AnswerType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QuestionText" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuestionChoice" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDChoice" maxOccurs="unbounded"/&gt;
 *         &lt;element name="HelpText" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDQuestion", propOrder = {
    "questionID",
    "answerType",
    "questionText",
    "questionChoice",
    "helpText"
})
public class VerIDQuestion {

    @XmlElement(name = "QuestionID")
    protected long questionID;
    @XmlElement(name = "AnswerType", required = true)
    protected String answerType;
    @XmlElement(name = "QuestionText")
    protected List<VerIDText> questionText;
    @XmlElement(name = "QuestionChoice", required = true)
    protected List<VerIDChoice> questionChoice;
    @XmlElement(name = "HelpText")
    protected List<VerIDText> helpText;

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
     * Gets the value of the answerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerType(String value) {
        this.answerType = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDText }
     * 
     * 
     */
    public List<VerIDText> getQuestionText() {
        if (questionText == null) {
            questionText = new ArrayList<VerIDText>();
        }
        return this.questionText;
    }

    /**
     * Gets the value of the questionChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDChoice }
     * 
     * 
     */
    public List<VerIDChoice> getQuestionChoice() {
        if (questionChoice == null) {
            questionChoice = new ArrayList<VerIDChoice>();
        }
        return this.questionChoice;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the helpText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHelpText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDText }
     * 
     * 
     */
    public List<VerIDText> getHelpText() {
        if (helpText == null) {
            helpText = new ArrayList<VerIDText>();
        }
        return this.helpText;
    }

}
