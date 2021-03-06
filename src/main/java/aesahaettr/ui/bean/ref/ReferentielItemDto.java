package aesahaettr.ui.bean.ref;

public class ReferentielItemDto implements Comparable<ReferentielItemDto> {

    private String code;

    private String libelle;

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
     * @return the libelle
     */
    public String getLibelle() {
        return this.libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int compareTo(ReferentielItemDto o) {
        return this.libelle.compareTo(o.libelle);
    }

}
