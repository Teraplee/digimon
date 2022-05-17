package org.example.digimon.dictionary.familyDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.familyDictionary.FamilyDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface FamilyDictionaryJpaMapper {

    FamilyDictionary fromJpaEntity(FamilyDictionaryJpaEntity jpaEntity);

    FamilyDictionaryJpaEntity toJpaEntity(FamilyDictionary entity);

}
