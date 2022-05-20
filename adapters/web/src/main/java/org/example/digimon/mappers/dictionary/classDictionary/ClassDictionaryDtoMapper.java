package org.example.digimon.mappers.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface ClassDictionaryDtoMapper extends DtoMapper<ClassDictionaryDtoIn, ClassDictionary, ClassDictionaryDtoOut> {
}
