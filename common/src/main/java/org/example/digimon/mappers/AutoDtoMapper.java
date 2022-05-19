package org.example.digimon.mappers;

public interface AutoDtoMapper<DtoIn, Entity, DtoOut> extends DtoMapper<DtoIn, Entity, DtoOut> {

    Entity fromDtoIn(final DtoIn dtoIn);

    DtoOut toDtoOut(final Entity dtoOut);

}
