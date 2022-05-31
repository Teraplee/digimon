package org.example.digimon.mappers.dictionary.classdictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-31T21:39:23+0300",
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

        return classDictionary;
    }

    @Override
    public ClassDictionaryDtoOut toDtoOut(ClassDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClassDictionaryDtoOut classDictionaryDtoOut = new ClassDictionaryDtoOut();

        classDictionaryDtoOut.setId( arg0.getId() );
        classDictionaryDtoOut.setValue( arg0.getValue() );
        classDictionaryDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        classDictionaryDtoOut.setUpdatedBy( arg0.getUpdatedBy() );

        return classDictionaryDtoOut;
    }
}
