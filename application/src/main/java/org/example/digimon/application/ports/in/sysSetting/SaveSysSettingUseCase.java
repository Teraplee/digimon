package org.example.digimon.application.ports.in.sysSetting;

import org.example.digimon.domain.sysSetting.SysSetting;

public interface SaveSysSettingUseCase {

    SysSetting save(SysSetting sysSetting);

}
