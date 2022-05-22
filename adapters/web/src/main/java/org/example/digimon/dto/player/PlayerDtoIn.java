package org.example.digimon.dto.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.duel.DuelDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDtoIn implements Serializable {

    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String username;
    private String password;
    private Set<DigimonDtoIn> digimons;

}
