package org.example.digimon.application.ports.out.dictionary.familyDictionary;

import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;

import java.util.List;

public interface SearchFamilyDictionaryPort {

    FamilyDictionary findById(Long id);

    List<FamilyDictionary> findAll();

}
