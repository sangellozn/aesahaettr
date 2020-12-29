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
 * <p>Classe Java pour personne complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="personne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenoms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prenomUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}adresses"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}relations"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}possessions"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}evenements"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}contacts"/>
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
@XmlType(name = "personne", propOrder = {
    "nom",
    "prenoms",
    "nomUsage",
    "prenomUsage",
    "adresses",
    "relations",
    "possessions",
    "evenements",
    "contacts"
})
public class Personne {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String prenoms;
    @XmlElement(required = true)
    protected String nomUsage;
    @XmlElement(required = true)
    protected String prenomUsage;
    @XmlElement(required = true)
    protected AdresseList adresses;
    @XmlElement(required = true)
    protected RelationList relations;
    @XmlElement(required = true)
    protected PossessionList possessions;
    @XmlElement(required = true)
    protected EvenementList evenements;
    @XmlElement(required = true)
    protected ContactList contacts;
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
     * Obtient la valeur de la propriété prenoms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenoms() {
        return prenoms;
    }

    /**
     * Définit la valeur de la propriété prenoms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenoms(String value) {
        this.prenoms = value;
    }

    /**
     * Obtient la valeur de la propriété nomUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomUsage() {
        return nomUsage;
    }

    /**
     * Définit la valeur de la propriété nomUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomUsage(String value) {
        this.nomUsage = value;
    }

    /**
     * Obtient la valeur de la propriété prenomUsage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomUsage() {
        return prenomUsage;
    }

    /**
     * Définit la valeur de la propriété prenomUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomUsage(String value) {
        this.prenomUsage = value;
    }

    /**
     * Obtient la valeur de la propriété adresses.
     * 
     * @return
     *     possible object is
     *     {@link AdresseList }
     *     
     */
    public AdresseList getAdresses() {
        return adresses;
    }

    /**
     * Définit la valeur de la propriété adresses.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseList }
     *     
     */
    public void setAdresses(AdresseList value) {
        this.adresses = value;
    }

    /**
     * Obtient la valeur de la propriété relations.
     * 
     * @return
     *     possible object is
     *     {@link RelationList }
     *     
     */
    public RelationList getRelations() {
        return relations;
    }

    /**
     * Définit la valeur de la propriété relations.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationList }
     *     
     */
    public void setRelations(RelationList value) {
        this.relations = value;
    }

    /**
     * Obtient la valeur de la propriété possessions.
     * 
     * @return
     *     possible object is
     *     {@link PossessionList }
     *     
     */
    public PossessionList getPossessions() {
        return possessions;
    }

    /**
     * Définit la valeur de la propriété possessions.
     * 
     * @param value
     *     allowed object is
     *     {@link PossessionList }
     *     
     */
    public void setPossessions(PossessionList value) {
        this.possessions = value;
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
     * Obtient la valeur de la propriété contacts.
     * 
     * @return
     *     possible object is
     *     {@link ContactList }
     *     
     */
    public ContactList getContacts() {
        return contacts;
    }

    /**
     * Définit la valeur de la propriété contacts.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactList }
     *     
     */
    public void setContacts(ContactList value) {
        this.contacts = value;
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
