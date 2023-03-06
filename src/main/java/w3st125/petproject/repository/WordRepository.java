package w3st125.petproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w3st125.petproject.entity.Word;

@Repository
public interface WordRepository extends CrudRepository<Word, Long> {
}
