package org.example.digimon.dto.dictionary.familydictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

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
