package org.example.digimon.mappers.digimon;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoOut;
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
    date = "2022-05-19T21:08:07+0300",
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

        digimon.setId( arg0.getId() );
        digimon.setName( arg0.getName() );
        digimon.setAttack( arg0.getAttack() );
        digimon.setDefence( arg0.getDefence() );
        digimon.setLevel( arg0.getLevel() );
        digimon.setImageUrl( arg0.getImageUrl() );
        digimon.setTypeDictionary( typeDictionaryDtoMapper.fromDtoIn( arg0.getTypeDictionary() ) );
        digimon.setClassDictionary( classDictionaryDtoMapper.fromDtoIn( arg0.getClassDictionary() ) );
        digimon.setGroupDictionary( groupDictionaryDtoMapper.fromDtoIn( arg0.getGroupDictionary() ) );
        digimon.setGender( arg0.getGender() );
        digimon.setUpdatedAt( arg0.getUpdatedAt() );
        digimon.setUpdatedBy( arg0.getUpdatedBy() );
        digimon.setPlayers( playerDtoInSetToPlayerSet( arg0.getPlayers() ) );
        digimon.setFamilies( familyDictionaryDtoInSetToFamilyDictionarySet( arg0.getFamilies() ) );

        return digimon;
    }

    @Override
    public DigimonDtoOut toDtoOut(Digimon arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Set<PlayerDtoOut> players = null;
        Set<FamilyDictionaryDtoOut> families = null;
        Long id = null;
        String name = null;
        Double attack = null;
        Double defence = null;
        String level = null;
        String imageUrl = null;
        TypeDictionaryDtoOut typeDictionary = null;
        ClassDictionaryDtoOut classDictionary = null;
        GroupDictionaryDtoOut groupDictionary = null;
        String gender = null;
        Date updatedAt = null;
        String updatedBy = null;

        players = playerSetToPlayerDtoOutSet( arg0.getPlayers() );
        families = familyDictionarySetToFamilyDictionaryDtoOutSet( arg0.getFamilies() );
        id = arg0.getId();
        name = arg0.getName();
        attack = arg0.getAttack();
        defence = arg0.getDefence();
        level = arg0.getLevel();
        imageUrl = arg0.getImageUrl();
        typeDictionary = typeDictionaryDtoMapper.toDtoOut( arg0.getTypeDictionary() );
        classDictionary = classDictionaryDtoMapper.toDtoOut( arg0.getClassDictionary() );
        groupDictionary = groupDictionaryDtoMapper.toDtoOut( arg0.getGroupDictionary() );
        gender = arg0.getGender();
        updatedAt = arg0.getUpdatedAt();
        updatedBy = arg0.getUpdatedBy();

        DigimonDtoOut digimonDtoOut = new DigimonDtoOut( id, name, attack, defence, level, imageUrl, typeDictionary, classDictionary, groupDictionary, gender, updatedAt, updatedBy, players, families );

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

        player.setId( playerDtoIn.getId() );
        player.setEmail( playerDtoIn.getEmail() );
        player.setFirstName( playerDtoIn.getFirstName() );
        player.setMiddleName( playerDtoIn.getMiddleName() );
        player.setLastName( playerDtoIn.getLastName() );
        player.setPhone( playerDtoIn.getPhone() );
        player.setUsername( playerDtoIn.getUsername() );
        player.setPassword( playerDtoIn.getPassword() );
        player.setUpdatedAt( playerDtoIn.getUpdatedAt() );
        player.setUpdatedBy( playerDtoIn.getUpdatedBy() );
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

        digimons = digimonSetToDigimonDtoOutSet( player.getDigimons() );
        id = player.getId();
        email = player.getEmail();
        firstName = player.getFirstName();
        middleName = player.getMiddleName();
        lastName = player.getLastName();
        phone = player.getPhone();
        username = player.getUsername();
        updatedAt = player.getUpdatedAt();
        updatedBy = player.getUpdatedBy();

        PlayerDtoOut playerDtoOut = new PlayerDtoOut( id, email, firstName, middleName, lastName, phone, username, updatedAt, updatedBy, digimons );

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
