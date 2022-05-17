package org.example.digimon.dto.player;

import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

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
    private final Set<DuelDtoOut> duels;

    public PlayerDtoOut(Long id, String email, String firstName, String middleName, String lastName, String phone,
                        String username, Date updatedAt, String updatedBy, Set<DigimonDtoOut> digimons,
                        Set<DuelDtoOut> duels) {
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
        this.duels = duels;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Set<DigimonDtoOut> getAllDigimons() {
        return digimons;
    }

    public Set<DuelDtoOut> getAllDuels() {
        return duels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerDtoOut entity = (PlayerDtoOut) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.middleName, entity.middleName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.updatedBy, entity.updatedBy) &&
                Objects.equals(this.digimons, entity.digimons) &&
                Objects.equals(this.duels, entity.duels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, middleName, lastName, phone, username, updatedAt, updatedBy,
                digimons, duels);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "email = " + email + ", " +
                "firstName = " + firstName + ", " +
                "middleName = " + middleName + ", " +
                "lastName = " + lastName + ", " +
                "phone = " + phone + ", " +
                "username = " + username + ", " +
                "updatedAt = " + updatedAt + ", " +
                "updatedBy = " + updatedBy + ", " +
                "digimons = " + digimons + ", " +
                "duels = " + duels + ")";
    }
}
