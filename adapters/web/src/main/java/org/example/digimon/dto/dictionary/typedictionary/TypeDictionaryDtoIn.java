package org.example.digimon.dto.dictionary.typedictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDictionaryDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String value;

}
