package org.example.digimon.application.ports.in.settings;

import org.example.digimon.domain.settings.Settings;

public interface SaveSettingsUseCase {

    Settings save(Settings settings);

}
