package one.digitalinnovation.sppoapi.utils;

import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.entities.Company;
import one.digitalinnovation.sppoapi.enums.ConsortiumName;
import org.hibernate.validator.constraints.br.CNPJ;

public class CompanyUtils {

    private static final long COMPANY_ID = 1L;
    private static final String COMPANY_NAME = "Real Auto Ônibus Ltda";
    private static final String CNPJ_NUMBER = "XX. XXX. XXX/0001-XX";

    public static CompanyDTO createFakeDTO() {
        return CompanyDTO.builder()
                .id(COMPANY_ID)
                .name(COMPANY_NAME)
                .cnpj(CNPJ_NUMBER)
                .build();
    }

    public static Company createFakeEntity() {
        return Company.builder()
                .id(COMPANY_ID)
                .name(COMPANY_NAME)
                .cnpj(CNPJ_NUMBER)
                .build();
    }
}
