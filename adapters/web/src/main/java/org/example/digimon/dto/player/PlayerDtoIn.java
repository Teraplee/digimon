package org.example.digimon.dto.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.role.RoleDtoIn;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String email;
    @NotNull
    private String firstName;
    @NotNull
    private String middleName;
    @NotNull
    private String lastName;
    @NotNull
    private String phone;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    @Size(min = 1, max = 5, message = "digimons must be between 1 and 5")
    private Set<DigimonDtoIn> digimons;
    @NotNull
    private Set<RoleDtoIn> roles;

}
