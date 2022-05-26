package org.example.digimon.controllers.settings;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.settings.RemoveSettingsUseCase;
import org.example.digimon.application.ports.in.settings.SaveSettingsUseCase;
import org.example.digimon.application.ports.in.settings.SearchSettingsUseCase;
import org.example.digimon.dto.settings.SettingsDtoIn;
import org.example.digimon.dto.settings.SettingsDtoOut;
import org.example.digimon.mappers.settings.SettingsDtoMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;
import static org.example.digimon.constants.settings.SettingsEndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_SETTINGS)
public class SettingsController {

    private final RemoveSettingsUseCase removeSettingsUseCase;
    private final SaveSettingsUseCase saveSettingsUseCase;
    private final SearchSettingsUseCase searchSettingsUseCase;
    private final SettingsDtoMapper settingsDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public SettingsDtoOut findById(@PathVariable("id") Long id) {
        return settingsDtoMapper.toDtoOut(searchSettingsUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<SettingsDtoOut> findAll() {
        return settingsDtoMapper.toDtoOut(searchSettingsUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public SettingsDtoOut save(@Valid @RequestBody SettingsDtoIn dtoIn) {
        return settingsDtoMapper.toDtoOut(saveSettingsUseCase.save(settingsDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeSettingsUseCase.remove(id);
    }

}
