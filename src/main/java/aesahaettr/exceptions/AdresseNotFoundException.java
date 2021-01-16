package aesahaettr.exceptions;

public class AdresseNotFoundException extends EntityNotFoundException {

    public AdresseNotFoundException(String id) {
        super(id);
    }

    @Override
    public String getMessage() {
        return "L'adresse [id=" + this.getId() + "] n'existe pas.";
    }

}
