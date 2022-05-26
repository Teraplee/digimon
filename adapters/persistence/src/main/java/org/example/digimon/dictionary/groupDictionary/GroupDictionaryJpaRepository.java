package org.example.digimon.dictionary.groupDictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GroupDictionaryJpaRepository extends JpaRepository<GroupDictionaryJpaEntity, Long>, JpaSpecificationExecutor<GroupDictionaryJpaEntity> {
}