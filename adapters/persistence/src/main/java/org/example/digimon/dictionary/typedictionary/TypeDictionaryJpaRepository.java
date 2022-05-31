package org.example.digimon.dictionary.typedictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TypeDictionaryJpaRepository extends JpaRepository<TypeDictionaryJpaEntity, Long>, JpaSpecificationExecutor<TypeDictionaryJpaEntity> {
}