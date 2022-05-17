package org.example.digimon.mappers.duel;

import org.example.digimon.domain.duel.Duel;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.mapstruct.Mapper;

@Mapper
public interface DuelDtoMapper {

    Duel fromDtoIn(DuelDtoIn dtoIn);
    DuelDtoOut toDtoOut(Duel dtoOut);

}
