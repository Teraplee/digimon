package org.example.digimon.mappers.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface TypeDictionaryDtoMapper extends DtoMapper<TypeDictionaryDtoIn, TypeDictionary, TypeDictionaryDtoOut> {
}
