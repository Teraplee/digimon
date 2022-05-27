package org.example.digimon.application.services.dictionary.groupDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.RemoveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.SaveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.SearchGroupDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.RemoveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.SaveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.SearchGroupDictionaryPort;
import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
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
