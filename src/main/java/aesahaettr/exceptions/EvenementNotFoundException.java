package aesahaettr.exceptions;

public class EvenementNotFoundException extends EntityNotFoundException {

    public EvenementNotFoundException(String id) {
        super(id);
    }

    @Override
    public String getMessage() {
        return "L'événement [id=" + this.getId() + "] n'existe pas.";
    }

}
