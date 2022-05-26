package org.example.digimon.sysSetting;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.sysSetting.SysSetting;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-25T14:39:20+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class SysSettingJpaMapperImpl implements SysSettingJpaMapper {

    @Override
    public SysSetting fromJpaEntity(SysSettingJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSetting sysSetting = new SysSetting();

        sysSetting.setId( arg0.getId() );
        sysSetting.setName( arg0.getName() );
        sysSetting.setValue( arg0.getValue() );
        sysSetting.setUpdated_at( arg0.getUpdated_at() );
        sysSetting.setUpdated_by( arg0.getUpdated_by() );

        return sysSetting;
    }

    @Override
    public SysSettingJpaEntity toJpaEntity(SysSetting arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysSettingJpaEntity sysSettingJpaEntity = new SysSettingJpaEntity();

        sysSettingJpaEntity.setId( arg0.getId() );
        sysSettingJpaEntity.setName( arg0.getName() );
        sysSettingJpaEntity.setValue( arg0.getValue() );
        sysSettingJpaEntity.setUpdated_at( arg0.getUpdated_at() );
        sysSettingJpaEntity.setUpdated_by( arg0.getUpdated_by() );

        return sysSettingJpaEntity;
    }
}
