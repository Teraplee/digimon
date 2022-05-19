package org.example.digimon.application.ports.in.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;

import java.util.List;

public interface SearchTypeDictionaryUseCase {

    TypeDictionary findById(Long id);

    List<TypeDictionary> findAll();

}
