package org.example.digimon.mappers.dictionary.familyDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-20T21:01:17+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class FamilyDictionaryDtoMapperImpl implements FamilyDictionaryDtoMapper {

    @Override
    public FamilyDictionary fromDtoIn(FamilyDictionaryDtoIn arg0) {
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
    public FamilyDictionaryDtoOut toDtoOut(FamilyDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Long id = null;
        String value = null;
        String shortValue = null;
        Date updatedAt = null;
        String updatedBy = null;

        id = arg0.getId();
        value = arg0.getValue();
        shortValue = arg0.getShortValue();
        updatedAt = arg0.getUpdatedAt();
        updatedBy = arg0.getUpdatedBy();

        FamilyDictionaryDtoOut familyDictionaryDtoOut = new FamilyDictionaryDtoOut( id, value, shortValue, updatedAt, updatedBy );

        return familyDictionaryDtoOut;
    }
}
