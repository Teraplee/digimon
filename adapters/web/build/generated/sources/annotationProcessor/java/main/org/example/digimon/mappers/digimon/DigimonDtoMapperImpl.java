package org.example.digimon.mappers.digimon;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.dictionary.classDictionary.ClassDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.familyDictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.groupDictionary.GroupDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.typeDictionary.TypeDictionaryDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-23T17:19:10+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class DigimonDtoMapperImpl implements DigimonDtoMapper {

    @Autowired
    private TypeDictionaryDtoMapper typeDictionaryDtoMapper;
    @Autowired
    private ClassDictionaryDtoMapper classDictionaryDtoMapper;
    @Autowired
    private GroupDictionaryDtoMapper groupDictionaryDtoMapper;
    @Autowired
    private FamilyDictionaryDtoMapper familyDictionaryDtoMapper;

    @Override
    public Digimon fromDtoIn(DigimonDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Digimon digimon = new Digimon();

        digimon.setName( arg0.getName() );
        digimon.setAttack( arg0.getAttack() );
        digimon.setDefence( arg0.getDefence() );
        digimon.setLevel( arg0.getLevel() );
        digimon.setImageUrl( arg0.getImageUrl() );
        digimon.setTypeDictionary( typeDictionaryDtoMapper.fromDtoIn( arg0.getTypeDictionary() ) );
        digimon.setClassDictionary( classDictionaryDtoMapper.fromDtoIn( arg0.getClassDictionary() ) );
        digimon.setGroupDictionary( groupDictionaryDtoMapper.fromDtoIn( arg0.getGroupDictionary() ) );
        digimon.setGender( arg0.getGender() );
        digimon.setPlayers( playerDtoInSetToPlayerSet( arg0.getPlayers() ) );
        digimon.setFamilies( familyDictionaryDtoInSetToFamilyDictionarySet( arg0.getFamilies() ) );

        return digimon;
    }

    @Override
    public DigimonDtoOut toDtoOut(Digimon arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DigimonDtoOut digimonDtoOut = new DigimonDtoOut();

        digimonDtoOut.setId( arg0.getId() );
        digimonDtoOut.setName( arg0.getName() );
        digimonDtoOut.setAttack( arg0.getAttack() );
        digimonDtoOut.setDefence( arg0.getDefence() );
        digimonDtoOut.setLevel( arg0.getLevel() );
        digimonDtoOut.setImageUrl( arg0.getImageUrl() );
        digimonDtoOut.setTypeDictionary( typeDictionaryDtoMapper.toDtoOut( arg0.getTypeDictionary() ) );
        digimonDtoOut.setClassDictionary( classDictionaryDtoMapper.toDtoOut( arg0.getClassDictionary() ) );
        digimonDtoOut.setGroupDictionary( groupDictionaryDtoMapper.toDtoOut( arg0.getGroupDictionary() ) );
        digimonDtoOut.setGender( arg0.getGender() );
        digimonDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        digimonDtoOut.setUpdatedBy( arg0.getUpdatedBy() );
        digimonDtoOut.setPlayers( playerSetToPlayerDtoOutSet( arg0.getPlayers() ) );
        digimonDtoOut.setFamilies( familyDictionarySetToFamilyDictionaryDtoOutSet( arg0.getFamilies() ) );

        return digimonDtoOut;
    }

    protected Set<Digimon> digimonDtoInSetToDigimonSet(Set<DigimonDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<Digimon> set1 = new HashSet<Digimon>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DigimonDtoIn digimonDtoIn : set ) {
            set1.add( fromDtoIn( digimonDtoIn ) );
        }

        return set1;
    }

    protected Player playerDtoInToPlayer(PlayerDtoIn playerDtoIn) {
        if ( playerDtoIn == null ) {
            return null;
        }

        Player player = new Player();

        player.setEmail( playerDtoIn.getEmail() );
        player.setFirstName( playerDtoIn.getFirstName() );
        player.setMiddleName( playerDtoIn.getMiddleName() );
        player.setLastName( playerDtoIn.getLastName() );
        player.setPhone( playerDtoIn.getPhone() );
        player.setUsername( playerDtoIn.getUsername() );
        player.setPassword( playerDtoIn.getPassword() );
        player.setDigimons( digimonDtoInSetToDigimonSet( playerDtoIn.getDigimons() ) );

        return player;
    }

    protected Set<Player> playerDtoInSetToPlayerSet(Set<PlayerDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<Player> set1 = new HashSet<Player>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PlayerDtoIn playerDtoIn : set ) {
            set1.add( playerDtoInToPlayer( playerDtoIn ) );
        }

        return set1;
    }

    protected Set<FamilyDictionary> familyDictionaryDtoInSetToFamilyDictionarySet(Set<FamilyDictionaryDtoIn> set) {
        if ( set == null ) {
            return null;
        }

        Set<FamilyDictionary> set1 = new HashSet<FamilyDictionary>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FamilyDictionaryDtoIn familyDictionaryDtoIn : set ) {
            set1.add( familyDictionaryDtoMapper.fromDtoIn( familyDictionaryDtoIn ) );
        }

        return set1;
    }

    protected Set<DigimonDtoOut> digimonSetToDigimonDtoOutSet(Set<Digimon> set) {
        if ( set == null ) {
            return null;
        }

        Set<DigimonDtoOut> set1 = new HashSet<DigimonDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Digimon digimon : set ) {
            set1.add( toDtoOut( digimon ) );
        }

        return set1;
    }

    protected PlayerDtoOut playerToPlayerDtoOut(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerDtoOut playerDtoOut = new PlayerDtoOut();

        playerDtoOut.setId( player.getId() );
        playerDtoOut.setEmail( player.getEmail() );
        playerDtoOut.setFirstName( player.getFirstName() );
        playerDtoOut.setMiddleName( player.getMiddleName() );
        playerDtoOut.setLastName( player.getLastName() );
        playerDtoOut.setPhone( player.getPhone() );
        playerDtoOut.setUsername( player.getUsername() );
        playerDtoOut.setUpdatedAt( player.getUpdatedAt() );
        playerDtoOut.setUpdatedBy( player.getUpdatedBy() );
        playerDtoOut.setDigimons( digimonSetToDigimonDtoOutSet( player.getDigimons() ) );

        return playerDtoOut;
    }

    protected Set<PlayerDtoOut> playerSetToPlayerDtoOutSet(Set<Player> set) {
        if ( set == null ) {
            return null;
        }

        Set<PlayerDtoOut> set1 = new HashSet<PlayerDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Player player : set ) {
            set1.add( playerToPlayerDtoOut( player ) );
        }

        return set1;
    }

    protected Set<FamilyDictionaryDtoOut> familyDictionarySetToFamilyDictionaryDtoOutSet(Set<FamilyDictionary> set) {
        if ( set == null ) {
            return null;
        }

        Set<FamilyDictionaryDtoOut> set1 = new HashSet<FamilyDictionaryDtoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FamilyDictionary familyDictionary : set ) {
            set1.add( familyDictionaryDtoMapper.toDtoOut( familyDictionary ) );
        }

        return set1;
    }
}
