package org.example.digimon.sysSetting;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.sysSetting.RemoveSysSettingPort;
import org.example.digimon.application.ports.out.sysSetting.SaveSysSettingPort;
import org.example.digimon.application.ports.out.sysSetting.SearchSysSettingPort;
import org.example.digimon.domain.sysSetting.SysSetting;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class SysSettingPersistenceAdapter implements RemoveSysSettingPort, SaveSysSettingPort, SearchSysSettingPort {

    private final SysSettingJpaRepository sysSettingJpaRepository;
    private final SysSettingJpaMapper sysSettingJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            sysSettingJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public SysSetting save(SysSetting sysSetting) {
        try {
            return sysSettingJpaMapper.fromJpaEntity(sysSettingJpaRepository.save(sysSettingJpaMapper.toJpaEntity(sysSetting)));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public SysSetting findById(Long id) {
        try {
            return sysSettingJpaMapper.fromJpaEntity(sysSettingJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<SysSetting> findAll() {
        try {
            return sysSettingJpaMapper.fromJpaEntity(sysSettingJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
