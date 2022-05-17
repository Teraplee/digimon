package org.example.digimon.duel;

import org.example.digimon.domain.duel.Duel;
import org.example.digimon.player.PlayerJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PlayerJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface DuelJpaMapper {

    Duel fromJpaEntity(DuelJpaEntity jpaEntity);
    DuelJpaEntity toJpaEntity(Duel entity);

}
