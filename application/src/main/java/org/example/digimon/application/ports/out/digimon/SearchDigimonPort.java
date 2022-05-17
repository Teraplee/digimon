package org.example.digimon.application.ports.out.digimon;

import org.example.digimon.domain.digimon.Digimon;

import java.util.List;

public interface SearchDigimonPort {

    Digimon findById(Long id);

    List<Digimon> findAll();

}
