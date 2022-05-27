package org.example.digimon.application.ports.out.duel;

import org.example.digimon.domain.duel.Duel;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchDuelPort {

    Duel findById(Long id);

    List<Duel> findAll();

    List<Duel> findAll(Specification spec);

}
