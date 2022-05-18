package org.example.digimon.mappers.classDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:31+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class ClassDictionaryDtoMapperImpl implements ClassDictionaryDtoMapper {

    @Override
    public ClassDictionary fromDtoIn(ClassDictionaryDtoIn dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        ClassDictionary classDictionary = new ClassDictionary();

        classDictionary.setId( dtoIn.getId() );
        classDictionary.setValue( dtoIn.getValue() );
        classDictionary.setUpdatedAt( dtoIn.getUpdatedAt() );
        classDictionary.setUpdatedBy( dtoIn.getUpdatedBy() );

        return classDictionary;
    }

    @Override
    public ClassDictionaryDtoOut toDtoOut(ClassDictionary dtoOut) {
        if ( dtoOut == null ) {
            return null;
        }

        Long id = null;
        String value = null;
        Date updatedAt = null;
        String updatedBy = null;

        id = dtoOut.getId();
        value = dtoOut.getValue();
        updatedAt = dtoOut.getUpdatedAt();
        updatedBy = dtoOut.getUpdatedBy();

        ClassDictionaryDtoOut classDictionaryDtoOut = new ClassDictionaryDtoOut( id, value, updatedAt, updatedBy );

        return classDictionaryDtoOut;
    }
}
