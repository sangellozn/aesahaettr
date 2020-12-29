//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.12.29 à 05:55:54 PM CET 
//


package aesahaettr.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour objet complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="objet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeObjetCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}evenements"/>
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
@XmlType(name = "objet", propOrder = {
    "nom",
    "description",
    "typeObjetCode",
    "evenements"
})
public class Objet {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String typeObjetCode;
    @XmlElement(required = true)
    protected EvenementList evenements;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété description.
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
     * Définit la valeur de la propriété description.
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
     * Obtient la valeur de la propriété typeObjetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeObjetCode() {
        return typeObjetCode;
    }

    /**
     * Définit la valeur de la propriété typeObjetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeObjetCode(String value) {
        this.typeObjetCode = value;
    }

    /**
     * Obtient la valeur de la propriété evenements.
     * 
     * @return
     *     possible object is
     *     {@link EvenementList }
     *     
     */
    public EvenementList getEvenements() {
        return evenements;
    }

    /**
     * Définit la valeur de la propriété evenements.
     * 
     * @param value
     *     allowed object is
     *     {@link EvenementList }
     *     
     */
    public void setEvenements(EvenementList value) {
        this.evenements = value;
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
