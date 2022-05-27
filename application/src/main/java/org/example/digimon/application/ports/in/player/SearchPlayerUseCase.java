package org.example.digimon.application.ports.in.player;

import org.example.digimon.domain.player.Player;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface SearchPlayerUseCase {

    Player findById(Long id);

    List<Player> findAll();

    List<Player> findAll(Specification spec);

}
