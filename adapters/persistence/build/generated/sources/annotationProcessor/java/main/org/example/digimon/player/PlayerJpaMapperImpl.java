package org.example.digimon.player;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.digimon.DigimonJpaEntity;
import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.domain.role.Role;
import org.example.digimon.role.RoleJpaEntity;
import org.example.digimon.role.RoleJpaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T12:15:00+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class PlayerJpaMapperImpl implements PlayerJpaMapper {

    @Autowired
    private DigimonJpaMapper digimonJpaMapper;
    @Autowired
    private RoleJpaMapper roleJpaMapper;

    @Override
    public Player fromJpaEntity(PlayerJpaEntity arg0) {
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
        player.setDigimons( digimonJpaEntitySetToDigimonSet( arg0.getDigimons() ) );
        player.setRoles( roleJpaEntitySetToRoleSet( arg0.getRoles() ) );

        return player;
    }

    @Override
    public PlayerJpaEntity toJpaEntity(Player arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PlayerJpaEntity playerJpaEntity = new PlayerJpaEntity();

        playerJpaEntity.setId( arg0.getId() );
        playerJpaEntity.setEmail( arg0.getEmail() );
        playerJpaEntity.setFirstName( arg0.getFirstName() );
        playerJpaEntity.setMiddleName( arg0.getMiddleName() );
        playerJpaEntity.setLastName( arg0.getLastName() );
        playerJpaEntity.setPhone( arg0.getPhone() );
        playerJpaEntity.setUsername( arg0.getUsername() );
        playerJpaEntity.setPassword( arg0.getPassword() );
        playerJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        playerJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );
        playerJpaEntity.setDigimons( digimonSetToDigimonJpaEntitySet( arg0.getDigimons() ) );
        playerJpaEntity.setRoles( roleSetToRoleJpaEntitySet( arg0.getRoles() ) );

        return playerJpaEntity;
    }

    protected Set<Digimon> digimonJpaEntitySetToDigimonSet(Set<DigimonJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Digimon> set1 = new HashSet<Digimon>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DigimonJpaEntity digimonJpaEntity : set ) {
            set1.add( digimonJpaMapper.fromJpaEntity( digimonJpaEntity ) );
        }

        return set1;
    }

    protected Set<Role> roleJpaEntitySetToRoleSet(Set<RoleJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new HashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleJpaEntity roleJpaEntity : set ) {
            set1.add( roleJpaMapper.fromJpaEntity( roleJpaEntity ) );
        }

        return set1;
    }

    protected Set<DigimonJpaEntity> digimonSetToDigimonJpaEntitySet(Set<Digimon> set) {
        if ( set == null ) {
            return null;
        }

        Set<DigimonJpaEntity> set1 = new HashSet<DigimonJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Digimon digimon : set ) {
            set1.add( digimonJpaMapper.toJpaEntity( digimon ) );
        }

        return set1;
    }

    protected Set<RoleJpaEntity> roleSetToRoleJpaEntitySet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleJpaEntity> set1 = new HashSet<RoleJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleJpaMapper.toJpaEntity( role ) );
        }

        return set1;
    }
}
