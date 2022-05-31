package org.example.digimon.domain.dictionary.familydictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyDictionary {

    private Long id;
    private String value;
    private String shortValue;
    private Date updatedAt;
    private String updatedBy;

}
