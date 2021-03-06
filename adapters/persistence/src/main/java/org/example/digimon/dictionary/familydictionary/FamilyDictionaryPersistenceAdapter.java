package org.example.digimon.dictionary.familydictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.dictionary.familydictionary.RemoveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familydictionary.SaveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familydictionary.SearchFamilyDictionaryPort;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class FamilyDictionaryPersistenceAdapter implements RemoveFamilyDictionaryPort, SaveFamilyDictionaryPort, SearchFamilyDictionaryPort {

    private final FamilyDictionaryJpaRepository familyDictionaryJpaRepository;
    private final FamilyDictionaryJpaMapper familyDictionaryJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            familyDictionaryJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public FamilyDictionary save(FamilyDictionary familyDictionary) {
        try {
            return familyDictionaryJpaMapper.fromJpaEntity(familyDictionaryJpaRepository.save(familyDictionaryJpaMapper
                    .toJpaEntity(familyDictionary)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public FamilyDictionary findById(Long id) {
        try {
            return familyDictionaryJpaMapper.fromJpaEntity(familyDictionaryJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<FamilyDictionary> findAll() {
        try {
            return familyDictionaryJpaMapper.fromJpaEntity(familyDictionaryJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<FamilyDictionary> findAll(Specification spec) {
        try {
            return familyDictionaryJpaMapper.fromJpaEntity(familyDictionaryJpaRepository.findAll(spec));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
