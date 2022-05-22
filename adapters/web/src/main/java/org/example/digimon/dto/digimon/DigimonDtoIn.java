package org.example.digimon.dto.digimon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigimonDtoIn implements Serializable {

    private String name;
    private Double attack;
    private Double defence;
    private String level;
    private String imageUrl;
    private TypeDictionaryDtoIn typeDictionary;
    private ClassDictionaryDtoIn classDictionary;
    private GroupDictionaryDtoIn groupDictionary;
    private String gender;
    private Set<PlayerDtoIn> players;
    private Set<FamilyDictionaryDtoIn> families;

}
