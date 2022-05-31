package org.example.digimon.dictionary.classdictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassDictionaryJpaRepository extends JpaRepository<ClassDictionaryJpaEntity, Long>, JpaSpecificationExecutor<ClassDictionaryJpaEntity> {
}