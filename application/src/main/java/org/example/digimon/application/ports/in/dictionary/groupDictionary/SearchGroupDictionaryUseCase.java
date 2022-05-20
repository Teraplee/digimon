package org.example.digimon.application.ports.in.dictionary.groupDictionary;

import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;

import java.util.List;

public interface SearchGroupDictionaryUseCase {

    GroupDictionary findById(Long id);

    List<GroupDictionary> findAll();

}
