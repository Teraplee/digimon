package org.example.digimon.dto.digimon;

import lombok.Data;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.typeDictionary.TypeDictionaryDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
public class DigimonDtoIn implements Serializable {
    private final Long id;
    private final String name;
    private final Double attack;
    private final Double defence;
    private final String level;
    private final String imageUrl;
    private final TypeDictionaryDtoIn typeDictionary;
    private final ClassDictionaryDtoIn classDictionary;
    private final GroupDictionaryDtoIn groupDictionary;
    private final String gender;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<PlayerDtoIn> players;
    private final Set<FamilyDictionaryDtoIn> families;

    public DigimonDtoIn(Long id, String name, Double attack, Double defence, String level, String imageUrl, TypeDictionaryDtoIn typeDictionary, ClassDictionaryDtoIn classDictionary, GroupDictionaryDtoIn groupDictionary, String gender, Date updatedAt, String updatedBy, Set<PlayerDtoIn> players, Set<FamilyDictionaryDtoIn> families) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.level = level;
        this.imageUrl = imageUrl;
        this.typeDictionary = typeDictionary;
        this.classDictionary = classDictionary;
        this.groupDictionary = groupDictionary;
        this.gender = gender;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.players = players;
        this.families = families;
    }
}
