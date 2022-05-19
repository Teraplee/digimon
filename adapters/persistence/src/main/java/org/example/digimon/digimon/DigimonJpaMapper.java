package org.example.digimon.digimon;

import org.example.digimon.dictionary.classDictionary.ClassDictionaryJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupDictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typeDictionary.TypeDictionaryJpaMapper;
import org.example.digimon.mappers.AutoJpaMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {TypeDictionaryJpaMapper.class, ClassDictionaryJpaMapper.class,
        GroupDictionaryJpaMapper.class, FamilyDictionaryJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DigimonJpaMapper extends AutoJpaMapper<DigimonJpaEntity, Digimon> {
}
