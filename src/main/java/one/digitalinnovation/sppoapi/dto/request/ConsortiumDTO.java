package one.digitalinnovation.sppoapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.sppoapi.enums.ConsortiumName;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsortiumDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private ConsortiumName name;

    @NotEmpty
    @CNPJ // XX. XXX. XXX/0001-XX
    private String cnpj;

    @Valid
    @NotEmpty
    private List<CompanyDTO> companies;
}
