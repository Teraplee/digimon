package org.example.digimon.dictionary.classDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.classDictionary.ClassDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class ClassDictionaryJpaMapperImpl implements ClassDictionaryJpaMapper {

    @Override
    public ClassDictionary fromJpaEntity(ClassDictionaryJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        ClassDictionary classDictionary = new ClassDictionary();

        classDictionary.setId( jpaEntity.getId() );
        classDictionary.setValue( jpaEntity.getValue() );
        classDictionary.setUpdatedAt( jpaEntity.getUpdatedAt() );
        classDictionary.setUpdatedBy( jpaEntity.getUpdatedBy() );

        return classDictionary;
    }

    @Override
    public ClassDictionaryJpaEntity toJpaEntity(ClassDictionary entity) {
        if ( entity == null ) {
            return null;
        }

        ClassDictionaryJpaEntity classDictionaryJpaEntity = new ClassDictionaryJpaEntity();

        classDictionaryJpaEntity.setId( entity.getId() );
        classDictionaryJpaEntity.setValue( entity.getValue() );
        classDictionaryJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        classDictionaryJpaEntity.setUpdatedBy( entity.getUpdatedBy() );

        return classDictionaryJpaEntity;
    }
}
