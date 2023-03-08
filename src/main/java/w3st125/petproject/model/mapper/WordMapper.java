package w3st125.petproject.model.mapper;

import org.mapstruct.Mapper;
import w3st125.petproject.model.dto.WordDto;
import w3st125.petproject.model.entity.Word;

@Mapper(componentModel = "spring")
public interface WordMapper {

    WordDto toDto(Word word);

    Word fromDto(WordDto dto);
}
