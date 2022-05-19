package org.example.digimon.duel;

import org.example.digimon.domain.duel.Duel;
import org.example.digimon.mappers.AutoJpaMapper;
import org.example.digimon.player.PlayerJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", uses = {PlayerJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface DuelJpaMapper extends AutoJpaMapper<DuelJpaEntity, Duel> {
}
