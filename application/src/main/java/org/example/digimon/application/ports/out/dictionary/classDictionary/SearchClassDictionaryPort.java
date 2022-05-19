package org.example.digimon.application.ports.out.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;

import java.util.List;

public interface SearchClassDictionaryPort {

    ClassDictionary findById(Long id);

    List<ClassDictionary> findAll();

}
