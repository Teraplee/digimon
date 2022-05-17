package org.example.digimon.dictionary.classDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface ClassDictionaryJpaMapper {

    ClassDictionary fromJpaEntity(ClassDictionaryJpaEntity jpaEntity);
    ClassDictionaryJpaEntity toJpaEntity(ClassDictionary entity);
}
