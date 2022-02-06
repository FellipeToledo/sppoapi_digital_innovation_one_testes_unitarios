package one.digitalinnovation.sppoapi.dto.mapper;

import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.entities.Company;
import one.digitalinnovation.sppoapi.entities.Consortium;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    Company toModel(CompanyDTO dto);

    CompanyDTO toDTO(Company dto);
}
