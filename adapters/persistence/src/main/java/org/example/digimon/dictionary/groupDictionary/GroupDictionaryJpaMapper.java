package org.example.digimon.dictionary.groupDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingInheritanceStrategy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
@MapperConfig(mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_ALL_FROM_CONFIG)
public interface GroupDictionaryJpaMapper {

    GroupDictionary fromJpaEntity(GroupDictionaryJpaEntity jpaEntity);
    GroupDictionaryJpaEntity toJpaEntity(GroupDictionary entity);

}
