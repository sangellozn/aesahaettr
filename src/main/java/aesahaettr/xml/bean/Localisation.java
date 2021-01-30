//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2021.01.15 à 10:46:54 PM CET
//


package aesahaettr.xml.bean;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import aesahaettr.xml.LocalDateTimeAdapter;


/**
 * <p>Classe Java pour localisation complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="localisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseId" type="{http://www.aesahaettr.me/aesahaettr}UIID"/>
 *         &lt;element name="typeLocalisationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localisation", propOrder = {
    "adresseId",
    "typeLocalisationCode",
    "dateDebut",
    "dateFin"
})
public class Localisation {

    @XmlElement(required = true)
    protected String adresseId;
    @XmlElement(required = true)
    protected String typeLocalisationCode;
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    protected LocalDateTime dateDebut;
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    protected LocalDateTime dateFin;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Obtient la valeur de la propriété adresseId.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdresseId() {
        return this.adresseId;
    }

    /**
     * Définit la valeur de la propriété adresseId.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdresseId(String value) {
        this.adresseId = value;
    }

    /**
     * Obtient la valeur de la propriété typeLocalisationCode.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeLocalisationCode() {
        return this.typeLocalisationCode;
    }

    /**
     * Définit la valeur de la propriété typeLocalisationCode.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeLocalisationCode(String value) {
        this.typeLocalisationCode = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebut.
     *
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *
     */
    public LocalDateTime getDateDebut() {
        return this.dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *
     */
    public void setDateDebut(LocalDateTime value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     *
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *
     */
    public LocalDateTime getDateFin() {
        return this.dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *
     */
    public void setDateFin(LocalDateTime value) {
        this.dateFin = value;
    }

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}
