package org.example.digimon.syssetting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysSettingJpaRepository extends JpaRepository<SysSettingJpaEntity, Long>, JpaSpecificationExecutor<SysSettingJpaEntity> {
}
