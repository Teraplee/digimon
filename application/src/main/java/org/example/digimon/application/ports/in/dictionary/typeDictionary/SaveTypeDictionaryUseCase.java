package org.example.digimon.application.ports.in.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;

public interface SaveTypeDictionaryUseCase {

    TypeDictionary save(TypeDictionary typeDictionary);

}
