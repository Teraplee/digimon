package org.example.digimon.dto.dictionary.classdictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDictionaryDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String value;

}
