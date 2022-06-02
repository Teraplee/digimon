package org.example.digimon.role;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.role.Role;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T17:21:28+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class RoleJpaMapperImpl implements RoleJpaMapper {

    @Override
    public Role fromJpaEntity(RoleJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( arg0.getId() );
        role.setRoleEnum( arg0.getRoleEnum() );
        role.setUpdatedAt( arg0.getUpdatedAt() );
        role.setUpdatedBy( arg0.getUpdatedBy() );

        return role;
    }

    @Override
    public RoleJpaEntity toJpaEntity(Role arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RoleJpaEntity roleJpaEntity = new RoleJpaEntity();

        roleJpaEntity.setId( arg0.getId() );
        roleJpaEntity.setRoleEnum( arg0.getRoleEnum() );
        roleJpaEntity.setUpdatedAt( arg0.getUpdatedAt() );
        roleJpaEntity.setUpdatedBy( arg0.getUpdatedBy() );

        return roleJpaEntity;
    }
}
