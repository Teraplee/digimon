package org.example.digimon.dictionary.typeDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.typeDictionary.TypeDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class TypeDictionaryJpaMapperImpl implements TypeDictionaryJpaMapper {

    @Override
    public TypeDictionary fromJpaEntity(TypeDictionaryJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        TypeDictionary typeDictionary = new TypeDictionary();

        typeDictionary.setId( jpaEntity.getId() );
        typeDictionary.setValue( jpaEntity.getValue() );
        typeDictionary.setUpdatedAt( jpaEntity.getUpdatedAt() );
        typeDictionary.setUpdatedBy( jpaEntity.getUpdatedBy() );

        return typeDictionary;
    }

    @Override
    public TypeDictionaryJpaEntity toJpaEntity(TypeDictionary entity) {
        if ( entity == null ) {
            return null;
        }

        TypeDictionaryJpaEntity typeDictionaryJpaEntity = new TypeDictionaryJpaEntity();

        typeDictionaryJpaEntity.setId( entity.getId() );
        typeDictionaryJpaEntity.setValue( entity.getValue() );
        typeDictionaryJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        typeDictionaryJpaEntity.setUpdatedBy( entity.getUpdatedBy() );

        return typeDictionaryJpaEntity;
    }
}
