package one.digitalinnovation.sppoapi.repositories;

import one.digitalinnovation.sppoapi.entities.Consortium;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConsortiumRepository extends JpaRepository<Consortium, Long> {
    Optional<Consortium> findByName(String name);
    void deleteByName(String name);

    //void deleteByName(String name);
}
