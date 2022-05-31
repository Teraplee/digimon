package org.example.digimon.mappers.dictionary.familydictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-31T21:39:22+0300",
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

        return familyDictionary;
    }

    @Override
    public FamilyDictionaryDtoOut toDtoOut(FamilyDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        FamilyDictionaryDtoOut familyDictionaryDtoOut = new FamilyDictionaryDtoOut();

        familyDictionaryDtoOut.setId( arg0.getId() );
        familyDictionaryDtoOut.setValue( arg0.getValue() );
        familyDictionaryDtoOut.setShortValue( arg0.getShortValue() );
        familyDictionaryDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        familyDictionaryDtoOut.setUpdatedBy( arg0.getUpdatedBy() );

        return familyDictionaryDtoOut;
    }
}
