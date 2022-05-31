package org.example.digimon.application.services.syssetting;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.syssetting.RemoveSysSettingUseCase;
import org.example.digimon.application.ports.in.syssetting.SaveSysSettingUseCase;
import org.example.digimon.application.ports.in.syssetting.SearchSysSettingUseCase;
import org.example.digimon.application.ports.out.syssetting.RemoveSysSettingPort;
import org.example.digimon.application.ports.out.syssetting.SaveSysSettingPort;
import org.example.digimon.application.ports.out.syssetting.SearchSysSettingPort;
import org.example.digimon.domain.syssetting.SysSetting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SysSettingService implements RemoveSysSettingUseCase, SaveSysSettingUseCase, SearchSysSettingUseCase {

    private final RemoveSysSettingPort removeSysSettingPort;
    private final SaveSysSettingPort saveSysSettingPort;
    private final SearchSysSettingPort searchSysSettingPort;

    @Override
    public void remove(Long id) {
        removeSysSettingPort.remove(id);
    }

    @Override
    public SysSetting save(SysSetting sysSetting) {
        return saveSysSettingPort.save(sysSetting);
    }

    @Override
    public SysSetting findById(Long id) {
        return searchSysSettingPort.findById(id);
    }

    @Override
    public List<SysSetting> findAll() {
        return searchSysSettingPort.findAll();
    }
}
