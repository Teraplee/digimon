package org.example.digimon.domain.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public enum RoleEnum {

    ROLE_USER(1L, "ROLE_USER");

    private final Long id;
    private final String value;

    public static RoleEnum findByValue(@NonNull String value) {
        for (RoleEnum role : values()) {
            if (role.name().equals(value)) {
                return role;
            }
        }
        return null;
    }

    public static RoleEnum findById(@NonNull Long id) {
        for (RoleEnum role : values()) {
            if (role.getId().equals(id)) {
                return role;
            }
        }
        return null;
    }

}
