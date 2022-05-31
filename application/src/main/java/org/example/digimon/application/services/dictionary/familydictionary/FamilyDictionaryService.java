package org.example.digimon.application.services.dictionary.familydictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.familydictionary.RemoveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familydictionary.SaveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familydictionary.SearchFamilyDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.familydictionary.RemoveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familydictionary.SaveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familydictionary.SearchFamilyDictionaryPort;
import org.example.digimon.domain.dictionary.familydictionary.FamilyDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FamilyDictionaryService implements RemoveFamilyDictionaryUseCase, SaveFamilyDictionaryUseCase, SearchFamilyDictionaryUseCase {

    private final RemoveFamilyDictionaryPort removeFamilyDictionaryPort;
    private final SaveFamilyDictionaryPort saveFamilyDictionaryPort;
    private final SearchFamilyDictionaryPort searchFamilyDictionaryPort;

    @Override
    public void remove(Long id) {
        removeFamilyDictionaryPort.remove(id);
    }

    @Override
    public FamilyDictionary save(FamilyDictionary familyDictionary) {
        return saveFamilyDictionaryPort.save(familyDictionary);
    }

    @Override
    public FamilyDictionary findById(Long id) {
        return searchFamilyDictionaryPort.findById(id);
    }

    @Override
    public List<FamilyDictionary> findAll() {
        return searchFamilyDictionaryPort.findAll();
    }

    @Override
    public List<FamilyDictionary> findAll(Specification spec) {
        return searchFamilyDictionaryPort.findAll(spec);
    }
}
