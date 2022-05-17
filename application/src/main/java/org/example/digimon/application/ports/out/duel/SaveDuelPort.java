package org.example.digimon.application.ports.out.duel;

import org.example.digimon.domain.duel.Duel;

public interface SaveDuelPort {

    Duel save(Duel duel);

}
