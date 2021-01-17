package aesahaettr.ui.bean.personnes;

import java.time.LocalDateTime;
import java.util.Collection;

public class PersonneFullDto {

    private String id;

    private String nom;

    private String prenoms;

    private String nomUsage;

    private String prenomUsage;

    private String commentaire;

    private LocalDateTime dateCreation;

    private LocalDateTime dateModification;

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
     * @return the prenoms
     */
    public String getPrenoms() {
        return this.prenoms;
    }

    /**
     * @param prenoms the prenoms to set
     */
    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    /**
     * @return the nomUsage
     */
    public String getNomUsage() {
        return this.nomUsage;
    }

    /**
     * @param nomUsage the nomUsage to set
     */
    public void setNomUsage(String nomUsage) {
        this.nomUsage = nomUsage;
    }

    /**
     * @return the prenomUsage
     */
    public String getPrenomUsage() {
        return this.prenomUsage;
    }

    /**
     * @param prenomUsage the prenomUsage to set
     */
    public void setPrenomUsage(String prenomUsage) {
        this.prenomUsage = prenomUsage;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return this.commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the dateCreation
     */
    public LocalDateTime getDateCreation() {
        return this.dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the dateModification
     */
    public LocalDateTime getDateModification() {
        return this.dateModification;
    }

    /**
     * @param dateModification the dateModification to set
     */
    public void setDateModification(LocalDateTime dateModification) {
        this.dateModification = dateModification;
    }

    /**
     * @return the localisations
     */
    public Collection<LocalisationDto> getLocalisations() {
        return localisations;
    }

    /**
     * @param localisations the localisations to set
     */
    public void setLocalisations(Collection<LocalisationDto> localisations) {
        this.localisations = localisations;
    }

}
