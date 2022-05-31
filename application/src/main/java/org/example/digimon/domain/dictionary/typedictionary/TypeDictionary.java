package org.example.digimon.domain.dictionary.typedictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDictionary {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
