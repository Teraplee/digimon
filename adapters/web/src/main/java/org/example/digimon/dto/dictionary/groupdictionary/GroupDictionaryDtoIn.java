package org.example.digimon.dto.dictionary.groupdictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDictionaryDtoIn implements Serializable {

    private Long id;
    @NotNull
    private String value;

}
