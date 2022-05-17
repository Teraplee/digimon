package org.example.digimon.dto.classDictionary;

import org.example.digimon.dto.digimon.DigimonDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class ClassDictionaryDtoOut implements Serializable {
    private final Long id;
    private final String value;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<DigimonDtoOut> digimons;

    public ClassDictionaryDtoOut(Long id, String value, Date updatedAt, String updatedBy, Set<DigimonDtoOut> digimons) {
        this.id = id;
        this.value = value;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.digimons = digimons;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDictionaryDtoOut entity = (ClassDictionaryDtoOut) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.value, entity.value) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.updatedBy, entity.updatedBy) &&
                Objects.equals(this.digimons, entity.digimons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, updatedAt, updatedBy, digimons);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "value = " + value + ", " +
                "updatedAt = " + updatedAt + ", " +
                "updatedBy = " + updatedBy + ", " +
                "digimons = " + digimons + ")";
    }
}
