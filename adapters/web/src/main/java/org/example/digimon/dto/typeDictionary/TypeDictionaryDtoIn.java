package org.example.digimon.dto.typeDictionary;

import lombok.Data;
import org.example.digimon.dto.digimon.DigimonDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class TypeDictionaryDtoIn implements Serializable {
    private final Long id;
    private final String value;
    private final Date updatedAt;
    private final String updatedBy;

    public TypeDictionaryDtoIn(Long id, String value, Date updatedAt, String updatedBy) {
        this.id = id;
        this.value = value;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }
}
