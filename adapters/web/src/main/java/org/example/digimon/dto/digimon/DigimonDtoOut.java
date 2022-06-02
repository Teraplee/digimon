package org.example.digimon.dto.digimon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.digimon.DigimonGenderEnum;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoOut;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoOut;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoOut;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigimonDtoOut implements Serializable {

    private Long id;
    private String name;
    private Double attack;
    private Double defence;
    private String level;
    private String imageUrl;
    private TypeDictionaryDtoOut typeDictionary;
    private ClassDictionaryDtoOut classDictionary;
    private GroupDictionaryDtoOut groupDictionary;
    private DigimonGenderEnum gender;
    private LocalDate updatedAt;
    private String updatedBy;
    private Set<FamilyDictionaryDtoOut> families;

}
