package org.example.digimon.duel;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.duel.Duel;
import org.example.digimon.domain.player.Player;
import org.example.digimon.player.PlayerJpaEntity;
import org.example.digimon.player.PlayerJpaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class DuelJpaMapperImpl implements DuelJpaMapper {

    @Autowired
    private PlayerJpaMapper playerJpaMapper;

    @Override
    public Duel fromJpaEntity(DuelJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        Duel duel = new Duel();

        duel.setId( jpaEntity.getId() );
        duel.setDate( jpaEntity.getDate() );
        duel.setPlayers( playerJpaEntitySetToPlayerSet( jpaEntity.getPlayers() ) );

        return duel;
    }

    @Override
    public DuelJpaEntity toJpaEntity(Duel entity) {
        if ( entity == null ) {
            return null;
        }

        DuelJpaEntity duelJpaEntity = new DuelJpaEntity();

        duelJpaEntity.setId( entity.getId() );
        duelJpaEntity.setDate( entity.getDate() );
        duelJpaEntity.setPlayers( playerSetToPlayerJpaEntitySet( entity.getPlayers() ) );

        return duelJpaEntity;
    }

    protected Set<Player> playerJpaEntitySetToPlayerSet(Set<PlayerJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Player> set1 = new HashSet<Player>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PlayerJpaEntity playerJpaEntity : set ) {
            set1.add( playerJpaMapper.fromJpaEntity( playerJpaEntity ) );
        }

        return set1;
    }

    protected Set<PlayerJpaEntity> playerSetToPlayerJpaEntitySet(Set<Player> set) {
        if ( set == null ) {
            return null;
        }

        Set<PlayerJpaEntity> set1 = new HashSet<PlayerJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Player player : set ) {
            set1.add( playerJpaMapper.toJpaEntity( player ) );
        }

        return set1;
    }
}
