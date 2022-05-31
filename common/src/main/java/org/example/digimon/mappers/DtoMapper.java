package org.example.digimon.mappers;

import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface DtoMapper<DtoIn, Entity, DtoOut> {

    Entity fromDtoIn(final DtoIn dtoIn);

    DtoOut toDtoOut(final Entity dtoOut);

    default List<Entity> fromDtoIn(final Collection<DtoIn> dtoIns) {
        return Optional
                .ofNullable(dtoIns)
                .map(
                        d -> d.stream()
                                .map(this::fromDtoIn)
                                .collect(Collectors.toList())
                )
                .orElse(Collections.EMPTY_LIST);
    }

    default List<DtoOut> toDtoOut(final Collection<Entity> dtoOuts) {
        return Optional
                .ofNullable(dtoOuts)
                .map(
                        d -> d.stream()
                                .map(this::toDtoOut)
                                .collect(Collectors.toList())
                )
                .orElse(Collections.EMPTY_LIST);
    }

    default Page<DtoOut> toDtoOut(Page<Entity> entities) {
        return Optional
                .ofNullable(entities)
                .map(e -> e.map(this::toDtoOut))
                .orElse(Page.empty());
    }

    default Iterable<DtoOut> toDtoOut(Iterable<Entity> entities) {
        if (entities instanceof Page) {
            return toDtoOut((Page<Entity>) entities);
        } else if (entities instanceof Collection) {
            return toDtoOut((Collection<Entity>) entities);
        } else {
            return null;
        }
    }

}
