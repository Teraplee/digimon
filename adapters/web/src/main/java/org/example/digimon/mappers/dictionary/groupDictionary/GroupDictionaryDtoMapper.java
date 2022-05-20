package org.example.digimon.mappers.dictionary.groupDictionary;

import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface GroupDictionaryDtoMapper extends DtoMapper<GroupDictionaryDtoIn, GroupDictionary, GroupDictionaryDtoOut> {
}
