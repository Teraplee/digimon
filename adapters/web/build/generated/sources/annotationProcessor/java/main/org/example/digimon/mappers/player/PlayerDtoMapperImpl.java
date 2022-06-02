package org.example.digimon.mappers.player;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.domain.role.Role;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.dto.role.RoleDtoIn;
import org.example.digimon.dto.role.RoleDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.example.digimon.mappers.role.RoleDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T12:15:07+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class PlayerDtoMapperImpl implements PlayerDtoMapper {

    @Autowired
    private DigimonDtoMapper digimonDtoMapper;
    @Autowired
    private RoleDtoMapper roleDtoMapper;

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
        player.setDigimons( digimonDtoInSetToDigimonSet( arg0.getDigimons() ) );
        player.setRoles( roleDtoInSetToRoleSet( arg0.getRoles() ) );

        return player;
    }

    @Override
    public PlayerDtoOut toDtoOut(Player arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayerDtoOut playerDtoOut = new PlayerDtoOut();

        playerDtoOut.setId( arg0.getId() );
        playerDtoOut.setEmail( arg0.getEmail() );
        playerDtoOut.setFirstName( arg0.getFirstName() );
        playerDtoOut.setMiddleName( arg0.getMiddleName() );
        playerDtoOut.setLastName( arg0.getLastName() );
        playerDtoOut.setPhone( arg0.getPhone() );
        playerDtoOut.setUsername( arg0.getUsername() );
        playerDtoOut.setPassword( arg0.getPassword() );
        playerDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        playerDtoOut.setUpdatedBy( arg0.getUpdatedBy() );
        playerDtoOut.setDigimons( digimonSetToDigimonDtoOutSet( arg0.getDigimons() ) );
        playerDtoOut.setRoles( roleSetToRoleDtoOutSet( arg0.getRoles() ) );

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

    protected Set<Role> roleDtoInSetToRoleSet(Set<RoleDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new HashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDtoIn roleDtoIn : set ) {
            set1.add( roleDtoMapper.fromDtoIn( roleDtoIn ) );
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

    protected Set<RoleDtoOut> roleSetToRoleDtoOutSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDtoOut> set1 = new HashSet<RoleDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleDtoMapper.toDtoOut( role ) );
        }

        return set1;
    }
}
