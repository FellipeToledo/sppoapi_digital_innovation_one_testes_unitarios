package one.digitalinnovation.sppoapi.repositories;

import one.digitalinnovation.sppoapi.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
