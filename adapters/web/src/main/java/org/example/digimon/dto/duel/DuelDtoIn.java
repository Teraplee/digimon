package org.example.digimon.dto.duel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.player.PlayerDtoIn;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DuelDtoIn implements Serializable {

    private Long id;
    @NotNull
    private Date date;
    @NotNull
    @Size(min = 2, max = 3, message = "players must be between 2 and 3")
    private Set<PlayerDtoIn> players;

}
