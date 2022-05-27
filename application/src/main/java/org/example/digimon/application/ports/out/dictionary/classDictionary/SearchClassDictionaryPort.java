package org.example.digimon.application.ports.out.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchClassDictionaryPort {

    ClassDictionary findById(Long id);

    List<ClassDictionary> findAll();

    List<ClassDictionary> findAll(Specification spec);

}
