package org.example.digimon.digimon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DigimonJpaRepository extends JpaRepository<DigimonJpaEntity, Long>, JpaSpecificationExecutor<DigimonJpaEntity> {
}
