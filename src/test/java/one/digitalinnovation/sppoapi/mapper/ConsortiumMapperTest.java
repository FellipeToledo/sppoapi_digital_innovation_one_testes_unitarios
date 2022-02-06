package one.digitalinnovation.sppoapi.mapper;

import one.digitalinnovation.sppoapi.dto.mapper.ConsortiumMapper;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.entities.Company;
import one.digitalinnovation.sppoapi.entities.Consortium;
import one.digitalinnovation.sppoapi.utils.ConsortiumUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConsortiumMapperTest {

    @Autowired
    private ConsortiumMapper consortiumMapper;

    @Test
    void testGivenConsortiumDTOThenReturnConsortiumEntity() {
        ConsortiumDTO consortiumDTO = ConsortiumUtils.createFakeDTO();
        Consortium consortium = consortiumMapper.toModel(consortiumDTO);

        assertEquals(consortiumDTO.getName(), consortium.getName());
        assertEquals(consortiumDTO.getCnpj(), consortium.getCnpj());

        Company company = consortium.getCompanies().get(0);
        CompanyDTO companyDTO = consortiumDTO.getCompanies().get(0);

        assertEquals(companyDTO.getName(), company.getName());
        assertEquals(companyDTO.getCnpj(), company.getCnpj());
    }

    @Test
    void testGivenConsortiumEntityThenReturnConsortiumDTO() {
        Consortium consortium = ConsortiumUtils.createFakeEntity();
        ConsortiumDTO consortiumDTO = consortiumMapper.toDTO(consortium);

        assertEquals(consortium.getName(), consortiumDTO.getName());
        assertEquals(consortium.getCnpj(), consortiumDTO.getCnpj());

        Company company = consortium.getCompanies().get(0);
        CompanyDTO companyDTO = consortiumDTO.getCompanies().get(0);

        assertEquals(company.getName(), companyDTO.getName());
        assertEquals(company.getCnpj(), companyDTO.getCnpj());
    }
}
