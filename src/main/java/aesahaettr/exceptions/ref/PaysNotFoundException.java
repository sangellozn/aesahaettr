package aesahaettr.exceptions.ref;

import aesahaettr.exceptions.EntityNotFoundException;

public class PaysNotFoundException extends EntityNotFoundException {

    public PaysNotFoundException(String code) {
        super(code);
    }

    @Override
    public String getMessage() {
        return "Le pays [code=" + this.getId() + "] n'existe pas.";
    }

}
