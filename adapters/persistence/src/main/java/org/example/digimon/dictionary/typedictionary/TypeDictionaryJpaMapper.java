package org.example.digimon.dictionary.typedictionary;

import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;
import org.example.digimon.mappers.AutoJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface TypeDictionaryJpaMapper extends AutoJpaMapper<TypeDictionaryJpaEntity, TypeDictionary> {
}
