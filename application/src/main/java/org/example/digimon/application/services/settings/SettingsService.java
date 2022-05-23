package org.example.digimon.application.services.settings;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.settings.RemoveSettingsUseCase;
import org.example.digimon.application.ports.in.settings.SaveSettingsUseCase;
import org.example.digimon.application.ports.in.settings.SearchSettingsUseCase;
import org.example.digimon.application.ports.out.settings.RemoveSettingsPort;
import org.example.digimon.application.ports.out.settings.SaveSettingsPort;
import org.example.digimon.application.ports.out.settings.SearchSettingsPort;
import org.example.digimon.domain.settings.Settings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SettingsService implements RemoveSettingsUseCase, SaveSettingsUseCase, SearchSettingsUseCase {

    private final RemoveSettingsPort removeSettingsPort;
    private final SaveSettingsPort saveSettingsPort;
    private final SearchSettingsPort searchSettingsPort;

    @Override
    public void remove(Long id) {
        removeSettingsPort.remove(id);
    }

    @Override
    public Settings save(Settings settings) {
        return saveSettingsPort.save(settings);
    }

    @Override
    public Settings findById(Long id) {
        return searchSettingsPort.findById(id);
    }

    @Override
    public List<Settings> findAll() {
        return searchSettingsPort.findAll();
    }
}
