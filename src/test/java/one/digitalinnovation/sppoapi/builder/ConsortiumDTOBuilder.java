package one.digitalinnovation.sppoapi.builder;

import lombok.Builder;
import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;

import java.util.List;

/**
 * @author Fellipe Toledo
 */

@Builder
public class ConsortiumDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Intersul";

    @Builder.Default
    private String cnpj = "77. 888. 999/0001-02";

    private List<CompanyDTO> companies;

    public ConsortiumDTO toConsortiumDTO() {
        return new ConsortiumDTO(id, name, cnpj, companies);
    }
}

