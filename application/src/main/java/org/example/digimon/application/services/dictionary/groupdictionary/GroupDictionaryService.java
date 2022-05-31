package org.example.digimon.application.services.dictionary.groupdictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.RemoveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.SaveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.SearchGroupDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.groupdictionary.RemoveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupdictionary.SaveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupdictionary.SearchGroupDictionaryPort;
import org.example.digimon.domain.dictionary.groupdictionary.GroupDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupDictionaryService implements RemoveGroupDictionaryUseCase, SaveGroupDictionaryUseCase, SearchGroupDictionaryUseCase {

    private final RemoveGroupDictionaryPort removeGroupDictionaryPort;
    private final SaveGroupDictionaryPort saveGroupDictionaryPort;
    private final SearchGroupDictionaryPort searchGroupDictionaryPort;

    @Override
    public void remove(Long id) {
        removeGroupDictionaryPort.remove(id);
    }

    @Override
    public GroupDictionary save(GroupDictionary groupDictionary) {
        return saveGroupDictionaryPort.save(groupDictionary);
    }

    @Override
    public GroupDictionary findById(Long id) {
        return searchGroupDictionaryPort.findById(id);
    }

    @Override
    public List<GroupDictionary> findAll() {
        return searchGroupDictionaryPort.findAll();
    }

    @Override
    public List<GroupDictionary> findAll(Specification spec) {
        return searchGroupDictionaryPort.findAll(spec);
    }
}
