package w3st125.petproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w3st125.petproject.entity.Pack;

@Repository
public interface PackRepository extends CrudRepository<Pack, Long> {
}
