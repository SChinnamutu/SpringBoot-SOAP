
package com.keybank.tfa.v1_11.service.objects.verid;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerIDChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerIDChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChoiceID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Text" type="{http://tfa.keybank.com/v1_11/service/objects/verid}VerIDText" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerIDChoice", propOrder = {
    "choiceID",
    "text"
})
public class VerIDChoice {

    @XmlElement(name = "ChoiceID")
    protected long choiceID;
    @XmlElement(name = "Text", required = true)
    protected List<VerIDText> text;

    /**
     * Gets the value of the choiceID property.
     * 
     */
    public long getChoiceID() {
        return choiceID;
    }

    /**
     * Sets the value of the choiceID property.
     * 
     */
    public void setChoiceID(long value) {
        this.choiceID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerIDText }
     * 
     * 
     */
    public List<VerIDText> getText() {
        if (text == null) {
            text = new ArrayList<VerIDText>();
        }
        return this.text;
    }

}
