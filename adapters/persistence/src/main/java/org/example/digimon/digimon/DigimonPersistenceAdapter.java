package org.example.digimon.digimon;

import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DigimonPersistenceAdapter implements RemoveDigimonPort, SaveDigimonPort, SearchDigimonPort {

    private final DigimonJpaRepository digimonJpaRepository;
    private final DigimonJpaMapper digimonJpaMapper;

    public DigimonPersistenceAdapter(DigimonJpaRepository digimonJpaRepository, DigimonJpaMapper digimonJpaMapper) {
        this.digimonJpaRepository = digimonJpaRepository;
        this.digimonJpaMapper = digimonJpaMapper;
    }

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

        if (digimon == null) {
            return null;
        }

        DigimonJpaEntity digimonJpaEntity = digimonJpaMapper.toJpaEntity(digimon);
        digimonJpaRepository.save(digimonJpaEntity);
        return digimonJpaMapper.fromJpaEntity(digimonJpaEntity);

    }

    @Override
    public Digimon findById(Long id) {

        try {
            DigimonJpaEntity digimonJpaEntity = digimonJpaRepository.findById(id).get();
            return digimonJpaMapper.fromJpaEntity(digimonJpaEntity);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Digimon> findAll() {

        List<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll();
        List<Digimon> digimons = new ArrayList<>();
        digimonJpaEntities.forEach(digimonJpaEntity -> digimons.add(digimonJpaMapper.fromJpaEntity(digimonJpaEntity)));
        return digimons;

    }
}
