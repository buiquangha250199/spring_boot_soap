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
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secondNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "firstNumber",
    "secondNumber"
})
@XmlRootElement(name = "getSumRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
public class GetSumRequest {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    protected int firstNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    protected int secondNumber;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    protected int thirdNumber;

    /**
     * Gets the value of the firstNumber property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * Sets the value of the firstNumber property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public void setFirstNumber(int value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the secondNumber property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public int getSecondNumber() {
        return secondNumber;
    }

    /**
     * Sets the value of the secondNumber property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public void setSecondNumber(int value) {
        this.secondNumber = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public int get3rdNumber() {
        return secondNumber;
    }

    /**
     * Sets the value of the secondNumber property.
     *
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-05-21T07:37:33+07:00", comments = "JAXB RI v2.3.2")
    public void set3rdNumber(int value) {
        this.thirdNumber = value;
    }

}