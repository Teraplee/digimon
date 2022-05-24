package org.example.digimon.mappers.settings;

import javax.annotation.processing.Generated;
import org.example.digimon.domain.settings.Settings;
import org.example.digimon.dto.settings.SettingsDtoIn;
import org.example.digimon.dto.settings.SettingsDtoOut;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-24T17:25:46+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.3.1 (Oracle Corporation)"
)
@Component
public class SettingsDtoMapperImpl implements SettingsDtoMapper {

    @Override
    public Settings fromDtoIn(SettingsDtoIn arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Settings settings = new Settings();

        settings.setId( arg0.getId() );
        settings.setName( arg0.getName() );
        settings.setValue( arg0.getValue() );
        settings.setDefault_value( arg0.getDefault_value() );

        return settings;
    }

    @Override
    public SettingsDtoOut toDtoOut(Settings arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SettingsDtoOut settingsDtoOut = new SettingsDtoOut();

        settingsDtoOut.setId( arg0.getId() );
        settingsDtoOut.setName( arg0.getName() );
        settingsDtoOut.setValue( arg0.getValue() );
        settingsDtoOut.setDefault_value( arg0.getDefault_value() );
        settingsDtoOut.setUpdated_at( arg0.getUpdated_at() );
        settingsDtoOut.setUpdated_by( arg0.getUpdated_by() );

        return settingsDtoOut;
    }
}
