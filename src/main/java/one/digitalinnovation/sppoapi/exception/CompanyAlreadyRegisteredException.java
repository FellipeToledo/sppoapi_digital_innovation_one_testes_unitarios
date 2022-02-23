package one.digitalinnovation.sppoapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Fellipe Toledo
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CompanyAlreadyRegisteredException extends Exception {

    public CompanyAlreadyRegisteredException(String name) {
        super(String.format("Company with name %s already registered in the system.", name));
    }
}