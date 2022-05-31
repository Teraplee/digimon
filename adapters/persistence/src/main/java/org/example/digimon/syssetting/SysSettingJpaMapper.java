package org.example.digimon.syssetting;

import org.example.digimon.domain.syssetting.SysSetting;
import org.example.digimon.mappers.AutoJpaMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface SysSettingJpaMapper extends AutoJpaMapper<SysSettingJpaEntity, SysSetting> {
}
