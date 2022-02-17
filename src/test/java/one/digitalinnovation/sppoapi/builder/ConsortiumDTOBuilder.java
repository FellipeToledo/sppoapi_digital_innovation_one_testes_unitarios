package one.digitalinnovation.sppoapi.builder;

import lombok.Builder;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.enums.ConsortiumName;

/**
 * @author Fellipe Toledo
 */

@Builder
public class ConsortiumDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private ConsortiumName name = ConsortiumName.INTERSUL;

    @Builder.Default
    private String cnpj = "77. 888. 999/0001-02";

    public ConsortiumDTO toConsortiumDTO() {
        return new ConsortiumDTO(id, name, cnpj);
    }
}

