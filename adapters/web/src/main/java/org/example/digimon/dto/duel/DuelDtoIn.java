package org.example.digimon.dto.duel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.player.PlayerDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DuelDtoIn implements Serializable {

    private Date date;
    private Set<PlayerDtoIn> players;

}
