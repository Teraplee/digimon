package org.example.digimon.dictionary.classDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-25T14:39:20+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class ClassDictionaryJpaMapperImpl implements ClassDictionaryJpaMapper {

    @Override
    public ClassDictionary fromJpaEntity(ClassDictionaryJpaEntity arg0) {
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
    public ClassDictionaryJpaEntity toJpaEntity(ClassDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ClassDictionaryJpaEntity classDictionaryJpaEntity = new ClassDictionaryJpaEntity();

        classDictionaryJpaEntity.setId( arg0.getId() );
        classDictionaryJpaEntity.setValue( arg0.getValue() );
        classDictionaryJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        classDictionaryJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );

        return classDictionaryJpaEntity;
    }
}
