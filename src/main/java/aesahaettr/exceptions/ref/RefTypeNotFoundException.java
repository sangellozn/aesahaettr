package aesahaettr.exceptions.ref;

import aesahaettr.exceptions.EntityNotFoundException;

public class RefTypeNotFoundException extends EntityNotFoundException {

    public RefTypeNotFoundException(String code) {
        super(code);
    }

    @Override
    public String getMessage() {
        return "Le type référentiel [code=" + this.getId() + "] n'existe pas.";
    }

}
