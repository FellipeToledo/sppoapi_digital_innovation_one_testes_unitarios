package one.digitalinnovation.sppoapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.sppoapi.enums.ConsortiumName;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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
