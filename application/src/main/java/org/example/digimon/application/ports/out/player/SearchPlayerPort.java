package org.example.digimon.application.ports.out.player;

import org.example.digimon.domain.player.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchPlayerPort {

    Player findById(Long id);

    Player findByUsername(String username);

    List<Player> findAll();

    List<Player> findAll(Specification spec);

    Page<Player> findAll(Specification spec, Pageable pageable);

}
