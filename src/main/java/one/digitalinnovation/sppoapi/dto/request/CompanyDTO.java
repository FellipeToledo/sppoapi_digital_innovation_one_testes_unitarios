package one.digitalinnovation.sppoapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {

    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    @CNPJ // XX. XXX. XXX/0001-XX
    private String cnpj;

    @NotEmpty
    private String address;
}
