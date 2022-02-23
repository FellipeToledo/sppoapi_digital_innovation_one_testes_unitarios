package one.digitalinnovation.sppoapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsortiumDTO {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    @CNPJ // XX. XXX. XXX/0001-XX
    private String cnpj;

    @NotNull
    private List<CompanyDTO> companies;

}
