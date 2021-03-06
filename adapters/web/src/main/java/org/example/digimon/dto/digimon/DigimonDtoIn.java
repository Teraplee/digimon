package org.example.digimon.dto.digimon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.digimon.DigimonGenderEnum;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoIn;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigimonDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Double attack;
    @NotNull
    private Double defence;
    @NotNull
    private String level;
    @NotNull
    private String imageUrl;
    @NotNull
    private TypeDictionaryDtoIn typeDictionary;
    @NotNull
    private ClassDictionaryDtoIn classDictionary;
    @NotNull
    private GroupDictionaryDtoIn groupDictionary;
    @NotNull
    private DigimonGenderEnum gender;
    @NotNull
    @Size(min = 1, max = 3, message = "families must be between 1 and 3")
    private Set<FamilyDictionaryDtoIn> families;

}
