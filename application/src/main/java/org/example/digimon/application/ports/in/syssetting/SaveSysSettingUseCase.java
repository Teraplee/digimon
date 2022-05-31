package org.example.digimon.application.ports.in.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;

public interface SaveSysSettingUseCase {

    SysSetting save(SysSetting sysSetting);

}
