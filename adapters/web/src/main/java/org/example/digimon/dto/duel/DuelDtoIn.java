package org.example.digimon.dto.duel;

import lombok.Data;
import org.example.digimon.dto.player.PlayerDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class DuelDtoIn implements Serializable {
    private final Long id;
    private final Date date;
    private final Set<PlayerDtoIn> players;

    public DuelDtoIn(Long id, Date date, Set<PlayerDtoIn> players) {
        this.id = id;
        this.date = date;
        this.players = players;
    }

}
