package org.example.digimon.mappers.familyDictionary;

import org.example.digimon.domain.familyDictionary.FamilyDictionary;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface FamilyDictionaryDtoMapper {

    FamilyDictionary fromDtoIn(FamilyDictionaryDtoIn dtoIn);
    FamilyDictionaryDtoOut toDtoOut(FamilyDictionary dtoOut);

}
