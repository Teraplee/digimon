package org.example.digimon.mappers.digimon;

import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.classDictionary.ClassDictionaryDtoMapper;
import org.example.digimon.mappers.familyDictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.mappers.groupDictionary.GroupDictionaryDtoMapper;
import org.example.digimon.mappers.typeDictionary.TypeDictionaryDtoMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {TypeDictionaryDtoMapper.class, ClassDictionaryDtoMapper.class,
        GroupDictionaryDtoMapper.class, FamilyDictionaryDtoMapper.class})
public interface DigimonDtoMapper {

    @Mapping(target = "typeDictionary", source = "typeDictionaryDtoIn")
    @Mapping(target = "classDictionary", source = "classDictionaryDtoIn")
    @Mapping(target = "groupDictionary", source = "groupDictionaryDtoIn")
    Digimon fromDtoIn(DigimonDtoIn dtoIn);

    @Mapping(target = "typeDictionaryDtoOut", source = "typeDictionary")
    @Mapping(target = "classDictionaryDtoOut", source = "classDictionary")
    @Mapping(target = "groupDictionaryDtoOut", source = "groupDictionary")
    DigimonDtoOut toDtoOut(Digimon dtoOut);

}
