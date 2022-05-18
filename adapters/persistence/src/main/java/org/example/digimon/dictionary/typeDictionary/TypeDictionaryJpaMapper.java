package org.example.digimon.dictionary.typeDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.typeDictionary.TypeDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface TypeDictionaryJpaMapper {

    TypeDictionary fromJpaEntity(TypeDictionaryJpaEntity jpaEntity);
    TypeDictionaryJpaEntity toJpaEntity(TypeDictionary entity);
}
