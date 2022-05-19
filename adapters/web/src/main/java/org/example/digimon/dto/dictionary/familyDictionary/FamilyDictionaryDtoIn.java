package org.example.digimon.dto.dictionary.familyDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamilyDictionaryDtoIn implements Serializable {

    private Long id;
    private String value;
    private String shortValue;
    private Date updatedAt;
    private String updatedBy;

}