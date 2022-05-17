package org.example.digimon.dto.digimon;

import org.example.digimon.dto.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.typeDictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.player.PlayerDtoIn;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class DigimonDtoIn implements Serializable {
    private final Long id;
    private final String name;
    private final Double attack;
    private final Double defence;
    private final String level;
    private final String imageUrl;
    private final TypeDictionaryDtoIn typeDictionaryDtoIn;
    private final ClassDictionaryDtoIn classDictionaryDtoIn;
    private final GroupDictionaryDtoIn groupDictionaryDtoIn;
    private final String gender;
    private final Date updatedAt;
    private final String updatedBy;
    private final Set<PlayerDtoIn> players;
    private final Set<FamilyDictionaryDtoIn> families;

    public DigimonDtoIn(Long id, String name, Double attack, Double defence, String level, String imageUrl,
                        TypeDictionaryDtoIn typeDictionaryDtoIn, ClassDictionaryDtoIn classDictionaryDtoIn,
                        GroupDictionaryDtoIn groupDictionaryDtoIn, String gender, Date updatedAt, String updatedBy,
                        Set<PlayerDtoIn> players, Set<FamilyDictionaryDtoIn> families) {
        this.id = id;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.level = level;
        this.imageUrl = imageUrl;
        this.typeDictionaryDtoIn = typeDictionaryDtoIn;
        this.classDictionaryDtoIn = classDictionaryDtoIn;
        this.groupDictionaryDtoIn = groupDictionaryDtoIn;
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

    public TypeDictionaryDtoIn getDictionaryTypeDto() {
        return typeDictionaryDtoIn;
    }

    public ClassDictionaryDtoIn getDictionaryClassDto() {
        return classDictionaryDtoIn;
    }

    public GroupDictionaryDtoIn getDictionaryGroupDto() {
        return groupDictionaryDtoIn;
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

    public Set<PlayerDtoIn> getPlayers() {
        return players;
    }

    public Set<FamilyDictionaryDtoIn> getFamilies() {
        return families;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigimonDtoIn entity = (DigimonDtoIn) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.attack, entity.attack) &&
                Objects.equals(this.defence, entity.defence) &&
                Objects.equals(this.level, entity.level) &&
                Objects.equals(this.imageUrl, entity.imageUrl) &&
                Objects.equals(this.typeDictionaryDtoIn, entity.typeDictionaryDtoIn) &&
                Objects.equals(this.classDictionaryDtoIn, entity.classDictionaryDtoIn) &&
                Objects.equals(this.groupDictionaryDtoIn, entity.groupDictionaryDtoIn) &&
                Objects.equals(this.gender, entity.gender) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.updatedBy, entity.updatedBy) &&
                Objects.equals(this.players, entity.players) &&
                Objects.equals(this.families, entity.families);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, attack, defence, level, imageUrl, typeDictionaryDtoIn, classDictionaryDtoIn,
                groupDictionaryDtoIn, gender, updatedAt, updatedBy, players, families);
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
                "digimonType = " + typeDictionaryDtoIn + ", " +
                "digimonClass = " + classDictionaryDtoIn + ", " +
                "digimonGroup = " + groupDictionaryDtoIn + ", " +
                "gender = " + gender + ", " +
                "updatedAt = " + updatedAt + ", " +
                "updatedBy = " + updatedBy + ", " +
                "players = " + players + ", " +
                "families = " + families + ")";
    }
}
