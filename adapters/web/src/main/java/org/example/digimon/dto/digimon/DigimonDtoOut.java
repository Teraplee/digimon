package org.example.digimon.dto.digimon;

import lombok.Data;
import org.example.digimon.dto.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.dto.typeDictionary.TypeDictionaryDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
public class DigimonDtoOut implements Serializable {

    private final Long id;
    private final String name;
    private final Double attack;
    private final Double defence;
    private final String level;
    private final String imageUrl;
    private final TypeDictionaryDtoOut typeDictionary;
    private final ClassDictionaryDtoOut classDictionary;
    private final GroupDictionaryDtoOut groupDictionary;
    private final String gender;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<PlayerDtoOut> players;
    private final Set<FamilyDictionaryDtoOut> families;

    public DigimonDtoOut(Long id, String name, Double attack, Double defence, String level, String imageUrl, TypeDictionaryDtoOut typeDictionary, ClassDictionaryDtoOut classDictionary, GroupDictionaryDtoOut groupDictionary, String gender, Date updatedAt, String updatedBy, Set<PlayerDtoOut> players, Set<FamilyDictionaryDtoOut> families) {
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
