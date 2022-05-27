package org.example.digimon.controllers.dictionary.familyDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.RemoveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SaveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SearchFamilyDictionaryUseCase;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.familyDictionary.FamilyDictionaryDtoMapper;
import org.example.digimon.specifications.dictionary.familyDictionary.FamilyDictionarySpec;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.familyDictionary.FamilyDictionaryEndPointConstants.*;
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
