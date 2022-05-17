package org.example.digimon.domain.duel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.example.digimon.domain.player.Player;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Duel {

    private Long id;
    private Date date;
    private Set<Player> players;

}
