package org.example.digimon.mappers.digimon;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.dictionary.classdictionary.ClassDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.familydictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.groupdictionary.GroupDictionaryDtoMapper;
import org.example.digimon.mappers.dictionary.typedictionary.TypeDictionaryDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T22:12:22+0300",
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
        digimonDtoOut.setFamilies( familyDictionarySetToFamilyDictionaryDtoOutSet( arg0.getFamilies() ) );

        return digimonDtoOut;
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
