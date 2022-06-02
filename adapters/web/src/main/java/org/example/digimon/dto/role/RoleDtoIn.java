package org.example.digimon.dto.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.role.RoleEnum;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDtoIn implements Serializable {

    private Long id;
    @NotNull
    private RoleEnum roleEnum;

}
