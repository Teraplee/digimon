package org.example.digimon.domain.digimon;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
import org.example.digimon.domain.player.Player;

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
    private String gender;
    private Date updatedAt;
    private String updatedBy;
    private Set<Player> players;
    private Set<FamilyDictionary> families;

}
