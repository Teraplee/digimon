package org.example.digimon.dto.dictionary.classDictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDictionaryDtoOut implements Serializable {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
