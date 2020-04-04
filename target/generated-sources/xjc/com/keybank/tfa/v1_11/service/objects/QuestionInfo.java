
package com.keybank.tfa.v1_11.service.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An object used for representation of challenge questions and their associated answers.
 * Properties:
 * RequestID: A (mostly) unique identifier for the request set by your
 * application. Set in the request.
 * MessageDateTime: The date/time this request/response was sent. Returned in the response.
 * ReceiverID: An identifier for the application sending the request, typically your application TLA. Set in the request.
 * TackingNumber: A tracking number for the TFA request. Returned in the response.
 * ServerName: This field contains the name of the TFA server that processed the request. Returned in the response.
 * MaintenanceOverride: The MaintenanceOverride element is used for testing only! Applications consuming TFA should never set this value to true.
 * 
 * <p>Java class for QuestionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuestionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionInfo", propOrder = {
    "questionID",
    "questionText",
    "answer",
    "status",
    "userSelected"
})
public class QuestionInfo {

    @XmlElement(name = "QuestionID")
    protected String questionID;
    @XmlElement(name = "QuestionText")
    protected String questionText;
    @XmlElement(name = "Answer")
    protected String answer;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "UserSelected")
    protected String userSelected;

    /**
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionID(String value) {
        this.questionID = value;
    }

    /**
     * Gets the value of the questionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Sets the value of the questionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionText(String value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the userSelected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSelected() {
        return userSelected;
    }

    /**
     * Sets the value of the userSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSelected(String value) {
        this.userSelected = value;
    }

}
