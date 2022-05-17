package org.example.digimon.application.ports.in.duel;

import org.example.digimon.domain.duel.Duel;

public interface SaveDuelUseCase {

    Duel save(Duel duel);

}
