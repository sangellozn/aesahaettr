package aesahaettr.ui.bean.objets;

import java.time.Instant;

public class ObjetMinimalDto {

    private String id;

    private String nom;

    private String description;

    private String typeObjetCode;

    private String personneId;

    private String typeAppartenanceCode;

    private Instant dateDebut;

    private Instant dateFin;

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

    /**
     * @return the personneId
     */
    public String getPersonneId() {
        return this.personneId;
    }

    /**
     * @param personneId the personneId to set
     */
    public void setPersonneId(String personneId) {
        this.personneId = personneId;
    }

    /**
     * @return the typeAppartenanceCode
     */
    public String getTypeAppartenanceCode() {
        return this.typeAppartenanceCode;
    }

    /**
     * @param typeAppartenanceCode the typeAppartenanceCode to set
     */
    public void setTypeAppartenanceCode(String typeAppartenanceCode) {
        this.typeAppartenanceCode = typeAppartenanceCode;
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
     * @return the typeObjetCode
     */
    public String getTypeObjetCode() {
        return typeObjetCode;
    }

    /**
     * @param typeObjetCode the typeObjetCode to set
     */
    public void setTypeObjetCode(String typeObjetCode) {
        this.typeObjetCode = typeObjetCode;
    }

}
