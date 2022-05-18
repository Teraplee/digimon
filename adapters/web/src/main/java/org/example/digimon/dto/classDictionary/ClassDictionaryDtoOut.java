package org.example.digimon.dto.classDictionary;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClassDictionaryDtoOut implements Serializable {

    private final Long id;
    private final String value;
    private final Date updatedAt;
    private final String updatedBy;

    public ClassDictionaryDtoOut(Long id, String value, Date updatedAt, String updatedBy) {
        this.id = id;
        this.value = value;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }
}
