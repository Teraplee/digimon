package org.example.digimon.application.services.duel;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.duel.RemoveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SaveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SearchDuelUseCase;
import org.example.digimon.application.ports.out.duel.RemoveDuelPort;
import org.example.digimon.application.ports.out.duel.SaveDuelPort;
import org.example.digimon.application.ports.out.duel.SearchDuelPort;
import org.example.digimon.domain.duel.Duel;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DuelService implements RemoveDuelUseCase, SaveDuelUseCase, SearchDuelUseCase {

    private final RemoveDuelPort removeDuelPort;
    private final SaveDuelPort saveDuelPort;
    private final SearchDuelPort searchDuelPort;

    @Override
    public void remove(@NonNull final Long id) {
        removeDuelPort.remove(id);
    }

    @Override
    public Duel save(@NonNull final Duel duel) {
        return saveDuelPort.save(duel);
    }

    @Override
    public Duel findById(@NonNull final Long id) {
        return searchDuelPort.findById(id);
    }

    @Override
    public List<Duel> findAll() {
        return searchDuelPort.findAll();
    }

    @Override
    public List<Duel> findAll(Specification spec) {
        return searchDuelPort.findAll(spec);
    }
}
