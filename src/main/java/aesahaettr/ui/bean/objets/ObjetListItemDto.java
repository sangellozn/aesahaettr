package aesahaettr.ui.bean.objets;

public class ObjetListItemDto {

    private String id;

    private String nom;

    private String description;

    private String localisation;

    private String possesseur;

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
     * @return the localisation
     */
    public String getLocalisation() {
        return this.localisation;
    }

    /**
     * @param localisation the localisation to set
     */
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    /**
     * @return the possesseur
     */
    public String getPossesseur() {
        return this.possesseur;
    }

    /**
     * @param possesseur the possesseur to set
     */
    public void setPossesseur(String possesseur) {
        this.possesseur = possesseur;
    }

}
