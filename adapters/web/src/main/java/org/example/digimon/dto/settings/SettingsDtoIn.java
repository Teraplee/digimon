package org.example.digimon.dto.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettingsDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String value;
    @NotNull
    private String default_value;

}
