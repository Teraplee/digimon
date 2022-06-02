package org.example.digimon.application.ports.out.role;

import org.example.digimon.domain.role.Role;

import java.util.List;

public interface SearchRolePort {

    Role findById(Long id);

    List<Role> findAll();

}
