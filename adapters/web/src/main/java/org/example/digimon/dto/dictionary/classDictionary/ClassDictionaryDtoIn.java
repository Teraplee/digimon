package org.example.digimon.dto.dictionary.classDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDictionaryDtoIn implements Serializable {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
