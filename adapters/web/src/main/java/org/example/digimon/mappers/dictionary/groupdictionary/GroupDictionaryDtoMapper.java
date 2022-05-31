package org.example.digimon.mappers.dictionary.groupdictionary;

import org.example.digimon.domain.dictionary.groupdictionary.GroupDictionary;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface GroupDictionaryDtoMapper extends DtoMapper<GroupDictionaryDtoIn, GroupDictionary, GroupDictionaryDtoOut> {
}
