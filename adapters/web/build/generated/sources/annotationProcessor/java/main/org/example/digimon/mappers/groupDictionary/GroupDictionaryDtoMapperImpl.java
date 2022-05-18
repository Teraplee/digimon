package org.example.digimon.mappers.groupDictionary;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-18T20:26:31+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class GroupDictionaryDtoMapperImpl implements GroupDictionaryDtoMapper {

    @Override
    public GroupDictionary fromDtoIn(GroupDictionaryDtoIn dtoIn) {
        if ( dtoIn == null ) {
            return null;
        }

        GroupDictionary groupDictionary = new GroupDictionary();

        groupDictionary.setId( dtoIn.getId() );
        groupDictionary.setValue( dtoIn.getValue() );
        groupDictionary.setUpdatedAt( dtoIn.getUpdatedAt() );
        groupDictionary.setUpdatedBy( dtoIn.getUpdatedBy() );

        return groupDictionary;
    }

    @Override
    public GroupDictionaryDtoOut toDtoOut(GroupDictionary dtoOut) {
        if ( dtoOut == null ) {
            return null;
        }

        Long id = null;
        String value = null;
        Date updatedAt = null;
        String updatedBy = null;

        id = dtoOut.getId();
        value = dtoOut.getValue();
        updatedAt = dtoOut.getUpdatedAt();
        updatedBy = dtoOut.getUpdatedBy();

        GroupDictionaryDtoOut groupDictionaryDtoOut = new GroupDictionaryDtoOut( id, value, updatedAt, updatedBy );

        return groupDictionaryDtoOut;
    }
}
