package org.example.digimon.dictionary.groupDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.RemoveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.SaveGroupDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.groupDictionary.SearchGroupDictionaryPort;
import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class GroupDictionaryPersistenceAdapter implements RemoveGroupDictionaryPort, SaveGroupDictionaryPort, SearchGroupDictionaryPort {

    private final GroupDictionaryJpaRepository groupDictionaryJpaRepository;
    private final GroupDictionaryJpaMapper groupDictionaryJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            groupDictionaryJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public GroupDictionary save(GroupDictionary classDictionary) {
        try {
            return groupDictionaryJpaMapper.fromJpaEntity(groupDictionaryJpaRepository.save(groupDictionaryJpaMapper
                    .toJpaEntity(classDictionary)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public GroupDictionary findById(Long id) {
        try {
            return groupDictionaryJpaMapper.fromJpaEntity(groupDictionaryJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<GroupDictionary> findAll() {
        try {
            return groupDictionaryJpaMapper.fromJpaEntity(groupDictionaryJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<GroupDictionary> findAll(Specification spec) {
        try {
            return groupDictionaryJpaMapper.fromJpaEntity(groupDictionaryJpaRepository.findAll(spec));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
