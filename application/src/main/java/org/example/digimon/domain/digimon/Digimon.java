package org.example.digimon.domain.digimon;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.example.digimon.domain.dictionary.groupdictionary.GroupDictionary;
import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Digimon {

    private Long id;
    private String name;
    private Double attack;
    private Double defence;
    private String level;
    private String imageUrl;
    private TypeDictionary typeDictionary;
    private ClassDictionary classDictionary;
    private GroupDictionary groupDictionary;
    private DigimonGenderEnum gender;
    private Date updatedAt;
    private String updatedBy;
    private Set<FamilyDictionary> families;

}
