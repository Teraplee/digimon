package org.example.digimon.application.ports.out.dictionary.groupDictionary;

import org.example.digimon.domain.dictionary.groupDictionary.GroupDictionary;

public interface SaveGroupDictionaryPort {

    GroupDictionary save(GroupDictionary groupDictionary);


}
