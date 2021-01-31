//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2021.01.15 à 10:46:54 PM CET
//


package aesahaettr.xml.bean;

import java.time.Instant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import aesahaettr.xml.InstantAdapter;


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
 *         &lt;element name="dateCreation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dateModification" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="typeObjetCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}evenementIds"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}localisations"/>
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
    "dateCreation",
    "dateModification",
    "typeObjetCode",
    "evenementIds",
    "localisations"
})
public class Objet {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "dateCreation", required = true)
    @XmlJavaTypeAdapter(InstantAdapter.class)
    protected Instant dateCreation;
    @XmlElement(name = "dateModification")
    @XmlJavaTypeAdapter(InstantAdapter.class)
    protected Instant dateModification;
    @XmlElement(required = true)
    protected String typeObjetCode;
    @XmlElement(required = true)
    protected EvenementIdList evenementIds;
    @XmlElement(required = true)
    protected LocalisationList localisations;
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
        return this.nom;
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
        return this.description;
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
     * Obtient la valeur de la propriété dateCreation.
     *
     * @return
     *     possible object is
     *     {@link Instant }
     *
     */
    public Instant getDateCreation() {
        return this.dateCreation;
    }

    /**
     * Définit la valeur de la propriété dateCreation.
     *
     * @param value
     *     allowed object is
     *     {@link Instant }
     *
     */
    public void setDateCreation(Instant value) {
        this.dateCreation = value;
    }

    /**
     * Obtient la valeur de la propriété dateModification.
     *
     * @return
     *     possible object is
     *     {@link Instant }
     *
     */
    public Instant getDateModification() {
        return this.dateModification;
    }

    /**
     * Définit la valeur de la propriété dateModification.
     *
     * @param value
     *     allowed object is
     *     {@link Instant }
     *
     */
    public void setDateModification(Instant value) {
        this.dateModification = value;
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
        return this.typeObjetCode;
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
     * Obtient la valeur de la propriété evenementIds.
     *
     * @return
     *     possible object is
     *     {@link EvenementIdList }
     *
     */
    public EvenementIdList getEvenementIds() {
        return this.evenementIds;
    }

    /**
     * Définit la valeur de la propriété evenementIds.
     *
     * @param value
     *     allowed object is
     *     {@link EvenementIdList }
     *
     */
    public void setEvenementIds(EvenementIdList value) {
        this.evenementIds = value;
    }

    /**
     * Obtient la valeur de la propriété localisations.
     *
     * @return
     *     possible object is
     *     {@link LocalisationList }
     *
     */
    public LocalisationList getLocalisations() {
        return this.localisations;
    }

    /**
     * Définit la valeur de la propriété localisations.
     *
     * @param value
     *     allowed object is
     *     {@link LocalisationList }
     *
     */
    public void setLocalisations(LocalisationList value) {
        this.localisations = value;
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
        return this.id;
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
