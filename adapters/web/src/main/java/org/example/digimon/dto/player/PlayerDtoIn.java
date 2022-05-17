package org.example.digimon.dto.player;

import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.duel.DuelDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

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
    private final Set<DuelDtoIn> duels;

    public PlayerDtoIn(Long id, String email, String firstName, String middleName, String lastName, String phone,
                       String username, String password, Date updatedAt, String updatedBy, Set<DigimonDtoIn> digimons,
                       Set<DuelDtoIn> duels) {
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

    public String getPassword() {
        return password;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Set<DigimonDtoIn> getAllDigimons() {
        return digimons;
    }

    public Set<DuelDtoIn> getAllDuels() {
        return duels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerDtoIn entity = (PlayerDtoIn) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.middleName, entity.middleName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.updatedBy, entity.updatedBy) &&
                Objects.equals(this.digimons, entity.digimons) &&
                Objects.equals(this.duels, entity.duels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, middleName, lastName, phone, username, password, updatedAt, updatedBy,
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
                "password = " + password + ", " +
                "updatedAt = " + updatedAt + ", " +
                "updatedBy = " + updatedBy + ", " +
                "digimons = " + digimons + ", " +
                "duels = " + duels + ")";
    }
}
