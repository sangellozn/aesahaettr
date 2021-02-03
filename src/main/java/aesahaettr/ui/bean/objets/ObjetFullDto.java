package aesahaettr.ui.bean.objets;

import java.time.Instant;
import java.util.Collection;

import aesahaettr.ui.bean.EvenementDto;
import aesahaettr.ui.bean.LocalisationDto;

public class ObjetFullDto {

    private String id;

    private String nom;

    private String description;

    private Instant dateCreation;

    private Instant dateModification;

    private String typeObjetCode;

    private Collection<EvenementDto> evenements;

    private Collection<LocalisationDto> localisations;

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

    /**
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the dateCreation
     */
    public Instant getDateCreation() {
        return this.dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Instant dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the dateModification
     */
    public Instant getDateModification() {
        return this.dateModification;
    }

    /**
     * @param dateModification the dateModification to set
     */
    public void setDateModification(Instant dateModification) {
        this.dateModification = dateModification;
    }

    /**
     * @return the typeObjetCode
     */
    public String getTypeObjetCode() {
        return this.typeObjetCode;
    }

    /**
     * @param typeObjetCode the typeObjetCode to set
     */
    public void setTypeObjetCode(String typeObjetCode) {
        this.typeObjetCode = typeObjetCode;
    }

    /**
     * @return the evenements
     */
    public Collection<EvenementDto> getEvenements() {
        return this.evenements;
    }

    /**
     * @param evenements the evenements to set
     */
    public void setEvenements(Collection<EvenementDto> evenements) {
        this.evenements = evenements;
    }

    /**
     * @return the localisations
     */
    public Collection<LocalisationDto> getLocalisations() {
        return this.localisations;
    }

    /**
     * @param localisations the localisations to set
     */
    public void setLocalisations(Collection<LocalisationDto> localisations) {
        this.localisations = localisations;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
