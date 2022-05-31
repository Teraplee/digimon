package org.example.digimon.mappers.digimon;

import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.example.digimon.mappers.dictionary.classdictionary.ClassDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.familydictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.groupdictionary.GroupDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.typedictionary.TypeDictionaryDtoMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {TypeDictionaryDtoMapper.class, ClassDictionaryDtoMapper.class,
        GroupDictionaryDtoMapper.class, FamilyDictionaryDtoMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DigimonDtoMapper extends DtoMapper<DigimonDtoIn, Digimon, DigimonDtoOut> {
}
