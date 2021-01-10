package aesahaettr.ui.bean;

public class GreetingsDto {

    private String nom;

    private long personnesCount;

    private long objetsCount;

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
     * @return the personnesCount
     */
    public long getPersonnesCount() {
        return this.personnesCount;
    }

    /**
     * @param personnesCount the personnesCount to set
     */
    public void setPersonnesCount(long personnesCount) {
        this.personnesCount = personnesCount;
    }

    /**
     * @return the objetsCount
     */
    public long getObjetsCount() {
        return this.objetsCount;
    }

    /**
     * @param objetsCount the objetsCount to set
     */
    public void setObjetsCount(long objetsCount) {
        this.objetsCount = objetsCount;
    }

}
