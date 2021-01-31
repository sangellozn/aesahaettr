package aesahaettr.ui.bean.evenements;

import java.time.Instant;

public class EvenementDto {

    private String id;

    private String elementId;

    private Instant dateDebut;

    private Instant dateFin;

    private Instant dateEvenement;

    private String resume;

    private String description;

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
     * @return the elementId
     */
    public String getElementId() {
        return this.elementId;
    }

    /**
     * @param elementId the elementId to set
     */
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    /**
     * @return the dateDebut
     */
    public Instant getDateDebut() {
        return this.dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Instant dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public Instant getDateFin() {
        return this.dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(Instant dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the dateEvenement
     */
    public Instant getDateEvenement() {
        return this.dateEvenement;
    }

    /**
     * @param dateEvenement the dateEvenement to set
     */
    public void setDateEvenement(Instant dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    /**
     * @return the resume
     */
    public String getResume() {
        return this.resume;
    }

    /**
     * @param resume the resume to set
     */
    public void setResume(String resume) {
        this.resume = resume;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
