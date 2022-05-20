package org.example.digimon.mappers.dictionary.groupDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-20T21:01:18+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class GroupDictionaryDtoMapperImpl implements GroupDictionaryDtoMapper {

    @Override
    public GroupDictionary fromDtoIn(GroupDictionaryDtoIn arg0) {
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
    public GroupDictionaryDtoOut toDtoOut(GroupDictionary arg0) {
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

        GroupDictionaryDtoOut groupDictionaryDtoOut = new GroupDictionaryDtoOut( id, value, updatedAt, updatedBy );

        return groupDictionaryDtoOut;
    }
}
