package org.example.digimon.dictionary.groupDictionary;

import org.example.digimon.digimon.DigimonJpaMapper;
import org.example.digimon.domain.groupDictionary.GroupDictionary;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DigimonJpaMapper.class}, injectionStrategy = InjectionStrategy.FIELD)
public interface GroupDictionaryJpaMapper {

    GroupDictionary fromJpaEntity(GroupDictionaryJpaEntity jpaEntity);
    GroupDictionaryJpaEntity toJpaEntity(GroupDictionary entity);

}
