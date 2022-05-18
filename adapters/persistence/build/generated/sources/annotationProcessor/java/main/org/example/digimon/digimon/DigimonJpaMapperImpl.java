package org.example.digimon.digimon;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.dictionary.classDictionary.ClassDictionaryJpaMapper;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaEntity;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupDictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typeDictionary.TypeDictionaryJpaMapper;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.familyDictionary.FamilyDictionary;
import org.example.digimon.domain.player.Player;
import org.example.digimon.player.PlayerJpaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class DigimonJpaMapperImpl implements DigimonJpaMapper {

    @Autowired
    private TypeDictionaryJpaMapper typeDictionaryJpaMapper;
    @Autowired
    private ClassDictionaryJpaMapper classDictionaryJpaMapper;
    @Autowired
    private GroupDictionaryJpaMapper groupDictionaryJpaMapper;
    @Autowired
    private FamilyDictionaryJpaMapper familyDictionaryJpaMapper;

    @Override
    public Digimon fromJpaEntity(DigimonJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        Digimon digimon = new Digimon();

        digimon.setId( jpaEntity.getId() );
        digimon.setName( jpaEntity.getName() );
        digimon.setAttack( jpaEntity.getAttack() );
        digimon.setDefence( jpaEntity.getDefence() );
        digimon.setLevel( jpaEntity.getLevel() );
        digimon.setImageUrl( jpaEntity.getImageUrl() );
        digimon.setTypeDictionary( typeDictionaryJpaMapper.fromJpaEntity( jpaEntity.getTypeDictionary() ) );
        digimon.setClassDictionary( classDictionaryJpaMapper.fromJpaEntity( jpaEntity.getClassDictionary() ) );
        digimon.setGroupDictionary( groupDictionaryJpaMapper.fromJpaEntity( jpaEntity.getGroupDictionary() ) );
        digimon.setGender( jpaEntity.getGender() );
        digimon.setUpdatedAt( jpaEntity.getUpdatedAt() );
        digimon.setUpdatedBy( jpaEntity.getUpdatedBy() );
        digimon.setPlayers( playerJpaEntitySetToPlayerSet( jpaEntity.getPlayers() ) );
        digimon.setFamilies( familyDictionaryJpaEntitySetToFamilyDictionarySet( jpaEntity.getFamilies() ) );

        return digimon;
    }

    @Override
    public DigimonJpaEntity toJpaEntity(Digimon entity) {
        if ( entity == null ) {
            return null;
        }

        DigimonJpaEntity digimonJpaEntity = new DigimonJpaEntity();

        digimonJpaEntity.setId( entity.getId() );
        digimonJpaEntity.setName( entity.getName() );
        digimonJpaEntity.setAttack( entity.getAttack() );
        digimonJpaEntity.setDefence( entity.getDefence() );
        digimonJpaEntity.setLevel( entity.getLevel() );
        digimonJpaEntity.setImageUrl( entity.getImageUrl() );
        digimonJpaEntity.setTypeDictionary( typeDictionaryJpaMapper.toJpaEntity( entity.getTypeDictionary() ) );
        digimonJpaEntity.setClassDictionary( classDictionaryJpaMapper.toJpaEntity( entity.getClassDictionary() ) );
        digimonJpaEntity.setGroupDictionary( groupDictionaryJpaMapper.toJpaEntity( entity.getGroupDictionary() ) );
        digimonJpaEntity.setGender( entity.getGender() );
        digimonJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        digimonJpaEntity.setUpdatedBy( entity.getUpdatedBy() );
        digimonJpaEntity.setPlayers( playerSetToPlayerJpaEntitySet( entity.getPlayers() ) );
        digimonJpaEntity.setFamilies( familyDictionarySetToFamilyDictionaryJpaEntitySet( entity.getFamilies() ) );

        return digimonJpaEntity;
    }

    protected Set<Digimon> digimonJpaEntitySetToDigimonSet(Set<DigimonJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Digimon> set1 = new HashSet<Digimon>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DigimonJpaEntity digimonJpaEntity : set ) {
            set1.add( fromJpaEntity( digimonJpaEntity ) );
        }

        return set1;
    }

    protected Player playerJpaEntityToPlayer(PlayerJpaEntity playerJpaEntity) {
        if ( playerJpaEntity == null ) {
            return null;
        }

        Player player = new Player();

        player.setId( playerJpaEntity.getId() );
        player.setEmail( playerJpaEntity.getEmail() );
        player.setFirstName( playerJpaEntity.getFirstName() );
        player.setMiddleName( playerJpaEntity.getMiddleName() );
        player.setLastName( playerJpaEntity.getLastName() );
        player.setPhone( playerJpaEntity.getPhone() );
        player.setUsername( playerJpaEntity.getUsername() );
        player.setPassword( playerJpaEntity.getPassword() );
        player.setUpdatedAt( playerJpaEntity.getUpdatedAt() );
        player.setUpdatedBy( playerJpaEntity.getUpdatedBy() );
        player.setDigimons( digimonJpaEntitySetToDigimonSet( playerJpaEntity.getDigimons() ) );

        return player;
    }

    protected Set<Player> playerJpaEntitySetToPlayerSet(Set<PlayerJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Player> set1 = new HashSet<Player>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PlayerJpaEntity playerJpaEntity : set ) {
            set1.add( playerJpaEntityToPlayer( playerJpaEntity ) );
        }

        return set1;
    }

    protected Set<FamilyDictionary> familyDictionaryJpaEntitySetToFamilyDictionarySet(Set<FamilyDictionaryJpaEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<FamilyDictionary> set1 = new HashSet<FamilyDictionary>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FamilyDictionaryJpaEntity familyDictionaryJpaEntity : set ) {
            set1.add( familyDictionaryJpaMapper.fromJpaEntity( familyDictionaryJpaEntity ) );
        }

        return set1;
    }

    protected Set<DigimonJpaEntity> digimonSetToDigimonJpaEntitySet(Set<Digimon> set) {
        if ( set == null ) {
            return null;
        }

        Set<DigimonJpaEntity> set1 = new HashSet<DigimonJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Digimon digimon : set ) {
            set1.add( toJpaEntity( digimon ) );
        }

        return set1;
    }

    protected PlayerJpaEntity playerToPlayerJpaEntity(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerJpaEntity playerJpaEntity = new PlayerJpaEntity();

        playerJpaEntity.setId( player.getId() );
        playerJpaEntity.setEmail( player.getEmail() );
        playerJpaEntity.setFirstName( player.getFirstName() );
        playerJpaEntity.setMiddleName( player.getMiddleName() );
        playerJpaEntity.setLastName( player.getLastName() );
        playerJpaEntity.setPhone( player.getPhone() );
        playerJpaEntity.setUsername( player.getUsername() );
        playerJpaEntity.setPassword( player.getPassword() );
        playerJpaEntity.setUpdatedAt( player.getUpdatedAt() );
        playerJpaEntity.setUpdatedBy( player.getUpdatedBy() );
        playerJpaEntity.setDigimons( digimonSetToDigimonJpaEntitySet( player.getDigimons() ) );

        return playerJpaEntity;
    }

    protected Set<PlayerJpaEntity> playerSetToPlayerJpaEntitySet(Set<Player> set) {
        if ( set == null ) {
            return null;
        }

        Set<PlayerJpaEntity> set1 = new HashSet<PlayerJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Player player : set ) {
            set1.add( playerToPlayerJpaEntity( player ) );
        }

        return set1;
    }

    protected Set<FamilyDictionaryJpaEntity> familyDictionarySetToFamilyDictionaryJpaEntitySet(Set<FamilyDictionary> set) {
        if ( set == null ) {
            return null;
        }

        Set<FamilyDictionaryJpaEntity> set1 = new HashSet<FamilyDictionaryJpaEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FamilyDictionary familyDictionary : set ) {
            set1.add( familyDictionaryJpaMapper.toJpaEntity( familyDictionary ) );
        }

        return set1;
    }
}
