package org.example.digimon.dto.digimon;

import org.example.digimon.dto.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.dto.typeDictionary.TypeDictionaryDtoOut;
import org.example.digimon.dto.player.PlayerDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class DigimonDtoOut implements Serializable {
    private final Long id;
    private final String name;
    private final Double attack;
    private final Double defence;
    private final String level;
    private final String imageUrl;
    private final TypeDictionaryDtoOut typeDictionaryDtoOut;
    private final ClassDictionaryDtoOut classDictionaryDtoOut;
    private final GroupDictionaryDtoOut groupDictionaryDtoOut;
    private final String gender;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<PlayerDtoOut> players;
    private final Set<FamilyDictionaryDtoOut> families;

    public DigimonDtoOut(Long id, String name, Double attack, Double defence, String level, String imageUrl,
                         TypeDictionaryDtoOut typeDictionaryDtoOut, ClassDictionaryDtoOut classDictionaryDtoOut,
                         GroupDictionaryDtoOut groupDictionaryDtoOut, String gender, Date updatedAt, String updatedBy,
                         Set<PlayerDtoOut> players, Set<FamilyDictionaryDtoOut> families) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.level = level;
        this.imageUrl = imageUrl;
        this.typeDictionaryDtoOut = typeDictionaryDtoOut;
        this.classDictionaryDtoOut = classDictionaryDtoOut;
        this.groupDictionaryDtoOut = groupDictionaryDtoOut;
        this.gender = gender;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.players = players;
        this.families = families;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getAttack() {
        return attack;
    }

    public Double getDefence() {
        return defence;
    }

    public String getLevel() {
        return level;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public TypeDictionaryDtoOut getDictionaryTypeDto() {
        return typeDictionaryDtoOut;
    }

    public ClassDictionaryDtoOut getDictionaryClassDto() {
        return classDictionaryDtoOut;
    }

    public GroupDictionaryDtoOut getDictionaryGroupDto() {
        return groupDictionaryDtoOut;
    }

    public String getGender() {
        return gender;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Set<PlayerDtoOut> getPlayers() {
        return players;
    }

    public Set<FamilyDictionaryDtoOut> getFamilies() {
        return families;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigimonDtoOut entity = (DigimonDtoOut) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.attack, entity.attack) &&
                Objects.equals(this.defence, entity.defence) &&
                Objects.equals(this.level, entity.level) &&
                Objects.equals(this.imageUrl, entity.imageUrl) &&
                Objects.equals(this.typeDictionaryDtoOut, entity.typeDictionaryDtoOut) &&
                Objects.equals(this.classDictionaryDtoOut, entity.classDictionaryDtoOut) &&
                Objects.equals(this.groupDictionaryDtoOut, entity.groupDictionaryDtoOut) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.updatedBy, entity.updatedBy) &&
                Objects.equals(this.players, entity.players) &&
                Objects.equals(this.families, entity.families);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, attack, defence, level, imageUrl, typeDictionaryDtoOut, classDictionaryDtoOut,
                groupDictionaryDtoOut, gender, updatedAt, updatedBy, players, families);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "attack = " + attack + ", " +
                "defence = " + defence + ", " +
                "level = " + level + ", " +
                "imageUrl = " + imageUrl + ", " +
                "digimonType = " + typeDictionaryDtoOut + ", " +
                "digimonClass = " + classDictionaryDtoOut + ", " +
                "digimonGroup = " + groupDictionaryDtoOut + ", " +
                "gender = " + gender + ", " +
                "updatedAt = " + updatedAt + ", " +
                "updatedBy = " + updatedBy + ", " +
                "players = " + players + ", " +
                "families = " + families + ")";
    }
}
