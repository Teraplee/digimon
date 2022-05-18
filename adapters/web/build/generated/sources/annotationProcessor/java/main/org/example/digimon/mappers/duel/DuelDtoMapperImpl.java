package org.example.digimon.mappers.duel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.duel.Duel;
import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:31+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class DuelDtoMapperImpl implements DuelDtoMapper {

    @Autowired
    private PlayerDtoMapper playerDtoMapper;

    @Override
    public Duel fromDtoIn(DuelDtoIn dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        Duel duel = new Duel();

        duel.setId( dtoIn.getId() );
        duel.setDate( dtoIn.getDate() );
        duel.setPlayers( playerDtoInSetToPlayerSet( dtoIn.getPlayers() ) );

        return duel;
    }

    @Override
    public DuelDtoOut toDtoOut(Duel dtoOut) {
        if ( dtoOut == null ) {
            return null;
        }

        Set<PlayerDtoOut> players = null;
        Long id = null;
        Date date = null;

        players = playerSetToPlayerDtoOutSet( dtoOut.getPlayers() );
        id = dtoOut.getId();
        date = dtoOut.getDate();

        DuelDtoOut duelDtoOut = new DuelDtoOut( id, date, players );

        return duelDtoOut;
    }

    protected Set<Player> playerDtoInSetToPlayerSet(Set<PlayerDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<Player> set1 = new HashSet<Player>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PlayerDtoIn playerDtoIn : set ) {
            set1.add( playerDtoMapper.fromDtoIn( playerDtoIn ) );
        }

        return set1;
    }

    protected Set<PlayerDtoOut> playerSetToPlayerDtoOutSet(Set<Player> set) {
        if ( set == null ) {
            return null;
        }

        Set<PlayerDtoOut> set1 = new HashSet<PlayerDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Player player : set ) {
            set1.add( playerDtoMapper.toDtoOut( player ) );
        }

        return set1;
    }
}
