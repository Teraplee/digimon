package org.example.digimon.application.ports.out.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;

import java.util.List;

public interface SearchTypeDictionaryPort {

    TypeDictionary findById(Long id);

    List<TypeDictionary> findAll();

}
