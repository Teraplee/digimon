package org.example.digimon.application.ports.in.duel;

import org.example.digimon.domain.duel.Duel;

import java.util.List;

public interface SearchDuelUseCase {

    Duel findById(Long id);

    List<Duel> findAll();

}
