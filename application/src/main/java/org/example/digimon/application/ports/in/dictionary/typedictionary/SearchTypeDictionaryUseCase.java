package org.example.digimon.application.ports.in.dictionary.typedictionary;

import org.example.digimon.domain.dictionary.typedictionary.TypeDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchTypeDictionaryUseCase {

    TypeDictionary findById(Long id);

    List<TypeDictionary> findAll();

    List<TypeDictionary> findAll(Specification spec);

}
