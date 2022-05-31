package org.example.digimon.application.ports.in.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;

import java.util.List;

public interface SearchSysSettingUseCase {

    SysSetting findById(Long id);

    List<SysSetting> findAll();

}
