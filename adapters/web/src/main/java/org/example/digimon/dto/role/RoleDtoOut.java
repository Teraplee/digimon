package org.example.digimon.dto.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.role.RoleEnum;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDtoOut implements Serializable {

    private Long id;
    private String name;
    private RoleEnum roleEnum;
    private LocalDate updatedAt;
    private String updatedBy;

}
