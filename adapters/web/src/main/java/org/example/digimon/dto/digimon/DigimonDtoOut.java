package org.example.digimon.dto.digimon;

import lombok.Data;
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
@RequiredArgsConstructor
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

}
