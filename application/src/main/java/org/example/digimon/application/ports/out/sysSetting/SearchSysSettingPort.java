package org.example.digimon.application.ports.out.sysSetting;

import org.example.digimon.domain.sysSetting.SysSetting;

import java.util.List;

public interface SearchSysSettingPort {

    SysSetting findById(Long id);

    List<SysSetting> findAll();

}
