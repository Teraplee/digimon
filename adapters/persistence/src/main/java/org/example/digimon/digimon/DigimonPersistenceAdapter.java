package org.example.digimon.digimon;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DigimonPersistenceAdapter implements RemoveDigimonPort, SaveDigimonPort, SearchDigimonPort {

    private final DigimonJpaRepository digimonJpaRepository;
    private final DigimonJpaMapper digimonJpaMapper;

    @Override
    public void remove(Long id) {

        Optional<DigimonJpaEntity> optionalDigimonJpaEntity = digimonJpaRepository.findById(id);
        DigimonJpaEntity digimonJpaEntity = optionalDigimonJpaEntity.orElse(null);
        digimonJpaRepository.deleteById(id);

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

        DigimonJpaEntity digimonJpaEntity = null;

        try {
            digimonJpaEntity = digimonJpaRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        return digimonJpaMapper.fromJpaEntity(digimonJpaEntity);

    }

    @Override
    public List<Digimon> findAll() {

        List<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll();
        List<Digimon> digimons = new ArrayList<>();
        digimonJpaEntities.forEach(digimonJpaEntity -> digimons.add(digimonJpaMapper.fromJpaEntity(digimonJpaEntity)));
        return digimons;

    }
}
