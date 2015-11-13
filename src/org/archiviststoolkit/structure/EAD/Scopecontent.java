//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.11 at 01:13:59 PM EDT 
//


package org.archiviststoolkit.structure.EAD;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for scopecontent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scopecontent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{urn:isbn:1-931666-22-9}head" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;group ref="{urn:isbn:1-931666-22-9}m.blocks"/>
 *           &lt;element name="arrangement" type="{urn:isbn:1-931666-22-9}arrangement"/>
 *           &lt;element name="scopecontent" type="{urn:isbn:1-931666-22-9}scopecontent"/>
 *           &lt;element name="dao" type="{urn:isbn:1-931666-22-9}dao"/>
 *           &lt;element name="daogrp" type="{urn:isbn:1-931666-22-9}daogrp"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *       &lt;attribute name="encodinganalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scopecontent", namespace = "urn:isbn:1-931666-22-9", propOrder = {
    "head",
    "addressOrChronlistOrList"
})
public class Scopecontent {

    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Head head;
    @XmlElements({
        @XmlElement(name = "scopecontent", namespace = "urn:isbn:1-931666-22-9", type = Scopecontent.class),
        @XmlElement(name = "arrangement", namespace = "urn:isbn:1-931666-22-9", type = Arrangement.class),
        @XmlElement(name = "list", namespace = "urn:isbn:1-931666-22-9", type = org.archiviststoolkit.structure.EAD.List.class),
        @XmlElement(name = "blockquote", namespace = "urn:isbn:1-931666-22-9", type = Blockquote.class),
        @XmlElement(name = "address", namespace = "urn:isbn:1-931666-22-9", type = Address.class),
        @XmlElement(name = "note", namespace = "urn:isbn:1-931666-22-9", type = Note.class),
        @XmlElement(name = "dao", namespace = "urn:isbn:1-931666-22-9", type = Dao.class),
        @XmlElement(name = "table", namespace = "urn:isbn:1-931666-22-9", type = Table.class),
        @XmlElement(name = "chronlist", namespace = "urn:isbn:1-931666-22-9", type = Chronlist.class),
        @XmlElement(name = "daogrp", namespace = "urn:isbn:1-931666-22-9", type = Daogrp.class),
        @XmlElement(name = "p", namespace = "urn:isbn:1-931666-22-9", type = P.class)
    })
    protected java.util.List<Object> addressOrChronlistOrList;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String encodinganalog;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the value of the addressOrChronlistOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrChronlistOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrChronlistOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scopecontent }
     * {@link Arrangement }
     * {@link org.archiviststoolkit.structure.EAD.List }
     * {@link Blockquote }
     * {@link Address }
     * {@link Note }
     * {@link Dao }
     * {@link Table }
     * {@link Chronlist }
     * {@link Daogrp }
     * {@link P }
     * 
     * 
     */
    public java.util.List<Object> getAddressOrChronlistOrList() {
        if (addressOrChronlistOrList == null) {
            addressOrChronlistOrList = new ArrayList<Object>();
        }
        return this.addressOrChronlistOrList;
    }

    /**
     * Gets the value of the encodinganalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodinganalog() {
        return encodinganalog;
    }

    /**
     * Sets the value of the encodinganalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodinganalog(String value) {
        this.encodinganalog = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

}
