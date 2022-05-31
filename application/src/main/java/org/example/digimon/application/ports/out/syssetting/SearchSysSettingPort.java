package org.example.digimon.application.ports.out.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;

import java.util.List;

public interface SearchSysSettingPort {

    SysSetting findById(Long id);

    List<SysSetting> findAll();

}
