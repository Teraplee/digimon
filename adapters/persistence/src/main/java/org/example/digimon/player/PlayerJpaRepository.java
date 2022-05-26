package org.example.digimon.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlayerJpaRepository extends JpaRepository<PlayerJpaEntity, Long>, JpaSpecificationExecutor<PlayerJpaEntity> {
}