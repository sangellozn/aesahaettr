package aesahaettr.exceptions.personnes;

import aesahaettr.exceptions.EntityNotFoundException;

public class PersonneNotFoundException extends EntityNotFoundException {

    public PersonneNotFoundException(String id) {
        super(id);
    }

    @Override
    public String getMessage() {
        return "La personne [id=" + this.getId() + "] n'existe pas.";
    }

}
