package org.example.digimon.dto.player;

import lombok.Data;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
public class PlayerDtoOut implements Serializable {
    private final Long id;
    private final String email;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String phone;
    private final String username;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<DigimonDtoOut> digimons;

    public PlayerDtoOut(Long id, String email, String firstName, String middleName, String lastName, String phone,
                        String username, Date updatedAt, String updatedBy, Set<DigimonDtoOut> digimons) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.username = username;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.digimons = digimons;
    }

}
