package org.example.digimon.controllers.role;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.role.RemoveRoleUseCase;
import org.example.digimon.application.ports.in.role.SaveRoleUseCase;
import org.example.digimon.application.ports.in.role.SearchRoleUseCase;
import org.example.digimon.dto.role.RoleDtoIn;
import org.example.digimon.dto.role.RoleDtoOut;
import org.example.digimon.mappers.role.RoleDtoMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;
import static org.example.digimon.constants.role.RoleEndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_ROLE)
public class RoleController {

    private final RemoveRoleUseCase removeRoleUseCase;
    private final SaveRoleUseCase saveRoleUseCase;
    private final SearchRoleUseCase searchRoleUseCase;
    private final RoleDtoMapper roleDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public RoleDtoOut findById(@PathVariable("id") Long id) {
        return roleDtoMapper.toDtoOut(searchRoleUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<RoleDtoOut> findAll() {
        return roleDtoMapper.toDtoOut(searchRoleUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public RoleDtoOut save(@Valid @RequestBody RoleDtoIn dtoIn) {
        return roleDtoMapper.toDtoOut(saveRoleUseCase.save(roleDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeRoleUseCase.remove(id);
    }

}
