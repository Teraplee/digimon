package org.example.digimon.domain.digimon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public enum DigimonGenderEnum {

    MALE(1L, "MALE"),
    FEMALE(2L, "FEMALE");

    private final Long id;
    private final String value;

    public static DigimonGenderEnum findByValue(@NonNull String value) {
        for (DigimonGenderEnum gender : values()) {
            if (gender.name().equals(value)) {
                return gender;
            }
        }
        return null;
    }

    public static DigimonGenderEnum findById(@NonNull Long id) {
        for (DigimonGenderEnum gender : values()) {
            if (gender.getId().equals(id)) {
                return gender;
            }
        }
        return null;
    }

}
