package org.example.digimon.role;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.role.RemoveRolePort;
import org.example.digimon.application.ports.out.role.SaveRolePort;
import org.example.digimon.application.ports.out.role.SearchRolePort;
import org.example.digimon.domain.role.Role;
import org.example.digimon.exceptions.AppException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolePersistenceAdapter implements RemoveRolePort, SaveRolePort, SearchRolePort {

    private final RoleJpaRepository roleJpaRepository;
    private final RoleJpaMapper roleJpaMapper;


    @Override
    public void remove(Long id) {
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        roleJpaRepository.deleteById(id);
    }

    @Override
    public Role save(Role role) {
        if (role == null) {
            throw new AppException("role cannot be null");
        }
        final RoleJpaEntity roleJpaEntity = roleJpaRepository.save(roleJpaMapper.toJpaEntity(role));

        return roleJpaMapper.fromJpaEntity(roleJpaEntity);
    }

    @Override
    public Role findById(Long id) {
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        return roleJpaMapper.fromJpaEntity(roleJpaRepository.findById(id).orElseThrow(() ->
                new AppException("Role with id: " + id + " not found")));
    }

    @Override
    public List<Role> findAll() {
        final List<RoleJpaEntity> roleJpaEntities = roleJpaRepository.findAll();

        return roleJpaMapper.fromJpaEntity(roleJpaEntities);
    }
}
