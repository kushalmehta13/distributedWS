//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
<<<<<<< HEAD
// Generated on: 2018.11.18 at 10:33:28 PM EST 
=======
<<<<<<< HEAD
// Generated on: 2018.11.17 at 04:53:11 PM EST 
=======
// Generated on: 2018.11.18 at 03:33:33 PM EST 
>>>>>>> e50eee3992f46da80caf64bd74ff6a9c119e104a
>>>>>>> master
//


package org.example.calculatordescription;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="var1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="var2" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "var1",
    "var2"
})
@XmlRootElement(name = "getProductRequest")
public class GetProductRequest {

    protected int var1;
    protected int var2;

    /**
     * Gets the value of the var1 property.
     * 
     */
    public int getVar1() {
        return var1;
    }

    /**
     * Sets the value of the var1 property.
     * 
     */
    public void setVar1(int value) {
        this.var1 = value;
    }

    /**
     * Gets the value of the var2 property.
     * 
     */
    public int getVar2() {
        return var2;
    }

    /**
     * Sets the value of the var2 property.
     * 
     */
    public void setVar2(int value) {
        this.var2 = value;
    }

}
