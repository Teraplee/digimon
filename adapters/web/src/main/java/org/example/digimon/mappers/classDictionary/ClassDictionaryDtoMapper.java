package org.example.digimon.mappers.classDictionary;

import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface ClassDictionaryDtoMapper {

    ClassDictionary fromDtoIn(ClassDictionaryDtoIn dtoIn);
    ClassDictionaryDtoOut toDtoOut(ClassDictionary dtoOut);

}
