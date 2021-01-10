package aesahaettr.exceptions.ref;

import aesahaettr.exceptions.EntityNotFoundException;

public class PaysNotFoundException extends EntityNotFoundException {

    public PaysNotFoundException(String id) {
        super(id);
    }

    @Override
    public String getMessage() {
        return "Le pays [id=" + this.getId() + "] n'existe pas.";
    }

}
