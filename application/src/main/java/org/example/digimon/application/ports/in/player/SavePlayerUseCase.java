package org.example.digimon.application.ports.in.player;

import org.example.digimon.domain.player.Player;

public interface SavePlayerUseCase {

    Player save(Player player);

    //Player addDigimon(Long player_id, Long digimon_id);

}
