package org.example.digimon.mappers.role;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.role.Role;
import org.example.digimon.dto.role.RoleDtoIn;
import org.example.digimon.dto.role.RoleDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T12:15:07+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class RoleDtoMapperImpl implements RoleDtoMapper {

    @Override
    public Role fromDtoIn(RoleDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( arg0.getId() );
        role.setName( arg0.getName() );
        role.setRoleEnum( arg0.getRoleEnum() );

        return role;
    }

    @Override
    public RoleDtoOut toDtoOut(Role arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RoleDtoOut roleDtoOut = new RoleDtoOut();

        roleDtoOut.setId( arg0.getId() );
        roleDtoOut.setName( arg0.getName() );
        roleDtoOut.setRoleEnum( arg0.getRoleEnum() );
        roleDtoOut.setUpdatedAt( arg0.getUpdatedAt() );
        roleDtoOut.setUpdatedBy( arg0.getUpdatedBy() );

        return roleDtoOut;
    }
}
