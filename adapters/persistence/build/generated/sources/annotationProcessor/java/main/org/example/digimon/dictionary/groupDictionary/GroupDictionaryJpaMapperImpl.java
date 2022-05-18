package org.example.digimon.dictionary.groupDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:26+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class GroupDictionaryJpaMapperImpl implements GroupDictionaryJpaMapper {

    @Override
    public GroupDictionary fromJpaEntity(GroupDictionaryJpaEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        GroupDictionary groupDictionary = new GroupDictionary();

        groupDictionary.setId( jpaEntity.getId() );
        groupDictionary.setValue( jpaEntity.getValue() );
        groupDictionary.setUpdatedAt( jpaEntity.getUpdatedAt() );
        groupDictionary.setUpdatedBy( jpaEntity.getUpdatedBy() );

        return groupDictionary;
    }

    @Override
    public GroupDictionaryJpaEntity toJpaEntity(GroupDictionary entity) {
        if ( entity == null ) {
            return null;
        }

        GroupDictionaryJpaEntity groupDictionaryJpaEntity = new GroupDictionaryJpaEntity();

        groupDictionaryJpaEntity.setId( entity.getId() );
        groupDictionaryJpaEntity.setValue( entity.getValue() );
        groupDictionaryJpaEntity.setUpdatedAt( entity.getUpdatedAt() );
        groupDictionaryJpaEntity.setUpdatedBy( entity.getUpdatedBy() );

        return groupDictionaryJpaEntity;
    }
}
