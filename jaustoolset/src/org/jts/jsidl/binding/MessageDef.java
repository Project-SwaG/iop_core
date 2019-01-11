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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{urn:jaus:jsidl:1.0}description"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}header"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_header"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}body"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_body"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}footer"/>
 *           &lt;element ref="{urn:jaus:jsidl:1.0}declared_footer"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{urn:jaus:jsidl:1.0}identifier" />
 *       &lt;attribute name="message_id" use="required" type="{http://www.w3.org/2001/XMLSchema}hexBinary" />
 *       &lt;attribute name="is_command" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "header",
    "declaredHeader",
    "body",
    "declaredBody",
    "footer",
    "declaredFooter"
})
@XmlRootElement(name = "message_def")
public class MessageDef {

    @XmlElement(required = true)
    protected Description description;
    protected Header header;
    @XmlElement(name = "declared_header")
    protected DeclaredHeader declaredHeader;
    protected Body body;
    @XmlElement(name = "declared_body")
    protected DeclaredBody declaredBody;
    protected Footer footer;
    @XmlElement(name = "declared_footer")
    protected DeclaredFooter declaredFooter;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "message_id", required = true)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] messageId;
    @XmlAttribute(name = "is_command", required = true)
    protected boolean isCommand;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the declaredHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredHeader }
     *     
     */
    public DeclaredHeader getDeclaredHeader() {
        return declaredHeader;
    }

    /**
     * Sets the value of the declaredHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredHeader }
     *     
     */
    public void setDeclaredHeader(DeclaredHeader value) {
        this.declaredHeader = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the declaredBody property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredBody }
     *     
     */
    public DeclaredBody getDeclaredBody() {
        return declaredBody;
    }

    /**
     * Sets the value of the declaredBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredBody }
     *     
     */
    public void setDeclaredBody(DeclaredBody value) {
        this.declaredBody = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link Footer }
     *     
     */
    public Footer getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footer }
     *     
     */
    public void setFooter(Footer value) {
        this.footer = value;
    }

    /**
     * Gets the value of the declaredFooter property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredFooter }
     *     
     */
    public DeclaredFooter getDeclaredFooter() {
        return declaredFooter;
    }

    /**
     * Sets the value of the declaredFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredFooter }
     *     
     */
    public void setDeclaredFooter(DeclaredFooter value) {
        this.declaredFooter = value;
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
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(byte[] value) {
        this.messageId = ((byte[]) value);
    }

    /**
     * Gets the value of the isCommand property.
     * 
     */
    public boolean isIsCommand() {
        return isCommand;
    }

    /**
     * Sets the value of the isCommand property.
     * 
     */
    public void setIsCommand(boolean value) {
        this.isCommand = value;
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
