package org.example.digimon.application.ports.in.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;

import java.util.List;

public interface SearchClassDictionaryUseCase {

    ClassDictionary findById(Long id);

    List<ClassDictionary> findAll();

}
