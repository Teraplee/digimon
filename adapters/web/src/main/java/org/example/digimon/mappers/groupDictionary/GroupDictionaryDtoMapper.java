package org.example.digimon.mappers.groupDictionary;

import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {DigimonDtoMapper.class})
public interface GroupDictionaryDtoMapper {

    GroupDictionary fromDtoIn(GroupDictionaryDtoIn dtoIn);
    GroupDictionaryDtoOut toDtoOut(GroupDictionary dtoOut);

}
