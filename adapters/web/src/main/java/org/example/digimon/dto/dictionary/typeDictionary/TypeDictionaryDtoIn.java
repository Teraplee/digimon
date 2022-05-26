package org.example.digimon.dto.dictionary.typeDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoIn;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDictionaryDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String value;

}
