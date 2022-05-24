package org.example.digimon.dictionary.typeDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-24T16:18:44+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class TypeDictionaryJpaMapperImpl implements TypeDictionaryJpaMapper {

    @Override
    public TypeDictionary fromJpaEntity(TypeDictionaryJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TypeDictionary typeDictionary = new TypeDictionary();

        typeDictionary.setId( arg0.getId() );
        typeDictionary.setValue( arg0.getValue() );
        typeDictionary.setUpdatedAt( arg0.getUpdatedAt() );
        typeDictionary.setUpdatedBy( arg0.getUpdatedBy() );

        return typeDictionary;
    }

    @Override
    public TypeDictionaryJpaEntity toJpaEntity(TypeDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TypeDictionaryJpaEntity typeDictionaryJpaEntity = new TypeDictionaryJpaEntity();

        typeDictionaryJpaEntity.setId( arg0.getId() );
        typeDictionaryJpaEntity.setValue( arg0.getValue() );
        typeDictionaryJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        typeDictionaryJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );

        return typeDictionaryJpaEntity;
    }
}
