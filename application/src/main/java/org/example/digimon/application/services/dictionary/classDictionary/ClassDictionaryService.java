package org.example.digimon.application.services.dictionary.classDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.classDictionary.RemoveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SaveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SearchClassDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.classDictionary.RemoveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classDictionary.SaveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classDictionary.SearchClassDictionaryPort;
import org.example.digimon.domain.dictionary.classDictionary.ClassDictionary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassDictionaryService implements RemoveClassDictionaryUseCase, SaveClassDictionaryUseCase, SearchClassDictionaryUseCase {

    private final RemoveClassDictionaryPort removeClassDictionaryPort;
    private final SaveClassDictionaryPort saveClassDictionaryPort;
    private final SearchClassDictionaryPort searchClassDictionaryPort;

    @Override
    public void remove(Long id) {
        removeClassDictionaryPort.remove(id);
    }

    @Override
    public ClassDictionary save(ClassDictionary classDictionary) {
        return saveClassDictionaryPort.save(classDictionary);
    }

    @Override
    public ClassDictionary findById(Long id) {
        return searchClassDictionaryPort.findById(id);
    }

    @Override
    public List<ClassDictionary> findAll() {
        return searchClassDictionaryPort.findAll();
    }
}
