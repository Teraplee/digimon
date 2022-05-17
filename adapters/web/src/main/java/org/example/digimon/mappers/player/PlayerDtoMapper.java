package org.example.digimon.mappers.player;

import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.example.digimon.mappers.duel.DuelDtoMapper;
import org.mapstruct.Mapper;

@Mapper(uses = {DigimonDtoMapper.class, DuelDtoMapper.class})
public interface PlayerDtoMapper {

    Player fromDtoIn(PlayerDtoIn dtoIn);
    PlayerDtoOut toDtoOut(Player dtoOut);

}
