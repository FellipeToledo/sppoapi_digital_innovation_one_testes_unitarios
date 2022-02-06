package one.digitalinnovation.sppoapi.services;

import one.digitalinnovation.sppoapi.dto.mapper.ConsortiumMapper;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.sppoapi.entities.Consortium;
import one.digitalinnovation.sppoapi.repositories.ConsortiumRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitalinnovation.sppoapi.utils.ConsortiumUtils.createFakeDTO;
import static one.digitalinnovation.sppoapi.utils.ConsortiumUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsortiumServiceTest {

    @Mock
    private ConsortiumRepository consortiumRepository;

    @Mock
    private ConsortiumMapper consortiumMapper;

    @InjectMocks
    private ConsortiumService consortiumService;

    @Test
    void testGivenConsortiumDTOThenReturnSuccessSavedMessage() {
        ConsortiumDTO consortiumDTO = createFakeDTO();
        Consortium expectedSavedConsortium = createFakeEntity();

        when(consortiumMapper.toModel(consortiumDTO)).thenReturn(expectedSavedConsortium);
        when(consortiumRepository.save(any(Consortium.class))).thenReturn(expectedSavedConsortium);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedConsortium.getId());
        MessageResponseDTO successMessage = consortiumService.create(consortiumDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedConsortiumId) {
        return MessageResponseDTO.builder()
                .message("Consortium successfully created with ID " + savedConsortiumId)
                .build();
    }

}
