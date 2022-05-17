package org.example.digimon.domain.familyDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.digimon.Digimon;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyDictionary {

    private Long id;
    private String value;
    private String shortValue;
    private Date updatedAt;
    private String updatedBy;
    private Set<Digimon> digimons;

}
