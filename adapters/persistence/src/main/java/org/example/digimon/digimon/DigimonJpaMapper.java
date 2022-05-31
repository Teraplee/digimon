package org.example.digimon.digimon;

import org.example.digimon.dictionary.classdictionary.ClassDictionaryJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dictionary.familydictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupdictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typedictionary.TypeDictionaryJpaMapper;
import org.example.digimon.mappers.AutoJpaMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {TypeDictionaryJpaMapper.class, ClassDictionaryJpaMapper.class,
        GroupDictionaryJpaMapper.class, FamilyDictionaryJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DigimonJpaMapper extends AutoJpaMapper<DigimonJpaEntity, Digimon> {
}
