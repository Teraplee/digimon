package org.example.digimon.settings;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.settings.Settings;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-24T16:18:44+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class SettingsJpaMapperImpl implements SettingsJpaMapper {

    @Override
    public Settings fromJpaEntity(SettingsJpaEntity arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Settings settings = new Settings();

        settings.setId( arg0.getId() );
        settings.setName( arg0.getName() );
        settings.setValue( arg0.getValue() );
        settings.setDefault_value( arg0.getDefault_value() );
        settings.setUpdated_at( arg0.getUpdated_at() );
        settings.setUpdated_by( arg0.getUpdated_by() );

        return settings;
    }

    @Override
    public SettingsJpaEntity toJpaEntity(Settings arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SettingsJpaEntity settingsJpaEntity = new SettingsJpaEntity();

        settingsJpaEntity.setId( arg0.getId() );
        settingsJpaEntity.setName( arg0.getName() );
        settingsJpaEntity.setValue( arg0.getValue() );
        settingsJpaEntity.setDefault_value( arg0.getDefault_value() );
        settingsJpaEntity.setUpdated_at( arg0.getUpdated_at() );
        settingsJpaEntity.setUpdated_by( arg0.getUpdated_by() );

        return settingsJpaEntity;
    }
}
