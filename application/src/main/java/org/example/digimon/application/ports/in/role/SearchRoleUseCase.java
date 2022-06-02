package org.example.digimon.application.ports.in.role;

import org.example.digimon.domain.role.Role;

import java.util.List;

public interface SearchRoleUseCase {

    Role findById(Long id);

    List<Role> findAll();

}
