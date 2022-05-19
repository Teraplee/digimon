package org.example.digimon.mappers.dictionary.familyDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-19T18:18:39+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class FamilyDictionaryDtoMapperImpl implements FamilyDictionaryDtoMapper {

    @Override
    public FamilyDictionary fromDtoIn(FamilyDictionaryDtoIn dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        FamilyDictionary familyDictionary = new FamilyDictionary();

        familyDictionary.setId( dtoIn.getId() );
        familyDictionary.setValue( dtoIn.getValue() );
        familyDictionary.setShortValue( dtoIn.getShortValue() );
        familyDictionary.setUpdatedAt( dtoIn.getUpdatedAt() );
        familyDictionary.setUpdatedBy( dtoIn.getUpdatedBy() );

        return familyDictionary;
    }

    @Override
    public FamilyDictionaryDtoOut toDtoOut(FamilyDictionary dtoOut) {
        if ( dtoOut == null ) {
            return null;
        }

        Long id = null;
        String value = null;
        String shortValue = null;
        Date updatedAt = null;
        String updatedBy = null;

        id = dtoOut.getId();
        value = dtoOut.getValue();
        shortValue = dtoOut.getShortValue();
        updatedAt = dtoOut.getUpdatedAt();
        updatedBy = dtoOut.getUpdatedBy();

        FamilyDictionaryDtoOut familyDictionaryDtoOut = new FamilyDictionaryDtoOut( id, value, shortValue, updatedAt, updatedBy );

        return familyDictionaryDtoOut;
    }
}
