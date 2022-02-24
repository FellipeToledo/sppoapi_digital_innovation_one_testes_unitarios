package one.digitalinnovation.sppoapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.sppoapi.dto.request.ConsortiumDTO;
import one.digitalinnovation.sppoapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.sppoapi.exception.ConsortiumAlreadyRegisteredException;
import one.digitalinnovation.sppoapi.exception.ConsortiumNotFoundException;
import one.digitalinnovation.sppoapi.services.ConsortiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/consortium")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ConsortiumController {

    private final ConsortiumService consortiumService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsortiumDTO create(@RequestBody @Valid ConsortiumDTO consortiumDTO) throws ConsortiumAlreadyRegisteredException {
        return consortiumService.create(consortiumDTO);
    }

    @GetMapping("/{name}")
    public ConsortiumDTO findByName(ConsortiumDTO consortiumDTO) throws ConsortiumNotFoundException {
        return consortiumService.findByName(consortiumDTO.getName());
    }

    @GetMapping
    public List<ConsortiumDTO> listAll() {
        return consortiumService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid ConsortiumDTO consortiumDTO) throws ConsortiumNotFoundException {
        return consortiumService.update(id, consortiumDTO);
    }

    @Transactional
    @DeleteMapping("/{name}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByName(@PathVariable String name) throws ConsortiumNotFoundException {
        consortiumService.deleteByName(name);
    }
}
