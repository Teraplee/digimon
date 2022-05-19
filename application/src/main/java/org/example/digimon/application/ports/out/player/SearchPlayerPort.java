package org.example.digimon.application.ports.out.player;

import org.example.digimon.domain.player.Player;

import java.util.List;

public interface SearchPlayerPort {

    Player findById(Long id);

    List<Player> findAll();

}