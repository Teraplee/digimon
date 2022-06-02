package org.example.digimon.digimon;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.example.digimon.dictionary.classdictionary.ClassDictionaryJpaMapper;
import org.example.digimon.dictionary.familydictionary.FamilyDictionaryJpaEntity;
import org.example.digimon.dictionary.familydictionary.FamilyDictionaryJpaMapper;
import org.example.digimon.dictionary.groupdictionary.GroupDictionaryJpaMapper;
import org.example.digimon.dictionary.typedictionary.TypeDictionaryJpaMapper;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.example.digimon.domain.digimon.Digimon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T12:15:01+0300",
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
        digimonJpaEntity.setFamilies( familyDictionarySetToFamilyDictionaryJpaEntitySet( arg0.getFamilies() ) );

        return digimonJpaEntity;
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
