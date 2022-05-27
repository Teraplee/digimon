package org.example.digimon.application.ports.in.dictionary.groupDictionary;

import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchGroupDictionaryUseCase {

    GroupDictionary findById(Long id);

    List<GroupDictionary> findAll();

    List<GroupDictionary> findAll(Specification spec);

}
