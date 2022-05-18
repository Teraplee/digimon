package org.example.digimon.mappers.groupDictionary;

import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface GroupDictionaryDtoMapper {

    GroupDictionary fromDtoIn(GroupDictionaryDtoIn dtoIn);
    GroupDictionaryDtoOut toDtoOut(GroupDictionary dtoOut);

}
