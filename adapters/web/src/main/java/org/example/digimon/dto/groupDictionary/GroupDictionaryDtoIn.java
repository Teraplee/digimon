package org.example.digimon.dto.groupDictionary;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GroupDictionaryDtoIn implements Serializable {

    private final Long id;
    private final String value;
    private final Date updatedAt;
    private final String updatedBy;

    public GroupDictionaryDtoIn(Long id, String value, Date updatedAt, String updatedBy) {
        this.id = id;
        this.value = value;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }
}
