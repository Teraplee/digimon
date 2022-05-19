package org.example.digimon.mappers.player;

import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.AutoDtoMapper;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.example.digimon.mappers.duel.DuelDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", uses = {DigimonDtoMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface PlayerDtoMapper extends AutoDtoMapper<PlayerDtoIn, Player, PlayerDtoOut> {
}
