package org.example.digimon.digimon;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.digimon.application.ports.out.digimon.RemoveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SaveDigimonPort;
import org.example.digimon.application.ports.out.digimon.SearchDigimonPort;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.exceptions.AppException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        digimonJpaRepository.deleteById(id);
    }

    @Override
    public Digimon save(Digimon digimon) {
        if (digimon == null) {
            throw new AppException("digimon cannot be null");
        }
        final DigimonJpaEntity digimonJpaEntity = digimonJpaRepository.save(digimonJpaMapper.toJpaEntity(digimon));

        return digimonJpaMapper.fromJpaEntity(digimonJpaEntity);
    }

    @SneakyThrows
    @Override
    public Digimon findById(Long id) {
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        return digimonJpaMapper.fromJpaEntity(digimonJpaRepository.findById(id).orElseThrow(() -> new AppException("Digimon not found exception. " +
                "Digimon with id: " + id + " not found")));
    }

    @Override
    public List<Digimon> findAll() {
         final List<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll();

         return digimonJpaMapper.fromJpaEntity(digimonJpaEntities);
    }

    @Override
    public List<Digimon> findAll(Specification spec) {
        final List<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll(spec);

        return digimonJpaMapper.fromJpaEntity(digimonJpaEntities);
    }

    @Override
    public Page<Digimon> findAll(Specification spec, Pageable pageable) {
        final Page<DigimonJpaEntity> digimonJpaEntities = digimonJpaRepository.findAll(spec, pageable);

        return digimonJpaMapper.fromJpaEntity(digimonJpaEntities);
    }

}
