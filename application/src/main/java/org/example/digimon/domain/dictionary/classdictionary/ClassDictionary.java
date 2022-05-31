package org.example.digimon.domain.dictionary.classdictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassDictionary {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
