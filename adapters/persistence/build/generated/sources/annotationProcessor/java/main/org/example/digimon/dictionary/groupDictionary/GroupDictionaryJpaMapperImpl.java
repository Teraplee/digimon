package org.example.digimon.dictionary.groupDictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-24T16:18:44+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class GroupDictionaryJpaMapperImpl implements GroupDictionaryJpaMapper {

    @Override
    public GroupDictionary fromJpaEntity(GroupDictionaryJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        GroupDictionary groupDictionary = new GroupDictionary();

        groupDictionary.setId( arg0.getId() );
        groupDictionary.setValue( arg0.getValue() );
        groupDictionary.setUpdatedAt( arg0.getUpdatedAt() );
        groupDictionary.setUpdatedBy( arg0.getUpdatedBy() );

        return groupDictionary;
    }

    @Override
    public GroupDictionaryJpaEntity toJpaEntity(GroupDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        GroupDictionaryJpaEntity groupDictionaryJpaEntity = new GroupDictionaryJpaEntity();

        groupDictionaryJpaEntity.setId( arg0.getId() );
        groupDictionaryJpaEntity.setValue( arg0.getValue() );
        groupDictionaryJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        groupDictionaryJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );

        return groupDictionaryJpaEntity;
    }
}
