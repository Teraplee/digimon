package org.example.digimon.digimon;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.dictionary.classDictionary.ClassDictionaryJpaMapper;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaEntity;
import org.example.digimon.dictionary.familyDictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupDictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typeDictionary.TypeDictionaryJpaMapper;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.player.PlayerJpaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T21:07:56+0300",
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
    public Digimon fromJpaEntity(DigimonJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Digimon digimon = new Digimon();

        digimon.setId( arg0.getId() );
        digimon.setName( arg0.getName() );
        digimon.setAttack( arg0.getAttack() );
        digimon.setDefence( arg0.getDefence() );
        digimon.setLevel( arg0.getLevel() );
        digimon.setImageUrl( arg0.getImageUrl() );
        digimon.setTypeDictionary( typeDictionaryJpaMapper.fromJpaEntity( arg0.getTypeDictionary() ) );
        digimon.setClassDictionary( classDictionaryJpaMapper.fromJpaEntity( arg0.getClassDictionary() ) );
        digimon.setGroupDictionary( groupDictionaryJpaMapper.fromJpaEntity( arg0.getGroupDictionary() ) );
        digimon.setGender( arg0.getGender() );
        digimon.setUpdatedAt( arg0.getUpdatedAt() );
        digimon.setUpdatedBy( arg0.getUpdatedBy() );
        digimon.setPlayers( playerJpaEntitySetToPlayerSet( arg0.getPlayers() ) );
        digimon.setFamilies( familyDictionaryJpaEntitySetToFamilyDictionarySet( arg0.getFamilies() ) );

        return digimon;
    }

    @Override
    public DigimonJpaEntity toJpaEntity(Digimon arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DigimonJpaEntity digimonJpaEntity = new DigimonJpaEntity();

        digimonJpaEntity.setId( arg0.getId() );
        digimonJpaEntity.setName( arg0.getName() );
        digimonJpaEntity.setAttack( arg0.getAttack() );
        digimonJpaEntity.setDefence( arg0.getDefence() );
        digimonJpaEntity.setLevel( arg0.getLevel() );
        digimonJpaEntity.setImageUrl( arg0.getImageUrl() );
        digimonJpaEntity.setTypeDictionary( typeDictionaryJpaMapper.toJpaEntity( arg0.getTypeDictionary() ) );
        digimonJpaEntity.setClassDictionary( classDictionaryJpaMapper.toJpaEntity( arg0.getClassDictionary() ) );
        digimonJpaEntity.setGroupDictionary( groupDictionaryJpaMapper.toJpaEntity( arg0.getGroupDictionary() ) );
        digimonJpaEntity.setGender( arg0.getGender() );
        digimonJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        digimonJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );
        digimonJpaEntity.setPlayers( playerSetToPlayerJpaEntitySet( arg0.getPlayers() ) );
        digimonJpaEntity.setFamilies( familyDictionarySetToFamilyDictionaryJpaEntitySet( arg0.getFamilies() ) );

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
