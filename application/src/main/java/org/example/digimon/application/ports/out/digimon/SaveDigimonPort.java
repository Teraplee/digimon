package org.example.digimon.application.ports.out.digimon;

import org.example.digimon.domain.digimon.Digimon;

public interface SaveDigimonPort {

    Digimon save(Digimon digimon);

}
