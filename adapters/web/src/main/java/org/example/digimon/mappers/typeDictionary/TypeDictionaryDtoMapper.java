package org.example.digimon.mappers.typeDictionary;

import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {DigimonDtoMapper.class})
public interface TypeDictionaryDtoMapper {
}
