package org.example.digimon.dto.duel;

import org.example.digimon.dto.player.PlayerDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class DuelDtoIn implements Serializable {
    private final Long id;
    private final Date date;
    private final Set<PlayerDtoIn> players;

    public DuelDtoIn(Long id, Date date, Set<PlayerDtoIn> players) {
        this.id = id;
        this.date = date;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Set<PlayerDtoIn> getAllPlayers() {
        return players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuelDtoIn entity = (DuelDtoIn) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.date, entity.date) &&
                Objects.equals(this.players, entity.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, players);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "date = " + date + ", " +
                "players = " + players + ")";
    }
}
