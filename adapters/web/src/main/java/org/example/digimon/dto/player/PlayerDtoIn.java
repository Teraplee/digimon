package org.example.digimon.dto.player;

import lombok.Data;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.duel.DuelDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class PlayerDtoIn implements Serializable {
    private final Long id;
    private final String email;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String phone;
    private final String username;
    private final String password;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<DigimonDtoIn> digimons;

    public PlayerDtoIn(Long id, String email, String firstName, String middleName, String lastName, String phone,
                       String username, String password, Date updatedAt, String updatedBy, Set<DigimonDtoIn> digimons) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.digimons = digimons;
    }


}
