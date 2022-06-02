package org.example.digimon.application.services.role;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.role.RemoveRoleUseCase;
import org.example.digimon.application.ports.in.role.SaveRoleUseCase;
import org.example.digimon.application.ports.in.role.SearchRoleUseCase;
import org.example.digimon.application.ports.out.role.RemoveRolePort;
import org.example.digimon.application.ports.out.role.SaveRolePort;
import org.example.digimon.application.ports.out.role.SearchRolePort;
import org.example.digimon.domain.role.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService implements RemoveRoleUseCase, SaveRoleUseCase, SearchRoleUseCase {

    private final RemoveRolePort removeRolePort;
    private final SaveRolePort saveRolePort;
    private final SearchRolePort searchRolePort;


    @Override
    public void remove(@NonNull final Long id) {
        removeRolePort.remove(id);
    }

    @Override
    public Role save(@NonNull final Role role) {
        return saveRolePort.save(role);
    }

    @Override
    public Role findById(@NonNull final Long id) {
        return searchRolePort.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return searchRolePort.findAll();
    }
}
