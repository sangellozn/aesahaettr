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
 * <p>Classe Java pour possession complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="possession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeAppartenanceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objetId" type="{http://www.aesahaettr.me/aesahaettr}UIID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possession", propOrder = {
    "typeAppartenanceCode",
    "objetId"
})
public class Possession {

    @XmlElement(required = true)
    protected String typeAppartenanceCode;
    @XmlElement(required = true)
    protected String objetId;

    /**
     * Obtient la valeur de la propriété typeAppartenanceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAppartenanceCode() {
        return typeAppartenanceCode;
    }

    /**
     * Définit la valeur de la propriété typeAppartenanceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAppartenanceCode(String value) {
        this.typeAppartenanceCode = value;
    }

    /**
     * Obtient la valeur de la propriété objetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetId() {
        return objetId;
    }

    /**
     * Définit la valeur de la propriété objetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetId(String value) {
        this.objetId = value;
    }

}
