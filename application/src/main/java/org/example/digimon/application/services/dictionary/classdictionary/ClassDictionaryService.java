package org.example.digimon.application.services.dictionary.classdictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.classdictionary.RemoveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classdictionary.SaveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classdictionary.SearchClassDictionaryUseCase;
import org.example.digimon.application.ports.out.dictionary.classdictionary.RemoveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classdictionary.SaveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classdictionary.SearchClassDictionaryPort;
import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.springframework.data.jpa.domain.Specification;
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

    @Override
    public List<ClassDictionary> findAll(Specification spec) {
        return searchClassDictionaryPort.findAll(spec);
    }
}
