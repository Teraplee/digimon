package org.example.digimon.player;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.player.Player;
import org.example.digimon.duel.DuelJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class, DuelJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface PlayerJpaMapper {

    Player fromJpaEntity(PlayerJpaEntity jpaEntity);
    PlayerJpaEntity toJpaEntity(Player entity);

}
