package org.example.digimon.dictionary.classdictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.dictionary.classdictionary.RemoveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classdictionary.SaveClassDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.classdictionary.SearchClassDictionaryPort;
import org.example.digimon.domain.dictionary.classdictionary.ClassDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ClassDictionaryPersistenceAdapter implements RemoveClassDictionaryPort, SaveClassDictionaryPort, SearchClassDictionaryPort {

    private final ClassDictionaryJpaRepository classDictionaryJpaRepository;
    private final ClassDictionaryJpaMapper classDictionaryJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            classDictionaryJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public ClassDictionary save(ClassDictionary classDictionary) {
        try {
            return classDictionaryJpaMapper.fromJpaEntity(classDictionaryJpaRepository.save(classDictionaryJpaMapper.toJpaEntity(classDictionary)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public ClassDictionary findById(Long id) {
        try {
            return classDictionaryJpaMapper.fromJpaEntity(classDictionaryJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<ClassDictionary> findAll() {
        try {
            return classDictionaryJpaMapper.fromJpaEntity(classDictionaryJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<ClassDictionary> findAll(Specification spec) {
        try {
            return classDictionaryJpaMapper.fromJpaEntity(classDictionaryJpaRepository.findAll(spec));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
