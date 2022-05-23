package org.example.digimon.mappers.settings;

import org.example.digimon.domain.settings.Settings;
import org.example.digimon.dto.settings.SettingsDtoIn;
import org.example.digimon.dto.settings.SettingsDtoOut;
import org.example.digimon.mappers.DtoMapper;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface SettingsDtoMapper extends DtoMapper<SettingsDtoIn, Settings, SettingsDtoOut> {
}
