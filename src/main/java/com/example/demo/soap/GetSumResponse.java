//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.21 at 07:37:33 AM ICT 
//


package com.example.demo.soap;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "error"
})
@XmlRootElement(name = "getSumResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
public class GetSumResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    protected int result;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    protected String error;

    /**
     * Gets the value of the result property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public int getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public void setError(String value) {
        this.error = value;
    }

}
