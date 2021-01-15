//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.15 à 10:46:54 PM CET 
//


package aesahaettr.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour relation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeRelationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personneId" type="{http://www.aesahaettr.me/aesahaettr}UIID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relation", propOrder = {
    "typeRelationCode",
    "personneId"
})
public class Relation {

    @XmlElement(required = true)
    protected String typeRelationCode;
    @XmlElement(required = true)
    protected String personneId;

    /**
     * Obtient la valeur de la propriété typeRelationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRelationCode() {
        return typeRelationCode;
    }

    /**
     * Définit la valeur de la propriété typeRelationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRelationCode(String value) {
        this.typeRelationCode = value;
    }

    /**
     * Obtient la valeur de la propriété personneId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonneId() {
        return personneId;
    }

    /**
     * Définit la valeur de la propriété personneId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonneId(String value) {
        this.personneId = value;
    }

}
