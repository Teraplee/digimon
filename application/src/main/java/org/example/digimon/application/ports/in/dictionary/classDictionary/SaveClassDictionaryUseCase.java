package org.example.digimon.application.ports.in.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;

public interface SaveClassDictionaryUseCase {

    ClassDictionary save(ClassDictionary classDictionary);

}
