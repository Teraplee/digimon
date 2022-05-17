package org.example.digimon.application.ports.in.digimon;

import org.example.digimon.domain.digimon.Digimon;

public interface SaveDigimonUseCase {

    Digimon save(Digimon digimon);

}
