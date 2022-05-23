package org.example.digimon.application.ports.out.settings;

import org.example.digimon.domain.settings.Settings;

public interface SaveSettingsPort {

    Settings save(Settings settings);

}
