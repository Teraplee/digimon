package org.example.digimon.controllers.sysSetting;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.sysSetting.RemoveSysSettingUseCase;
import org.example.digimon.application.ports.in.sysSetting.SaveSysSettingUseCase;
import org.example.digimon.application.ports.in.sysSetting.SearchSysSettingUseCase;
import org.example.digimon.dto.sysSetting.SysSettingDtoIn;
import org.example.digimon.dto.sysSetting.SysSettingDtoOut;
import org.example.digimon.mappers.sysSetting.SysSettingDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.API_REMOVE_BY_ID;
import static org.example.digimon.constants.sysSetting.SysSettingEndPointConstants.API_SYS_SETTING;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_SYS_SETTING)
public class SysSettingController {

    private final RemoveSysSettingUseCase removeSysSettingUseCase;
    private final SaveSysSettingUseCase saveSysSettingUseCase;
    private final SearchSysSettingUseCase searchSysSettingUseCase;
    private final SysSettingDtoMapper sysSettingDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public SysSettingDtoOut findById(@PathVariable("id") Long id) {
        return sysSettingDtoMapper.toDtoOut(searchSysSettingUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<SysSettingDtoOut> findAll() {
        return sysSettingDtoMapper.toDtoOut(searchSysSettingUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public SysSettingDtoOut save(@RequestBody SysSettingDtoIn dtoIn) {
        return sysSettingDtoMapper.toDtoOut(saveSysSettingUseCase.save(sysSettingDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeSysSettingUseCase.remove(id);
    }

}
