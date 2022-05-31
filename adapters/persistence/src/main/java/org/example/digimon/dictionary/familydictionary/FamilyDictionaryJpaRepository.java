package org.example.digimon.dictionary.familydictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyDictionaryJpaRepository extends JpaRepository<FamilyDictionaryJpaEntity, Long>, JpaSpecificationExecutor<FamilyDictionaryJpaEntity> {
}