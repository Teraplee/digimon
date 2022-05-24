package org.example.digimon.application.ports.in.sysSetting;

import org.example.digimon.domain.sysSetting.SysSetting;

import java.util.List;

public interface SearchSysSettingUseCase {

    SysSetting findById(Long id);

    List<SysSetting> findAll();

}
