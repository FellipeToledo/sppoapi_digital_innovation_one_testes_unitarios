package one.digitalinnovation.sppoapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.sppoapi.dto.mapper.ConsortiumMapper;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.sppoapi.entities.Consortium;
import one.digitalinnovation.sppoapi.exception.ConsortiumNotFoundException;
import one.digitalinnovation.sppoapi.repositories.ConsortiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ConsortiumService {

    private final ConsortiumRepository consortiumRepository;
    private final ConsortiumMapper consortiumMapper;

    public MessageResponseDTO create(ConsortiumDTO consortiumDTO) {
        Consortium consortium = consortiumMapper.toModel(consortiumDTO);
        Consortium savedConsortium = consortiumRepository.save(consortium);

        MessageResponseDTO messageResponse = createMessageResponse("Consortium successfully created with ID ", savedConsortium.getId());

        return messageResponse;
    }

    public ConsortiumDTO findById(Long id) throws ConsortiumNotFoundException {
        Consortium consortium = consortiumRepository.findById(id)
                .orElseThrow(() -> new ConsortiumNotFoundException(id));

        return consortiumMapper.toDTO(consortium);
    }

    public List<ConsortiumDTO> listAll() {
        List<Consortium> consortium = consortiumRepository.findAll();
        return consortium.stream()
                .map(consortiumMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MessageResponseDTO update(Long id, ConsortiumDTO consortiumDTO) throws ConsortiumNotFoundException {
        consortiumRepository.findById(id)
                .orElseThrow(() -> new ConsortiumNotFoundException(id));

        Consortium updatedConsortium = consortiumMapper.toModel(consortiumDTO);
        Consortium savedConsortium = consortiumRepository.save(updatedConsortium);

        MessageResponseDTO messageResponse = createMessageResponse("Consortium successfully updated with ID ", savedConsortium.getId());

        return messageResponse;
    }

    public void delete(Long id) throws ConsortiumNotFoundException {
        consortiumRepository.findById(id)
                .orElseThrow(() -> new ConsortiumNotFoundException(id));

        consortiumRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
