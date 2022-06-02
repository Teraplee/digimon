package org.example.digimon.mappers.dictionary.groupdictionary;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.dictionary.groupdictionary.GroupDictionary;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T22:12:21+0300",
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

        return groupDictionary;
    }

    @Override
    public GroupDictionaryDtoOut toDtoOut(GroupDictionary arg0) {
        if ( arg0 == null ) {
            return null;
        }

        GroupDictionaryDtoOut groupDictionaryDtoOut = new GroupDictionaryDtoOut();

        groupDictionaryDtoOut.setId( arg0.getId() );
        groupDictionaryDtoOut.setValue( arg0.getValue() );
        groupDictionaryDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        groupDictionaryDtoOut.setUpdatedBy( arg0.getUpdatedBy() );

        return groupDictionaryDtoOut;
    }
}
