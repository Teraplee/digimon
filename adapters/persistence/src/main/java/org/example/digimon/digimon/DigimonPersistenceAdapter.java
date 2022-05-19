package org.example.digimon.digimon;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DigimonPersistenceAdapter implements RemoveDigimonPort, SaveDigimonPort, SearchDigimonPort {

    private final DigimonJpaRepository digimonJpaRepository;
    private final DigimonJpaMapper digimonJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            digimonJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public Digimon save(Digimon digimon) {
        try {
            return digimonJpaMapper.fromJpaEntity(digimonJpaRepository.save(digimonJpaMapper.toJpaEntity(digimon)));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Digimon findById(Long id) {
        try {
            return digimonJpaMapper.fromJpaEntity(digimonJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Digimon> findAll() {
        try {
            return digimonJpaMapper.fromJpaEntity(digimonJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
