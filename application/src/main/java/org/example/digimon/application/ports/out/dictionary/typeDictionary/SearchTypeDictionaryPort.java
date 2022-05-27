package org.example.digimon.application.ports.out.dictionary.typeDictionary;

import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchTypeDictionaryPort {

    TypeDictionary findById(Long id);

    List<TypeDictionary> findAll();

    List<TypeDictionary> findAll(Specification spec);

}
