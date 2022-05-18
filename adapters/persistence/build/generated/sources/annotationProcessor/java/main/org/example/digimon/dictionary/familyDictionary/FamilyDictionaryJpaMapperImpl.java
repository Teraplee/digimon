package org.example.digimon.dictionary.familyDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.familyDictionary.FamilyDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class FamilyDictionaryJpaMapperImpl implements FamilyDictionaryJpaMapper {

    @Override
    public FamilyDictionary fromJpaEntity(FamilyDictionaryJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        FamilyDictionary familyDictionary = new FamilyDictionary();

        familyDictionary.setId( jpaEntity.getId() );
        familyDictionary.setValue( jpaEntity.getValue() );
        familyDictionary.setShortValue( jpaEntity.getShortValue() );
        familyDictionary.setUpdatedAt( jpaEntity.getUpdatedAt() );
        familyDictionary.setUpdatedBy( jpaEntity.getUpdatedBy() );

        return familyDictionary;
    }

    @Override
    public FamilyDictionaryJpaEntity toJpaEntity(FamilyDictionary entity) {
        if ( entity == null ) {
            return null;
        }

        FamilyDictionaryJpaEntity familyDictionaryJpaEntity = new FamilyDictionaryJpaEntity();

        familyDictionaryJpaEntity.setId( entity.getId() );
        familyDictionaryJpaEntity.setValue( entity.getValue() );
        familyDictionaryJpaEntity.setShortValue( entity.getShortValue() );
        familyDictionaryJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        familyDictionaryJpaEntity.setUpdatedBy( entity.getUpdatedBy() );

        return familyDictionaryJpaEntity;
    }
}
