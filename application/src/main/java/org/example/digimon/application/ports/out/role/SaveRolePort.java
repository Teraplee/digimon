package org.example.digimon.application.ports.out.role;

import org.example.digimon.domain.role.Role;

public interface SaveRolePort {

    Role save(Role role);

}
