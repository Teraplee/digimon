package org.example.digimon.mappers.typeDictionary;

import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface TypeDictionaryDtoMapper {
}
