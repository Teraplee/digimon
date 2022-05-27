package org.example.digimon.application.services.dictionary.typeDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.RemoveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SaveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SearchTypeDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.RemoveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.SaveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.SearchTypeDictionaryPort;
import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
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
