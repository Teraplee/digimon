package org.example.digimon.application.ports.out.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;

public interface SaveTypeDictionaryPort {

    TypeDictionary save(TypeDictionary typeDictionary);

}
