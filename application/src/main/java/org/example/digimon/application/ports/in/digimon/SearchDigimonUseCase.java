package org.example.digimon.application.ports.in.digimon;

import org.example.digimon.domain.digimon.Digimon;

import java.util.List;

public interface SearchDigimonUseCase {

    Digimon findById(Long id);

    List<Digimon> findAll();

}
