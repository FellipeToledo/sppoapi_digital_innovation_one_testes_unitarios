package one.digitalinnovation.sppoapi.utils;

import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.entities.Consortium;
import one.digitalinnovation.sppoapi.enums.ConsortiumName;

import java.time.LocalDate;
import java.util.Collections;

public class ConsortiumUtils {

    private static final long CONSORTIUM_ID = 1L;
    private static final ConsortiumName CONSORTIUM_NAME = ConsortiumName.INTERSUL;
    private static final String CNPJ_NUMBER = "XX. XXX. XXX/0001-XX";

    public static ConsortiumDTO createFakeDTO() {
        return ConsortiumDTO.builder()
                .id(CONSORTIUM_ID)
                .name(CONSORTIUM_NAME)
                .cnpj(CNPJ_NUMBER)
                .companies(Collections.singletonList(CompanyUtils.createFakeDTO()))
                .build();
    }

    public static Consortium createFakeEntity() {
        return Consortium.builder()
                .id(CONSORTIUM_ID)
                .name(CONSORTIUM_NAME)
                .cnpj(CNPJ_NUMBER)
                .companies(Collections.singletonList(CompanyUtils.createFakeEntity()))
                .build();
    }




}
