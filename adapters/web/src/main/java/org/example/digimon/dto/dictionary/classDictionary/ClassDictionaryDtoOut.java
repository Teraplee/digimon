package org.example.digimon.dto.dictionary.classDictionary;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@RequiredArgsConstructor
public class ClassDictionaryDtoOut implements Serializable {

    private final Long id;
    private final String value;
    private final Date updatedAt;
    private final String updatedBy;

}
