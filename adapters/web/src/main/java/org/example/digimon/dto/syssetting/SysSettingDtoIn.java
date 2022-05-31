package org.example.digimon.dto.syssetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysSettingDtoIn {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String value;

}
