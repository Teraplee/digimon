package org.example.digimon.dto.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.example.digimon.dto.role.RoleDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDtoOut implements Serializable {

    private Long id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String username;
    private String password;
    private Date updatedAt;
    private String updatedBy;
    private Set<DigimonDtoOut> digimons;
    private Set<RoleDtoOut> roles;

}
