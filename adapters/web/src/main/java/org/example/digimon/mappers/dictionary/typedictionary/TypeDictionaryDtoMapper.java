package org.example.digimon.mappers.dictionary.typedictionary;

import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface TypeDictionaryDtoMapper extends DtoMapper<TypeDictionaryDtoIn, TypeDictionary, TypeDictionaryDtoOut> {
}
