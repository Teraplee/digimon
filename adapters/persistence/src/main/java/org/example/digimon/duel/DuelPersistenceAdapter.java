package org.example.digimon.duel;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.duel.RemoveDuelPort;
import org.example.digimon.application.ports.out.duel.SaveDuelPort;
import org.example.digimon.application.ports.out.duel.SearchDuelPort;
import org.example.digimon.domain.duel.Duel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DuelPersistenceAdapter implements RemoveDuelPort, SaveDuelPort, SearchDuelPort {

    private final DuelJpaRepository duelJpaRepository;
    private final DuelJpaMapper duelJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            duelJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public Duel save(Duel duel) {
        try {
            return duelJpaMapper.fromJpaEntity(duelJpaRepository.save(duelJpaMapper.toJpaEntity(duel)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Duel findById(Long id) {
        try {
            return duelJpaMapper.fromJpaEntity(duelJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Duel> findAll() {
        try {
            return duelJpaMapper.fromJpaEntity(duelJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
