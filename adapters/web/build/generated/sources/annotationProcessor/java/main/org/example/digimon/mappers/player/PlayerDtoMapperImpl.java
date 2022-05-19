package org.example.digimon.mappers.player;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T21:08:08+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class PlayerDtoMapperImpl implements PlayerDtoMapper {

    @Autowired
    private DigimonDtoMapper digimonDtoMapper;

    @Override
    public Player fromDtoIn(PlayerDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Player player = new Player();

        player.setId( arg0.getId() );
        player.setEmail( arg0.getEmail() );
        player.setFirstName( arg0.getFirstName() );
        player.setMiddleName( arg0.getMiddleName() );
        player.setLastName( arg0.getLastName() );
        player.setPhone( arg0.getPhone() );
        player.setUsername( arg0.getUsername() );
        player.setPassword( arg0.getPassword() );
        player.setUpdatedAt( arg0.getUpdatedAt() );
        player.setUpdatedBy( arg0.getUpdatedBy() );
        player.setDigimons( digimonDtoInSetToDigimonSet( arg0.getDigimons() ) );

        return player;
    }

    @Override
    public PlayerDtoOut toDtoOut(Player arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Set<DigimonDtoOut> digimons = null;
        Long id = null;
        String email = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String phone = null;
        String username = null;
        Date updatedAt = null;
        String updatedBy = null;

        digimons = digimonSetToDigimonDtoOutSet( arg0.getDigimons() );
        id = arg0.getId();
        email = arg0.getEmail();
        firstName = arg0.getFirstName();
        middleName = arg0.getMiddleName();
        lastName = arg0.getLastName();
        phone = arg0.getPhone();
        username = arg0.getUsername();
        updatedAt = arg0.getUpdatedAt();
        updatedBy = arg0.getUpdatedBy();

        PlayerDtoOut playerDtoOut = new PlayerDtoOut( id, email, firstName, middleName, lastName, phone, username, updatedAt, updatedBy, digimons );

        return playerDtoOut;
    }

    protected Set<Digimon> digimonDtoInSetToDigimonSet(Set<DigimonDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<Digimon> set1 = new HashSet<Digimon>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DigimonDtoIn digimonDtoIn : set ) {
            set1.add( digimonDtoMapper.fromDtoIn( digimonDtoIn ) );
        }

        return set1;
    }

    protected Set<DigimonDtoOut> digimonSetToDigimonDtoOutSet(Set<Digimon> set) {
        if ( set == null ) {
            return null;
        }

        Set<DigimonDtoOut> set1 = new HashSet<DigimonDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Digimon digimon : set ) {
            set1.add( digimonDtoMapper.toDtoOut( digimon ) );
        }

        return set1;
    }
}