package org.example.digimon.dto.duel;

import lombok.Data;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class DuelDtoOut implements Serializable {
    private final Long id;
    private final Date date;
    private final Set<PlayerDtoOut> players;

    public DuelDtoOut(Long id, Date date, Set<PlayerDtoOut> players) {
        this.id = id;
        this.date = date;
        this.players = players;
    }
}
