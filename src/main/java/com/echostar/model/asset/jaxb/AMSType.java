//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.20 at 04:11:07 PM MDT 
//


package com.echostar.model.asset.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 
 * <p>Java class for AMSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="Asset_Class" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="package"/>
 *             &lt;enumeration value="title"/>
 *             &lt;enumeration value="movie"/>
 *             &lt;enumeration value="preview"/>
 *             &lt;enumeration value="poster"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Asset_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Asset_Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Creation_Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Product" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Provider" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Provider_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version_Major" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Version_Minor" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMSType")
public class AMSType {

    @XmlAttribute(name = "Asset_Class", required = true)
    protected String assetClass;
    @XmlAttribute(name = "Asset_ID", required = true)
    protected String assetID;
    @XmlAttribute(name = "Asset_Name", required = true)
    protected String assetName;
    @XmlAttribute(name = "Creation_Date", required = true)
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "Product", required = true)
    protected String product;
    @XmlAttribute(name = "Provider", required = true)
    protected String provider;
    @XmlAttribute(name = "Provider_ID", required = true)
    protected String providerID;
    @XmlAttribute(name = "Version_Major", required = true)
    protected BigInteger versionMajor;
    @XmlAttribute(name = "Version_Minor", required = true)
    protected BigInteger versionMinor;

    /**
     * Gets the value of the assetClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * Sets the value of the assetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetClass(String value) {
        this.assetClass = value;
    }

    /**
     * Gets the value of the assetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetID() {
        return assetID;
    }

    /**
     * Sets the value of the assetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetID(String value) {
        this.assetID = value;
    }

    /**
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the versionMajor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionMajor() {
        return versionMajor;
    }

    /**
     * Sets the value of the versionMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionMajor(BigInteger value) {
        this.versionMajor = value;
    }

    /**
     * Gets the value of the versionMinor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionMinor() {
        return versionMinor;
    }

    /**
     * Sets the value of the versionMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionMinor(BigInteger value) {
        this.versionMinor = value;
    }

}
