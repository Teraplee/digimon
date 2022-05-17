package org.example.digimon.mappers.familyDictionary;

import org.example.digimon.domain.familyDictionary.FamilyDictionary;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {DigimonDtoMapper.class})
public interface FamilyDictionaryDtoMapper {

    FamilyDictionary fromDtoIn(FamilyDictionaryDtoIn dtoIn);
    FamilyDictionaryDtoOut toDtoOut(FamilyDictionary dtoOut);

}
