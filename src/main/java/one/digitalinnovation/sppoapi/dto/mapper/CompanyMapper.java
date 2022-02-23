package one.digitalinnovation.sppoapi.dto.mapper;

import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.entities.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    Company toModel(CompanyDTO dto);

    CompanyDTO toDTO(Company dto);
}
