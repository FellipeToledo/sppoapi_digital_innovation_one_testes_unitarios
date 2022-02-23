package one.digitalinnovation.sppoapi.builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;

import java.util.List;

/**
 * @author Fellipe Toledo
 */

@Builder
@ToString
public class ConsortiumDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Intersul";

    @Builder.Default
    private String cnpj = "12.464.869/0001-76";

    @Singular
    private List<CompanyDTO> companies;

    public ConsortiumDTO toConsortiumDTO() {
        return new ConsortiumDTO(id, name, cnpj, companies);
    }



}

