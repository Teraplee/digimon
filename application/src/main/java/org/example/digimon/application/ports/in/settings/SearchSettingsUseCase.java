package org.example.digimon.application.ports.in.settings;

import org.example.digimon.domain.settings.Settings;

import java.util.List;

public interface SearchSettingsUseCase {

    Settings findById(Long id);

    List<Settings> findAll();

}
