package org.example.digimon.dictionary.familyDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-24T16:18:44+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class FamilyDictionaryJpaMapperImpl implements FamilyDictionaryJpaMapper {

    @Override
    public FamilyDictionary fromJpaEntity(FamilyDictionaryJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FamilyDictionary familyDictionary = new FamilyDictionary();

        familyDictionary.setId( arg0.getId() );
        familyDictionary.setValue( arg0.getValue() );
        familyDictionary.setShortValue( arg0.getShortValue() );
        familyDictionary.setUpdatedAt( arg0.getUpdatedAt() );
        familyDictionary.setUpdatedBy( arg0.getUpdatedBy() );

        return familyDictionary;
    }

    @Override
    public FamilyDictionaryJpaEntity toJpaEntity(FamilyDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FamilyDictionaryJpaEntity familyDictionaryJpaEntity = new FamilyDictionaryJpaEntity();

        familyDictionaryJpaEntity.setId( arg0.getId() );
        familyDictionaryJpaEntity.setValue( arg0.getValue() );
        familyDictionaryJpaEntity.setShortValue( arg0.getShortValue() );
        familyDictionaryJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        familyDictionaryJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );

        return familyDictionaryJpaEntity;
    }
}
