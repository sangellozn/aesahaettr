package aesahaettr.exceptions;

public class LocalisationNotFoundException extends EntityNotFoundException {

    private String personneId;

    public LocalisationNotFoundException(String id, String personneId) {
        super(id);
        this.personneId = personneId;
    }

    @Override
    public String getMessage() {
        return "La localisation [id=" + this.getId() + "] n'existe pas pour la personne [id=" + this.personneId + "].";
    }

}
