package org.example.digimon.digimon;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.exceptions.DigimonException;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @SneakyThrows
    @Override
    public Digimon findById(Long id) {
        return digimonJpaMapper.fromJpaEntity(digimonJpaRepository.findById(id).orElseThrow(() -> new DigimonException("Error in findById with id: " + id)));
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

    @Override
    public List<Digimon> findAll(Specification spec) {
        try {
            final List<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll(spec);

            return digimonJpaMapper.fromJpaEntity(digimonJpaEntities);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
