
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDTransactionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDTransactionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionRequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TFATransactionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Questions" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDQuestions" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDTransactionResult", propOrder = {
    "transactionID",
    "transactionRequestID",
    "tfaTransactionID",
    "result",
    "questions",
    "information"
})
public class VerIDTransactionResult {

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "TransactionRequestID", required = true)
    protected String transactionRequestID;
    @XmlElement(name = "TFATransactionID", required = true)
    protected String tfaTransactionID;
    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "Questions")
    protected VerIDQuestions questions;
    @XmlElement(name = "Information")
    protected List<VerIDInformation> information;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRequestID() {
        return transactionRequestID;
    }

    /**
     * Sets the value of the transactionRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRequestID(String value) {
        this.transactionRequestID = value;
    }

    /**
     * Gets the value of the tfaTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFATransactionID() {
        return tfaTransactionID;
    }

    /**
     * Sets the value of the tfaTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFATransactionID(String value) {
        this.tfaTransactionID = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the questions property.
     * 
     * @return
     *     possible object is
     *     {@link VerIDQuestions }
     *     
     */
    public VerIDQuestions getQuestions() {
        return questions;
    }

    /**
     * Sets the value of the questions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerIDQuestions }
     *     
     */
    public void setQuestions(VerIDQuestions value) {
        this.questions = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDInformation }
     * 
     * 
     */
    public List<VerIDInformation> getInformation() {
        if (information == null) {
            information = new ArrayList<VerIDInformation>();
        }
        return this.information;
    }

}
