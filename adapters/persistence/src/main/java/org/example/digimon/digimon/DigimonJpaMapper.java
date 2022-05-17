package org.example.digimon.digimon;

import org.example.digimon.dictionary.classDictionary.ClassDictionaryJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupDictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typeDictionary.TypeDictionaryJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TypeDictionaryJpaMapper.class, ClassDictionaryJpaMapper.class,
        GroupDictionaryJpaMapper.class, FamilyDictionaryJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface DigimonJpaMapper {

    Digimon fromJpaEntity(DigimonJpaEntity jpaEntity);

    DigimonJpaEntity toJpaEntity(Digimon entity);

}
