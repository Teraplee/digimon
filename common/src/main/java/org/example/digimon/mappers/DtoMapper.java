package org.example.digimon.mappers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface DtoMapper<DtoIn, Entity, DtoOut> {

    default Entity fromDtoIn(final DtoIn dtoIn) {
        return null;
    }

    default DtoOut toDtoOut(final Entity dtoOut) {
        return null;
    }

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

}
