package org.example.digimon.dictionary.typeDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.RemoveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.SaveTypeDictionaryPort;
import org.example.digimon.application.ports.out.dictionary.typeDictionary.SearchTypeDictionaryPort;
import org.example.digimon.domain.dictionary.typeDictionary.TypeDictionary;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TypeDictionaryPersistenceAdapter implements RemoveTypeDictionaryPort, SaveTypeDictionaryPort, SearchTypeDictionaryPort {

    private final TypeDictionaryJpaRepository typeDictionaryJpaRepository;
    private final TypeDictionaryJpaMapper typeDictionaryJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            typeDictionaryJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public TypeDictionary save(TypeDictionary typeDictionary) {
        try {
            return typeDictionaryJpaMapper.fromJpaEntity(typeDictionaryJpaRepository.save(typeDictionaryJpaMapper.toJpaEntity(typeDictionary)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public TypeDictionary findById(Long id) {
        try {
            return typeDictionaryJpaMapper.fromJpaEntity(typeDictionaryJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<TypeDictionary> findAll() {
        try {
            return typeDictionaryJpaMapper.fromJpaEntity(typeDictionaryJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<TypeDictionary> findAll(Specification spec) {
        try {
            return typeDictionaryJpaMapper.fromJpaEntity(typeDictionaryJpaRepository.findAll(spec));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
