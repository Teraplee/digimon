package org.example.digimon.application.ports.out.sysSetting;

import org.example.digimon.domain.sysSetting.SysSetting;

public interface SaveSysSettingPort {

    SysSetting save(SysSetting sysSetting);

}
