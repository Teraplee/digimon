package org.example.digimon.mappers.dictionary.typedictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T22:12:21+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class TypeDictionaryDtoMapperImpl implements TypeDictionaryDtoMapper {

    @Override
    public TypeDictionary fromDtoIn(TypeDictionaryDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TypeDictionary typeDictionary = new TypeDictionary();

        typeDictionary.setId( arg0.getId() );
        typeDictionary.setValue( arg0.getValue() );

        return typeDictionary;
    }

    @Override
    public TypeDictionaryDtoOut toDtoOut(TypeDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TypeDictionaryDtoOut typeDictionaryDtoOut = new TypeDictionaryDtoOut();

        typeDictionaryDtoOut.setId( arg0.getId() );
        typeDictionaryDtoOut.setValue( arg0.getValue() );
        typeDictionaryDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        typeDictionaryDtoOut.setUpdatedBy( arg0.getUpdatedBy() );

        return typeDictionaryDtoOut;
    }
}
