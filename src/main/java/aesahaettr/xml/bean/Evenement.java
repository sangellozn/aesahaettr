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
 * <p>Classe Java pour evenement complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="evenement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateEvt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "evenement", propOrder = {
    "dateDebut",
    "dateFin",
    "dateEvt",
    "resume",
    "description"
})
public class Evenement {

    @XmlJavaTypeAdapter(InstantAdapter.class)
    protected Instant dateDebut;
    @XmlJavaTypeAdapter(InstantAdapter.class)
    protected Instant dateFin;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(InstantAdapter.class)
    protected Instant dateEvt;
    @XmlElement(required = true)
    protected String resume;
    @XmlElement(required = true)
    protected String description;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtient la valeur de la propriété dateDebut.
     *
     * @return
     *     possible object is
     *     {@link Instant }
     *
     */
    public Instant getDateDebut() {
        return this.dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     *
     * @param value
     *     allowed object is
     *     {@link Instant }
     *
     */
    public void setDateDebut(Instant value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     *
     * @return
     *     possible object is
     *     {@link Instant }
     *
     */
    public Instant getDateFin() {
        return this.dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     *
     * @param value
     *     allowed object is
     *     {@link Instant }
     *
     */
    public void setDateFin(Instant value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété dateEvt.
     *
     * @return
     *     possible object is
     *     {@link Instant }
     *
     */
    public Instant getDateEvt() {
        return this.dateEvt;
    }

    /**
     * Définit la valeur de la propriété dateEvt.
     *
     * @param value
     *     allowed object is
     *     {@link Instant }
     *
     */
    public void setDateEvt(Instant value) {
        this.dateEvt = value;
    }

    /**
     * Obtient la valeur de la propriété resume.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResume() {
        return this.resume;
    }

    /**
     * Définit la valeur de la propriété resume.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResume(String value) {
        this.resume = value;
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
