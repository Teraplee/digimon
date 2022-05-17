package org.example.digimon.mappers.classDictionary;

import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {DigimonDtoMapper.class})
public interface ClassDictionaryDtoMapper {

    ClassDictionary fromDtoIn(ClassDictionaryDtoIn dtoIn);
    ClassDictionaryDtoOut toDtoOut(ClassDictionary dtoOut);

}
