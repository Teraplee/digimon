package org.example.digimon.domain.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    private Long id;
    private String name;
    private RoleEnum roleEnum;
    private LocalDate updatedAt;
    private String updatedBy;

}
