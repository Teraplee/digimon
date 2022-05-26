package org.example.digimon.controllers.dictionary.groupDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.RemoveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.SaveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupDictionary.SearchGroupDictionaryUseCase;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupDictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.groupDictionary.GroupDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.groupDictionary.GroupDictionaryEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_GROUP_DICTIONARY)
public class GroupDictionaryController {

    private final RemoveGroupDictionaryUseCase removeGroupDictionaryUseCase;
    private final SaveGroupDictionaryUseCase saveGroupDictionaryUseCase;
    private final SearchGroupDictionaryUseCase searchGroupDictionaryUseCase;
    private final GroupDictionaryDtoMapper groupDictionaryDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public GroupDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return groupDictionaryDtoMapper.toDtoOut(searchGroupDictionaryUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<GroupDictionaryDtoOut> findAll() {
        return groupDictionaryDtoMapper.toDtoOut(searchGroupDictionaryUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public GroupDictionaryDtoOut save(@Valid @RequestBody GroupDictionaryDtoIn dtoIn) {
        return groupDictionaryDtoMapper.toDtoOut(saveGroupDictionaryUseCase.save(groupDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeGroupDictionaryUseCase.remove(id);
    }

}
