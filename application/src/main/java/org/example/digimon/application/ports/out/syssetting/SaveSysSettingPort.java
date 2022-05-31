package org.example.digimon.application.ports.out.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;

public interface SaveSysSettingPort {

    SysSetting save(SysSetting sysSetting);

}
