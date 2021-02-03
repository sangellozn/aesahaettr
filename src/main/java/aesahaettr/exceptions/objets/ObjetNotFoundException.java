package aesahaettr.exceptions.objets;

import aesahaettr.exceptions.EntityNotFoundException;

public class ObjetNotFoundException extends EntityNotFoundException {

    public ObjetNotFoundException(String id) {
        super(id);
    }

    @Override
    public String getMessage() {
        return "L'objet [id=" + this.getId() + "] n'existe pas.";
    }

}
