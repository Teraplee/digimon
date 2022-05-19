package org.example.digimon.mappers;

public interface AutoJpaMapper<Entity, Domain> extends JpaMapper<Entity, Domain> {

    Domain fromJpaEntity(final Entity jpaEntity);

    Entity toJpaEntity(final Domain entity);

}
