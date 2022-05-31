package org.example.digimon.application.ports.out.dictionary.typedictionary;

import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;

public interface SaveTypeDictionaryPort {

    TypeDictionary save(TypeDictionary typeDictionary);

}
