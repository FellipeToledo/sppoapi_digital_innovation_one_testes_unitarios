package one.digitalinnovation.sppoapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompanyDTO {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    @CNPJ // XX. XXX. XXX/0001-XX
    private String cnpj;

    @NotNull
    private String address;
}
