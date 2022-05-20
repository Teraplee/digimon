package org.example.digimon.application.ports.in.dictionary.familyDictionary;

import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;

import java.util.List;

public interface SearchFamilyDictionaryUseCase {

    FamilyDictionary findById(Long id);

    List<FamilyDictionary> findAll();

}
