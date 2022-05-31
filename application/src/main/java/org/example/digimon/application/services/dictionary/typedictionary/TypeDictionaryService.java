package org.example.digimon.application.services.dictionary.typedictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.typedictionary.RemoveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typedictionary.SaveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typedictionary.SearchTypeDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.typedictionary.RemoveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typedictionary.SaveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typedictionary.SearchTypeDictionaryPort;
import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeDictionaryService implements RemoveTypeDictionaryUseCase, SaveTypeDictionaryUseCase, SearchTypeDictionaryUseCase {

    private final RemoveTypeDictionaryPort removeTypeDictionaryPort;
    private final SaveTypeDictionaryPort saveTypeDictionaryPort;
    private final SearchTypeDictionaryPort searchTypeDictionaryPort;

    @Override
    public void remove(Long id) {
        removeTypeDictionaryPort.remove(id);
    }

    @Override
    public TypeDictionary save(TypeDictionary typeDictionary) {
        return saveTypeDictionaryPort.save(typeDictionary);
    }

    @Override
    public TypeDictionary findById(Long id) {
        return searchTypeDictionaryPort.findById(id);
    }

    @Override
    public List<TypeDictionary> findAll() {
        return searchTypeDictionaryPort.findAll();
    }

    @Override
    public List<TypeDictionary> findAll(Specification spec) {
        return searchTypeDictionaryPort.findAll(spec);
    }
}
