package org.example.digimon.sysSetting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysSettingJpaRepository extends JpaRepository<SysSettingJpaEntity, Long>, JpaSpecificationExecutor<SysSettingJpaEntity> {
}
