package org.example.digimon.application.ports.in.role;

import org.example.digimon.domain.role.Role;

public interface SaveRoleUseCase {

    Role save(Role role);

}
