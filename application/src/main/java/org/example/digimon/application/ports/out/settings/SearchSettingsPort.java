package org.example.digimon.application.ports.out.settings;

import org.example.digimon.domain.settings.Settings;

import java.util.List;

public interface SearchSettingsPort {

    Settings findById(Long id);

    List<Settings> findAll();

}
