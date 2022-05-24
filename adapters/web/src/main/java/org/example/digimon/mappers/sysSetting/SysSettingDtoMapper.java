package org.example.digimon.mappers.sysSetting;

import org.example.digimon.domain.sysSetting.SysSetting;
import org.example.digimon.dto.sysSetting.SysSettingDtoIn;
import org.example.digimon.dto.sysSetting.SysSettingDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface SysSettingDtoMapper extends DtoMapper<SysSettingDtoIn, SysSetting, SysSettingDtoOut> {
}
