package aesahaettr.ui.bean.personnes;

public class PersonneMinimalDto {

    private String id;

    private String nom;

    private String prenoms;

    private String nomUsage;

    private String prenomUsage;

    private String commentaire;

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
