package one.digitalinnovation.sppoapi.builder;

import lombok.Builder;
import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;

/**
 * @author Fellipe Toledo
 */

@Builder
public class CompanyDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Real Auto Ônibus";

    @Builder.Default
    private String cnpj = "11.222.333/0002-03";

    @Builder.Default
    private String address = "Avenida Canal 2 MD - 129 - Maré, Rio de Janeiro - RJ";

    public CompanyDTO toCompanyDTO() {
        return new CompanyDTO(id, name, cnpj, address);
    }
}
