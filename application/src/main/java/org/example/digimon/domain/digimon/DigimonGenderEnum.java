package org.example.digimon.domain.digimon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public enum DigimonGenderEnum {

    MALE("m"),
    FEMALE("f");

    private final String value;

    public static DigimonGenderEnum findByValue(@NonNull String value) {
        for (DigimonGenderEnum gender : values()) {
            if (gender.name().equals(value)) {
                return gender;
            }
        }
        return null;
    }

}
