package aesahaettr.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public abstract class EntityNotFoundException extends RuntimeException {

    private String id;

    public EntityNotFoundException(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
