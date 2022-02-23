package one.digitalinnovation.sppoapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(Long id) {
        super(String.format("Company with ID %s not found!", id));
    }

    public CompanyNotFoundException(String companyName) {
        super(String.format("Company with name %s not found in the system.", companyName));
    }

}
