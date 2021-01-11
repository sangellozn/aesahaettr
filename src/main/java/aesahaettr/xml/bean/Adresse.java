//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.11 à 04:38:41 PM CET 
//


package aesahaettr.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ligne1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ligne2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ligne3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lieuDit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localiteDestination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paysCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.aesahaettr.me/aesahaettr}UIID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "ligne1",
    "ligne2",
    "ligne3",
    "lieuDit",
    "codePostal",
    "localiteDestination",
    "paysCode"
})
public class Adresse {

    @XmlElement(required = true)
    protected String ligne1;
    protected String ligne2;
    protected String ligne3;
    protected String lieuDit;
    @XmlElement(required = true)
    protected String codePostal;
    @XmlElement(required = true)
    protected String localiteDestination;
    @XmlElement(required = true)
    protected String paysCode;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtient la valeur de la propriété ligne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne1() {
        return ligne1;
    }

    /**
     * Définit la valeur de la propriété ligne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne1(String value) {
        this.ligne1 = value;
    }

    /**
     * Obtient la valeur de la propriété ligne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne2() {
        return ligne2;
    }

    /**
     * Définit la valeur de la propriété ligne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne2(String value) {
        this.ligne2 = value;
    }

    /**
     * Obtient la valeur de la propriété ligne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLigne3() {
        return ligne3;
    }

    /**
     * Définit la valeur de la propriété ligne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLigne3(String value) {
        this.ligne3 = value;
    }

    /**
     * Obtient la valeur de la propriété lieuDit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuDit() {
        return lieuDit;
    }

    /**
     * Définit la valeur de la propriété lieuDit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuDit(String value) {
        this.lieuDit = value;
    }

    /**
     * Obtient la valeur de la propriété codePostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit la valeur de la propriété codePostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

    /**
     * Obtient la valeur de la propriété localiteDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaliteDestination() {
        return localiteDestination;
    }

    /**
     * Définit la valeur de la propriété localiteDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaliteDestination(String value) {
        this.localiteDestination = value;
    }

    /**
     * Obtient la valeur de la propriété paysCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysCode() {
        return paysCode;
    }

    /**
     * Définit la valeur de la propriété paysCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysCode(String value) {
        this.paysCode = value;
    }

    /**
     * Obtient la valeur de la propriété id.
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
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
