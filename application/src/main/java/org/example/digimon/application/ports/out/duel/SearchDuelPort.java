package org.example.digimon.application.ports.out.duel;

import org.example.digimon.domain.duel.Duel;

import java.util.List;

public interface SearchDuelPort {

    Duel findById(Long id);

    List<Duel> findAll();

}
