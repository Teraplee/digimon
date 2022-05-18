package org.example.digimon.dictionary.classDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface ClassDictionaryJpaMapper {

    ClassDictionary fromJpaEntity(ClassDictionaryJpaEntity jpaEntity);
    ClassDictionaryJpaEntity toJpaEntity(ClassDictionary entity);
}
