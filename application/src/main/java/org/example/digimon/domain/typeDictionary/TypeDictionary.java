package org.example.digimon.domain.typeDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.digimon.Digimon;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeDictionary {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
