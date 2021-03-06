package org.example.digimon.dto.dictionary.groupdictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDictionaryDtoOut implements Serializable {

    private Long id;
    private String value;
    private Date updatedAt;
    private String updatedBy;

}
