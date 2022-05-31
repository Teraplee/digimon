package org.example.digimon.dto.dictionary.familydictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamilyDictionaryDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String value;
    @NotNull
    private String shortValue;

}
