package org.example.digimon.application.ports.in.dictionary.classdictionary;

import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;

public interface SaveClassDictionaryUseCase {

    ClassDictionary save(ClassDictionary classDictionary);

}
