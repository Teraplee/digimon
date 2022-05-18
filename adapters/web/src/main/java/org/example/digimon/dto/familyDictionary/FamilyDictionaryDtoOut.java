package org.example.digimon.dto.familyDictionary;

import lombok.Data;
import org.example.digimon.dto.digimon.DigimonDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class FamilyDictionaryDtoOut implements Serializable {
    private final Long id;
    private final String value;
    private final String shortValue;
    private final Date updatedAt;
    private final String updatedBy;

    public FamilyDictionaryDtoOut(Long id, String value, String shortValue, Date updatedAt, String updatedBy) {
        this.id = id;
        this.value = value;
        this.shortValue = shortValue;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

}
