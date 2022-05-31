package org.example.digimon.application.ports.out.dictionary.familydictionary;

import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchFamilyDictionaryPort {

    FamilyDictionary findById(Long id);

    List<FamilyDictionary> findAll();

    List<FamilyDictionary> findAll(Specification spec);

}
