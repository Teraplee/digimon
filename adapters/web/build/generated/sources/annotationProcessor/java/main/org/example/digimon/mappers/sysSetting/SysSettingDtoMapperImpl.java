package org.example.digimon.mappers.sysSetting;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.sysSetting.SysSetting;
import org.example.digimon.dto.sysSetting.SysSettingDtoIn;
import org.example.digimon.dto.sysSetting.SysSettingDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-26T17:12:38+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class SysSettingDtoMapperImpl implements SysSettingDtoMapper {

    @Override
    public SysSetting fromDtoIn(SysSettingDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSetting sysSetting = new SysSetting();

        sysSetting.setId( arg0.getId() );
        sysSetting.setName( arg0.getName() );
        sysSetting.setValue( arg0.getValue() );

        return sysSetting;
    }

    @Override
    public SysSettingDtoOut toDtoOut(SysSetting arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSettingDtoOut sysSettingDtoOut = new SysSettingDtoOut();

        sysSettingDtoOut.setId( arg0.getId() );
        sysSettingDtoOut.setName( arg0.getName() );
        sysSettingDtoOut.setValue( arg0.getValue() );
        sysSettingDtoOut.setUpdated_at( arg0.getUpdated_at() );
        sysSettingDtoOut.setUpdated_by( arg0.getUpdated_by() );

        return sysSettingDtoOut;
    }
}
