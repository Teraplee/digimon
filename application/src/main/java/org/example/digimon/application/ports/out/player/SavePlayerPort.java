package org.example.digimon.application.ports.out.player;

import org.example.digimon.domain.player.Player;

public interface SavePlayerPort {

    Player save(Player player);

    //Player addDigimon(Long player_id, Long digimon_id);

}
