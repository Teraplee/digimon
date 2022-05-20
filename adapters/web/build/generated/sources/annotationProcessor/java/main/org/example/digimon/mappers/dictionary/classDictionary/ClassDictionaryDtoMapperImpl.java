package org.example.digimon.mappers.dictionary.classDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-20T21:01:18+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class ClassDictionaryDtoMapperImpl implements ClassDictionaryDtoMapper {

    @Override
    public ClassDictionary fromDtoIn(ClassDictionaryDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClassDictionary classDictionary = new ClassDictionary();

        classDictionary.setId( arg0.getId() );
        classDictionary.setValue( arg0.getValue() );
        classDictionary.setUpdatedAt( arg0.getUpdatedAt() );
        classDictionary.setUpdatedBy( arg0.getUpdatedBy() );

        return classDictionary;
    }

    @Override
    public ClassDictionaryDtoOut toDtoOut(ClassDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Long id = null;
        String value = null;
        Date updatedAt = null;
        String updatedBy = null;

        id = arg0.getId();
        value = arg0.getValue();
        updatedAt = arg0.getUpdatedAt();
        updatedBy = arg0.getUpdatedBy();

        ClassDictionaryDtoOut classDictionaryDtoOut = new ClassDictionaryDtoOut( id, value, updatedAt, updatedBy );

        return classDictionaryDtoOut;
    }
}
