package org.example.digimon.dto.dictionary.familyDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FamilyDictionaryDtoOut implements Serializable {

    private Long id;
    private String value;
    private String shortValue;
    private Date updatedAt;
    private String updatedBy;

}
