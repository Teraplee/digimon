package org.example.digimon.application.ports.in.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchClassDictionaryUseCase {

    ClassDictionary findById(Long id);

    List<ClassDictionary> findAll();

    List<ClassDictionary> findAll(Specification spec);

}
