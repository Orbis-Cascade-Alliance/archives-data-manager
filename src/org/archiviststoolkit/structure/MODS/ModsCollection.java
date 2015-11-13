//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.22 at 10:33:51 PM EDT 
//


package org.archiviststoolkit.structure.MODS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
//import org.archiviststoolkit.structure.MODS.ModsCollection;
import org.archiviststoolkit.structure.MODS.ModsType;


/**
 * <p>Java class for modsCollection element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="modsCollection">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/mods/v3}mods" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mods"
})
@XmlRootElement(name = "modsCollection")
public class ModsCollection {

    @XmlElement(namespace = "http://www.loc.gov/mods/v3")
    protected List<ModsType> mods;

    /**
     * Gets the value of the mods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModsType }
     * 
     * 
     */
    public List<ModsType> getMods() {
        if (mods == null) {
            mods = new ArrayList<ModsType>();
        }
        return this.mods;
    }

}
