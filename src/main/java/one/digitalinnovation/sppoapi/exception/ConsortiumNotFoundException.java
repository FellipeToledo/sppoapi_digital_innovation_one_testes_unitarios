package one.digitalinnovation.sppoapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ConsortiumNotFoundException extends Exception {

    public ConsortiumNotFoundException(Long id) {
        super(String.format("Consortium with id %s not found in the system.", id));
    }

    public ConsortiumNotFoundException(String consortiumName) {
        super(String.format("Consortium with name %s not found in the system.", consortiumName));
    }


}
