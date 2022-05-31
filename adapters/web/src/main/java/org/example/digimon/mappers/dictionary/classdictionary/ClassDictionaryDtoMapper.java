package org.example.digimon.mappers.dictionary.classdictionary;

import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface ClassDictionaryDtoMapper extends DtoMapper<ClassDictionaryDtoIn, ClassDictionary, ClassDictionaryDtoOut> {
}
