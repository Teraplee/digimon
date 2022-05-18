package org.example.digimon.player;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.digimon.DigimonJpaEntity;
import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class PlayerJpaMapperImpl implements PlayerJpaMapper {

    @Autowired
    private DigimonJpaMapper digimonJpaMapper;

    @Override
    public Player fromJpaEntity(PlayerJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        Player player = new Player();

        player.setId( jpaEntity.getId() );
        player.setEmail( jpaEntity.getEmail() );
        player.setFirstName( jpaEntity.getFirstName() );
        player.setMiddleName( jpaEntity.getMiddleName() );
        player.setLastName( jpaEntity.getLastName() );
        player.setPhone( jpaEntity.getPhone() );
        player.setUsername( jpaEntity.getUsername() );
        player.setPassword( jpaEntity.getPassword() );
        player.setUpdatedAt( jpaEntity.getUpdatedAt() );
        player.setUpdatedBy( jpaEntity.getUpdatedBy() );
        player.setDigimons( digimonJpaEntitySetToDigimonSet( jpaEntity.getDigimons() ) );

        return player;
    }

    @Override
    public PlayerJpaEntity toJpaEntity(Player entity) {
        if ( entity == null ) {
            return null;
        }

        PlayerJpaEntity playerJpaEntity = new PlayerJpaEntity();

        playerJpaEntity.setId( entity.getId() );
        playerJpaEntity.setEmail( entity.getEmail() );
        playerJpaEntity.setFirstName( entity.getFirstName() );
        playerJpaEntity.setMiddleName( entity.getMiddleName() );
        playerJpaEntity.setLastName( entity.getLastName() );
        playerJpaEntity.setPhone( entity.getPhone() );
        playerJpaEntity.setUsername( entity.getUsername() );
        playerJpaEntity.setPassword( entity.getPassword() );
        playerJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        playerJpaEntity.setUpdatedBy( entity.getUpdatedBy() );
        playerJpaEntity.setDigimons( digimonSetToDigimonJpaEntitySet( entity.getDigimons() ) );

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
}
