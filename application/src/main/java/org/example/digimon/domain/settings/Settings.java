package org.example.digimon.domain.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Settings {

    private Long id;
    private String name;
    private String value;
    private String default_value;
    private Date updated_at;
    private String updated_by;

}
