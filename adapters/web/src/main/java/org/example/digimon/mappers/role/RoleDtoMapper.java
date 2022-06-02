package org.example.digimon.mappers.role;

import org.example.digimon.domain.role.Role;
import org.example.digimon.dto.role.RoleDtoIn;
import org.example.digimon.dto.role.RoleDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface RoleDtoMapper extends DtoMapper<RoleDtoIn, Role, RoleDtoOut> {
}
