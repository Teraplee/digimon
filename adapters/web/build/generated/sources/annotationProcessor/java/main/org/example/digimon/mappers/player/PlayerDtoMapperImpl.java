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
    date = "2022-05-18T20:26:31+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class PlayerDtoMapperImpl implements PlayerDtoMapper {

    @Autowired
    private DigimonDtoMapper digimonDtoMapper;

    @Override
    public Player fromDtoIn(PlayerDtoIn dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        Player player = new Player();

        player.setId( dtoIn.getId() );
        player.setEmail( dtoIn.getEmail() );
        player.setFirstName( dtoIn.getFirstName() );
        player.setMiddleName( dtoIn.getMiddleName() );
        player.setLastName( dtoIn.getLastName() );
        player.setPhone( dtoIn.getPhone() );
        player.setUsername( dtoIn.getUsername() );
        player.setPassword( dtoIn.getPassword() );
        player.setUpdatedAt( dtoIn.getUpdatedAt() );
        player.setUpdatedBy( dtoIn.getUpdatedBy() );
        player.setDigimons( digimonDtoInSetToDigimonSet( dtoIn.getDigimons() ) );

        return player;
    }

    @Override
    public PlayerDtoOut toDtoOut(Player dtoOut) {
        if ( dtoOut == null ) {
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

        digimons = digimonSetToDigimonDtoOutSet( dtoOut.getDigimons() );
        id = dtoOut.getId();
        email = dtoOut.getEmail();
        firstName = dtoOut.getFirstName();
        middleName = dtoOut.getMiddleName();
        lastName = dtoOut.getLastName();
        phone = dtoOut.getPhone();
        username = dtoOut.getUsername();
        updatedAt = dtoOut.getUpdatedAt();
        updatedBy = dtoOut.getUpdatedBy();

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
