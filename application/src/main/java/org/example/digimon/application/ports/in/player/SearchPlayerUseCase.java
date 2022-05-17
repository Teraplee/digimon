package org.example.digimon.application.ports.in.player;

import org.example.digimon.domain.player.Player;

import java.util.List;

public interface SearchPlayerUseCase {

    Player findById(Long id);

    List<Player> findAll();

}
