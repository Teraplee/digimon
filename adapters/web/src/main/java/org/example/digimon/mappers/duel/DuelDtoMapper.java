package org.example.digimon.mappers.duel;

import org.example.digimon.domain.duel.Duel;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.example.digimon.mappers.AutoDtoMapper;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", uses = {PlayerDtoMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DuelDtoMapper extends AutoDtoMapper<DuelDtoIn, Duel, DuelDtoOut> {
}
