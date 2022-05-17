package org.example.digimon.dictionary.typeDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.typeDictionary.TypeDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface TypeDictionaryJpaMapper {

    TypeDictionary fromJpaEntity(TypeDictionaryJpaEntity jpaEntity);
    TypeDictionaryJpaEntity toJpaEntity(TypeDictionary entity);
}
