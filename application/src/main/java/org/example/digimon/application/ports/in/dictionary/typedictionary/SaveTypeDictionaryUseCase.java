package org.example.digimon.application.ports.in.dictionary.typedictionary;

import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;

public interface SaveTypeDictionaryUseCase {

    TypeDictionary save(TypeDictionary typeDictionary);

}
