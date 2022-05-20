package org.example.digimon.application.services.dictionary.familyDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.RemoveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SaveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SearchFamilyDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.familyDictionary.RemoveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familyDictionary.SaveFamilyDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.familyDictionary.SearchFamilyDictionaryPort;
import org.example.digimon.domain.dictionary.familyDictionary.FamilyDictionary;
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
}
