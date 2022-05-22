package org.example.digimon.dto.dictionary.typeDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.digimon.dto.digimon.DigimonDtoOut;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDictionaryDtoOut implements Serializable {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
