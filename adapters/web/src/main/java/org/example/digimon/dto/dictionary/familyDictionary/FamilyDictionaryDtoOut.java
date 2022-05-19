package org.example.digimon.dto.dictionary.familyDictionary;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class FamilyDictionaryDtoOut implements Serializable {

    private final Long id;
    private final String value;
    private final String shortValue;
    private final Date updatedAt;
    private final String updatedBy;

}
