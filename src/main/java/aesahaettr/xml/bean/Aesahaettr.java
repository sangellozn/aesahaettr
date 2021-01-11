//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2021.01.11 à 04:38:41 PM CET
//


package aesahaettr.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour aesahaettr complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="aesahaettr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}personnes"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}objets"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}adresses"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}evenements"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refPays"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refTypeAppartenance"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refTypeContact"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refTypeObjet"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refTypeRelation"/>
 *         &lt;element ref="{http://www.aesahaettr.me/aesahaettr}refTypeLocalisation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aesahaettr", propOrder = {
    "personnes",
    "objets",
    "adresses",
    "evenements",
    "refPays",
    "refTypeAppartenance",
    "refTypeContact",
    "refTypeObjet",
    "refTypeRelation",
    "refTypeLocalisation"
})
@XmlRootElement
public class Aesahaettr {

    @XmlElement(required = true)
    protected PersonneList personnes;
    @XmlElement(required = true)
    protected ObjetList objets;
    @XmlElement(required = true)
    protected AdresseList adresses;
    @XmlElement(required = true)
    protected EvenementList evenements;
    @XmlElement(required = true)
    protected PaysList refPays;
    @XmlElement(required = true)
    protected TypeAppartenanceList refTypeAppartenance;
    @XmlElement(required = true)
    protected TypeContactList refTypeContact;
    @XmlElement(required = true)
    protected TypeObjetList refTypeObjet;
    @XmlElement(required = true)
    protected TypeRelationList refTypeRelation;
    @XmlElement(required = true)
    protected TypeLocalisationList refTypeLocalisation;

    /**
     * Obtient la valeur de la propriété personnes.
     *
     * @return
     *     possible object is
     *     {@link PersonneList }
     *
     */
    public PersonneList getPersonnes() {
        return this.personnes;
    }

    /**
     * Définit la valeur de la propriété personnes.
     *
     * @param value
     *     allowed object is
     *     {@link PersonneList }
     *
     */
    public void setPersonnes(PersonneList value) {
        this.personnes = value;
    }

    /**
     * Obtient la valeur de la propriété objets.
     *
     * @return
     *     possible object is
     *     {@link ObjetList }
     *
     */
    public ObjetList getObjets() {
        return this.objets;
    }

    /**
     * Définit la valeur de la propriété objets.
     *
     * @param value
     *     allowed object is
     *     {@link ObjetList }
     *
     */
    public void setObjets(ObjetList value) {
        this.objets = value;
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
        return this.adresses;
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
     * Obtient la valeur de la propriété evenements.
     *
     * @return
     *     possible object is
     *     {@link EvenementList }
     *
     */
    public EvenementList getEvenements() {
        return this.evenements;
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
     * Obtient la valeur de la propriété refPays.
     *
     * @return
     *     possible object is
     *     {@link PaysList }
     *
     */
    public PaysList getRefPays() {
        return this.refPays;
    }

    /**
     * Définit la valeur de la propriété refPays.
     *
     * @param value
     *     allowed object is
     *     {@link PaysList }
     *
     */
    public void setRefPays(PaysList value) {
        this.refPays = value;
    }

    /**
     * Obtient la valeur de la propriété refTypeAppartenance.
     *
     * @return
     *     possible object is
     *     {@link TypeAppartenanceList }
     *
     */
    public TypeAppartenanceList getRefTypeAppartenance() {
        return this.refTypeAppartenance;
    }

    /**
     * Définit la valeur de la propriété refTypeAppartenance.
     *
     * @param value
     *     allowed object is
     *     {@link TypeAppartenanceList }
     *
     */
    public void setRefTypeAppartenance(TypeAppartenanceList value) {
        this.refTypeAppartenance = value;
    }

    /**
     * Obtient la valeur de la propriété refTypeContact.
     *
     * @return
     *     possible object is
     *     {@link TypeContactList }
     *
     */
    public TypeContactList getRefTypeContact() {
        return this.refTypeContact;
    }

    /**
     * Définit la valeur de la propriété refTypeContact.
     *
     * @param value
     *     allowed object is
     *     {@link TypeContactList }
     *
     */
    public void setRefTypeContact(TypeContactList value) {
        this.refTypeContact = value;
    }

    /**
     * Obtient la valeur de la propriété refTypeObjet.
     *
     * @return
     *     possible object is
     *     {@link TypeObjetList }
     *
     */
    public TypeObjetList getRefTypeObjet() {
        return this.refTypeObjet;
    }

    /**
     * Définit la valeur de la propriété refTypeObjet.
     *
     * @param value
     *     allowed object is
     *     {@link TypeObjetList }
     *
     */
    public void setRefTypeObjet(TypeObjetList value) {
        this.refTypeObjet = value;
    }

    /**
     * Obtient la valeur de la propriété refTypeRelation.
     *
     * @return
     *     possible object is
     *     {@link TypeRelationList }
     *
     */
    public TypeRelationList getRefTypeRelation() {
        return this.refTypeRelation;
    }

    /**
     * Définit la valeur de la propriété refTypeRelation.
     *
     * @param value
     *     allowed object is
     *     {@link TypeRelationList }
     *
     */
    public void setRefTypeRelation(TypeRelationList value) {
        this.refTypeRelation = value;
    }

    /**
     * Obtient la valeur de la propriété refTypeLocalisation.
     *
     * @return
     *     possible object is
     *     {@link TypeLocalisationList }
     *
     */
    public TypeLocalisationList getRefTypeLocalisation() {
        return this.refTypeLocalisation;
    }

    /**
     * Définit la valeur de la propriété refTypeLocalisation.
     *
     * @param value
     *     allowed object is
     *     {@link TypeLocalisationList }
     *
     */
    public void setRefTypeLocalisation(TypeLocalisationList value) {
        this.refTypeLocalisation = value;
    }

}
