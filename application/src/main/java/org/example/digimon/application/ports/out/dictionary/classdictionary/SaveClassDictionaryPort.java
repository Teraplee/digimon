package org.example.digimon.application.ports.out.dictionary.classdictionary;

import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;

public interface SaveClassDictionaryPort {

    ClassDictionary save(ClassDictionary classDictionary);

}
