package org.example.digimon.dto.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettingsDtoIn implements Serializable {

    private Long id;
    private String name;
    private String value;
    private String default_value;

}
