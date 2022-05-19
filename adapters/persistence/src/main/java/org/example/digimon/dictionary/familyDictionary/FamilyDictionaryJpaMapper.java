package org.example.digimon.dictionary.familyDictionary;

import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface FamilyDictionaryJpaMapper {

    FamilyDictionary fromJpaEntity(FamilyDictionaryJpaEntity jpaEntity);

    FamilyDictionaryJpaEntity toJpaEntity(FamilyDictionary entity);

}