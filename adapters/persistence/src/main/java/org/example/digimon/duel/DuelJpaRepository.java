package org.example.digimon.duel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DuelJpaRepository extends JpaRepository<DuelJpaEntity, Long>, JpaSpecificationExecutor<DuelJpaEntity> {
}