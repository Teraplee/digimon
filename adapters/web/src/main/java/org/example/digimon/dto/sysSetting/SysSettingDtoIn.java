package org.example.digimon.dto.sysSetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

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
