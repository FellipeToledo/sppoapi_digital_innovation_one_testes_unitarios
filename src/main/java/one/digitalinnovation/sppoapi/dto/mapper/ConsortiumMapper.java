package one.digitalinnovation.sppoapi.dto.mapper;

import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.entities.Consortium;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ConsortiumMapper {

    ConsortiumMapper INSTANCE = Mappers.getMapper(ConsortiumMapper.class);

    Consortium toModel(ConsortiumDTO consortiumDTO);

    ConsortiumDTO toDTO(Consortium consortium);
}
