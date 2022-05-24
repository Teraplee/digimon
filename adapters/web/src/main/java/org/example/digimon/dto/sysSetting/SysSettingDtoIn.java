package org.example.digimon.dto.sysSetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysSettingDtoIn {

    private Long id;
    private String name;
    private String value;

}