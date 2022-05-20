package org.example.digimon.application.ports.out.dictionary.groupDictionary;

import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;

import java.util.List;

public interface SearchGroupDictionaryPort {

    GroupDictionary findById(Long id);

    List<GroupDictionary> findAll();

}
