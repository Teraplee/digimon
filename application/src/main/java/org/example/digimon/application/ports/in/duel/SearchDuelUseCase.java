package org.example.digimon.application.ports.in.duel;

import org.example.digimon.domain.duel.Duel;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchDuelUseCase {

    Duel findById(Long id);

    List<Duel> findAll();

    List<Duel> findAll(Specification spec);

}
