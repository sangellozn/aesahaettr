package aesahaettr.ui.bean.ref;

public class PaysDto implements Comparable<PaysDto> {

    private String code;

    private String nom;

    /**
     * @return the code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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

    @Override
    public int compareTo(PaysDto o) {
        return this.code.compareTo(o.getCode());
    }

}
