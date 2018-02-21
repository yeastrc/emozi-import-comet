//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.20 at 01:08:36 PM PDT 
//


package net.systemsbiology.regis_web.pepxml;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="search_score_summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="all_ntt_prob" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchScoreSummary"
})
@XmlRootElement(name = "interprophet_result")
public class InterprophetResult {

    @XmlElement(name = "search_score_summary")
    protected InterprophetResult.SearchScoreSummary searchScoreSummary;
    @XmlAttribute(name = "probability", required = true)
    protected BigDecimal probability;
    @XmlAttribute(name = "all_ntt_prob")
    protected String allNttProb;

    /**
     * Gets the value of the searchScoreSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InterprophetResult.SearchScoreSummary }
     *     
     */
    public InterprophetResult.SearchScoreSummary getSearchScoreSummary() {
        return searchScoreSummary;
    }

    /**
     * Sets the value of the searchScoreSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterprophetResult.SearchScoreSummary }
     *     
     */
    public void setSearchScoreSummary(InterprophetResult.SearchScoreSummary value) {
        this.searchScoreSummary = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProbability(BigDecimal value) {
        this.probability = value;
    }

    /**
     * Gets the value of the allNttProb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNttProb() {
        return allNttProb;
    }

    /**
     * Sets the value of the allNttProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNttProb(String value) {
        this.allNttProb = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parameter"
    })
    public static class SearchScoreSummary {

        @XmlElement(required = true)
        protected List<NameValueType> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NameValueType }
         * 
         * 
         */
        public List<NameValueType> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<NameValueType>();
            }
            return this.parameter;
        }

    }

}