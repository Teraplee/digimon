package org.example.digimon.controllers.dictionary.groupdictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.RemoveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.SaveGroupDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.groupdictionary.SearchGroupDictionaryUseCase;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoIn;
import org.example.digimon.dto.dictionary.groupdictionary.GroupDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.groupdictionary.GroupDictionaryDtoMapper;
import org.example.digimon.specifications.dictionary.groupdictionary.GroupDictionarySpec;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.groupdictionary.GroupDictionaryEndPointConstants.*;
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

    @GetMapping(API_FIND_ALL_BY)
    public List<GroupDictionaryDtoOut> findAll(GroupDictionarySpec spec) {
        return groupDictionaryDtoMapper.toDtoOut(searchGroupDictionaryUseCase.findAll(spec));
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
