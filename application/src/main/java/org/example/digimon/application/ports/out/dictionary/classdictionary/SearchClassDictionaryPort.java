package org.example.digimon.application.ports.out.dictionary.classdictionary;

import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchClassDictionaryPort {

    ClassDictionary findById(Long id);

    List<ClassDictionary> findAll();

    List<ClassDictionary> findAll(Specification spec);

}
