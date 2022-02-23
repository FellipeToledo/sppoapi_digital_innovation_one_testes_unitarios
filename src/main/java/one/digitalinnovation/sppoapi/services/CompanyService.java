package one.digitalinnovation.sppoapi.services;

import lombok.AllArgsConstructor;
import one.digitalinnovation.sppoapi.dto.mapper.CompanyMapper;
import one.digitalinnovation.sppoapi.dto.request.CompanyDTO;
import one.digitalinnovation.sppoapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.sppoapi.entities.Company;
import one.digitalinnovation.sppoapi.exception.CompanyAlreadyRegisteredException;
import one.digitalinnovation.sppoapi.exception.CompanyNotFoundException;
import one.digitalinnovation.sppoapi.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper = CompanyMapper.INSTANCE;

    public CompanyDTO create(CompanyDTO companyDTO) throws CompanyAlreadyRegisteredException {
        verifyIfIsAlreadyRegistered(companyDTO.getName());
        Company company = companyMapper.toModel(companyDTO);
        Company savedCompany = companyRepository.save(company);
        return companyMapper.toDTO(savedCompany);
    }

    public CompanyDTO findByName(String name) throws CompanyNotFoundException{
        Company foundCompany = companyRepository.findByName(name)
                .orElseThrow(() -> new CompanyNotFoundException(name));
        return companyMapper.toDTO(foundCompany);
    }

    public CompanyDTO findById(Long id) throws CompanyNotFoundException {
        Company company = companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));

        return companyMapper.toDTO(company);
    }

    public List<CompanyDTO> listAll() {
        List<Company> company = companyRepository.findAll();
        return company.stream()
                .map(companyMapper::toDTO)
                .collect(Collectors.toList());
    }

    private void verifyIfIsAlreadyRegistered(String name) throws CompanyAlreadyRegisteredException {
        Optional<Company> optSavedCompany = companyRepository.findByName(name);
        if (optSavedCompany.isPresent()) {
            throw new CompanyAlreadyRegisteredException(name);
        }
    }

    public MessageResponseDTO update(Long id, CompanyDTO companyDTO) throws CompanyNotFoundException {
        companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));

        Company updatedCompany = companyMapper.toModel(companyDTO);
        Company savedCompany = companyRepository.save(updatedCompany);

        MessageResponseDTO messageResponse = createMessageResponse("Company successfully updated with ID ", savedCompany.getId());

        return messageResponse;
    }

    public void delete(Long id) throws CompanyNotFoundException {
        companyRepository.findById(id)
                .orElseThrow(() -> new CompanyNotFoundException(id));
        companyRepository.deleteById(id);
    }

    private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
}
