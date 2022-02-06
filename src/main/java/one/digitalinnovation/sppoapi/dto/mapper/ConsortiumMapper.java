package one.digitalinnovation.sppoapi.dto.mapper;

import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.entities.Consortium;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConsortiumMapper {

    Consortium toModel(ConsortiumDTO dto);

    ConsortiumDTO toDTO(Consortium dto);
}
