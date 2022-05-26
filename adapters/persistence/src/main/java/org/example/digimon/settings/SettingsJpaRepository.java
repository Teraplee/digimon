package org.example.digimon.settings;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SettingsJpaRepository extends JpaRepository<SettingsJpaEntity, Long>, JpaSpecificationExecutor<SettingsJpaEntity> {
}
