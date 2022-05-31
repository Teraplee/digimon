package org.example.digimon.application.ports.out.dictionary.groupdictionary;

import org.example.digimon.domain.dictionary.groupdictionary.GroupDictionary;

public interface SaveGroupDictionaryPort {

    GroupDictionary save(GroupDictionary groupDictionary);


}
