package org.example.digimon.mappers.digimon;

import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.AutoDtoMapper;
import org.example.digimon.mappers.dictionary.classDictionary.ClassDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.familyDictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.groupDictionary.GroupDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.typeDictionary.TypeDictionaryDtoMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {TypeDictionaryDtoMapper.class, ClassDictionaryDtoMapper.class,
        GroupDictionaryDtoMapper.class, FamilyDictionaryDtoMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DigimonDtoMapper extends AutoDtoMapper<DigimonDtoIn, Digimon, DigimonDtoOut> {
}
