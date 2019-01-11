//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.21 at 10:07:33 AM CET 
//


package org.jts.jsidl.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


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
 *         &lt;element ref="{urn:jaus:jsidl:1.0}count_field"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:jaus:jsidl:1.0}attribute_field_format"/>
 *       &lt;attribute name="name" use="required" type="{urn:jaus:jsidl:1.0}identifier" />
 *       &lt;attribute name="optional" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="interpretation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countField"
})
@XmlRootElement(name = "variable_length_field")
public class VariableLengthField {

    @XmlElement(name = "count_field", required = true)
    protected CountField countField;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "optional", required = true)
    protected boolean optional;
    @XmlAttribute(name = "interpretation")
    @XmlSchemaType(name = "anySimpleType")
    protected String interpretation;
    @XmlAttribute(name = "field_format", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fieldFormat;

    /**
     * Gets the value of the countField property.
     * 
     * @return
     *     possible object is
     *     {@link CountField }
     *     
     */
    public CountField getCountField() {
        return countField;
    }

    /**
     * Sets the value of the countField property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountField }
     *     
     */
    public void setCountField(CountField value) {
        this.countField = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     */
    public boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     */
    public void setOptional(boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * Gets the value of the fieldFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldFormat() {
        return fieldFormat;
    }

    /**
     * Sets the value of the fieldFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldFormat(String value) {
        this.fieldFormat = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        String[] ignore={"interpretation"};
		return EqualsBuilder.reflectionEquals(this, that, ignore);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
