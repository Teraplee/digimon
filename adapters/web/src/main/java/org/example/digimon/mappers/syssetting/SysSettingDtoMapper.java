package org.example.digimon.mappers.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;
import org.example.digimon.dto.syssetting.SysSettingDtoIn;
import org.example.digimon.dto.syssetting.SysSettingDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface SysSettingDtoMapper extends DtoMapper<SysSettingDtoIn, SysSetting, SysSettingDtoOut> {
}
