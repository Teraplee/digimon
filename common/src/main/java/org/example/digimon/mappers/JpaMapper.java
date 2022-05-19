package org.example.digimon.mappers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface JpaMapper<Entity, Domain> {

    default Entity toJpaEntity(final Domain entity){
        return null;
    }

    default Domain fromJpaEntity(final Entity jpaEntity){
        return null;
    }

    default List<Entity> toJpaEntity(final Collection<Domain> entities){
        return Optional
                .ofNullable(entities)
                .map(
                        e -> e.stream()
                                .map(this::toJpaEntity)
                                .collect(Collectors.toList())
                )
                .orElse(Collections.EMPTY_LIST);
    }

    default List<Domain> fromJpaEntity(final Collection<Entity> jpaEntities){
        return Optional
                .ofNullable(jpaEntities)
                .map(
                        e -> e.stream()
                                .map(this::fromJpaEntity)
                                .collect(Collectors.toList())
                )
                .orElse(Collections.EMPTY_LIST);
    }

}
