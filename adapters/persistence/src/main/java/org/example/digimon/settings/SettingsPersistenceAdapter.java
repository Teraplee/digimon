package org.example.digimon.settings;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.settings.RemoveSettingsPort;
import org.example.digimon.application.ports.out.settings.SaveSettingsPort;
import org.example.digimon.application.ports.out.settings.SearchSettingsPort;
import org.example.digimon.domain.settings.Settings;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class SettingsPersistenceAdapter implements RemoveSettingsPort, SaveSettingsPort, SearchSettingsPort {

    private final SettingsJpaRepository settingsJpaRepository;
    private final SettingsJpaMapper settingsJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            settingsJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public Settings save(Settings settings) {
        try {
            return settingsJpaMapper.fromJpaEntity(settingsJpaRepository.save(settingsJpaMapper.toJpaEntity(settings)));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Settings findById(Long id) {
        try {
            return settingsJpaMapper.fromJpaEntity(settingsJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Settings> findAll() {
        try {
            return settingsJpaMapper.fromJpaEntity(settingsJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
