package org.example.digimon.player;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.player.Player;
import org.example.digimon.duel.DuelJpaMapper;
import org.example.digimon.mappers.AutoJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface PlayerJpaMapper extends AutoJpaMapper<PlayerJpaEntity, Player> {
}
