package org.example.digimon.controllers.dictionary.familydictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.familydictionary.RemoveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familydictionary.SaveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familydictionary.SearchFamilyDictionaryUseCase;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familydictionary.FamilyDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.familydictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.specifications.dictionary.familydictionary.FamilyDictionarySpec;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.familydictionary.FamilyDictionaryEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_FAMILY_DICTIONARY)
public class FamilyDictionaryController {

    private final RemoveFamilyDictionaryUseCase removeFamilyDictionaryUseCase;
    private final SaveFamilyDictionaryUseCase saveFamilyDictionaryUseCase;
    private final SearchFamilyDictionaryUseCase searchFamilyDictionaryUseCase;
    private final FamilyDictionaryDtoMapper familyDictionaryDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public FamilyDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return familyDictionaryDtoMapper.toDtoOut(searchFamilyDictionaryUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<FamilyDictionaryDtoOut> findAll() {
        return familyDictionaryDtoMapper.toDtoOut(searchFamilyDictionaryUseCase.findAll());
    }

    @GetMapping(API_FIND_ALL_BY)
    public List<FamilyDictionaryDtoOut> findAll(FamilyDictionarySpec spec) {
        return familyDictionaryDtoMapper.toDtoOut(searchFamilyDictionaryUseCase.findAll(spec));
    }

    @PostMapping(API_SAVE)
    public FamilyDictionaryDtoOut save(@Valid @RequestBody FamilyDictionaryDtoIn dtoIn) {
        return familyDictionaryDtoMapper.toDtoOut(saveFamilyDictionaryUseCase.save(familyDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeFamilyDictionaryUseCase.remove(id);
    }

}
