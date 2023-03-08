package w3st125.petproject.model.mapper;

import org.mapstruct.Mapper;
import w3st125.petproject.model.dto.PackDto;
import w3st125.petproject.model.entity.Pack;

@Mapper(componentModel = "spring")
public interface PackMapper {

    PackDto toDto(Pack pack);

    Pack fromDto(PackDto dto);
}
