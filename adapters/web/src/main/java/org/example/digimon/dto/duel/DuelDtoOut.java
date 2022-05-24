package org.example.digimon.dto.duel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DuelDtoOut implements Serializable {

    private Long id;
    private Date date;
    private Date updatedAt;
    private String updatedBy;
    private Set<PlayerDtoOut> players;

}
