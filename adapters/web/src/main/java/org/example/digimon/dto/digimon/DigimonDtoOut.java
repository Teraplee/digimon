package org.example.digimon.dto.digimon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoOut;

import java.io.Serializable;
import java.util.Date;
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
    private String gender;
    private Date updatedAt;
    private String updatedBy;
    private Set<FamilyDictionaryDtoOut> families;

}
