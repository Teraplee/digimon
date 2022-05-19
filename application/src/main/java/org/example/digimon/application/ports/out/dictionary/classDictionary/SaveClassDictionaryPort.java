package org.example.digimon.application.ports.out.dictionary.classDictionary;

import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;

public interface SaveClassDictionaryPort {

    ClassDictionary save(ClassDictionary classDictionary);

}
