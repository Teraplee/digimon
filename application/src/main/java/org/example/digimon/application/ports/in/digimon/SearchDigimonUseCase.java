package org.example.digimon.application.ports.in.digimon;

import org.example.digimon.domain.digimon.Digimon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchDigimonUseCase {

    Digimon findById(Long id);

    List<Digimon> findAll();

    List<Digimon> findAll(Specification spec);

    Page<Digimon> findAll(Specification spec, Pageable pageable);

}
