package org.example.digimon.controllers.dictionary.familyDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.RemoveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SaveFamilyDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.familyDictionary.SearchFamilyDictionaryUseCase;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoIn;
import org.example.digimon.dto.dictionary.familyDictionary.FamilyDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.familyDictionary.FamilyDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.FamilyDictionaryConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_FAMILY_DICTIONARY)
public class FamilyDictionaryController {

    private final RemoveFamilyDictionaryUseCase removeFamilyDictionaryUseCase;
    private final SaveFamilyDictionaryUseCase saveFamilyDictionaryUseCase;
    private final SearchFamilyDictionaryUseCase searchFamilyDictionaryUseCase;
    private final FamilyDictionaryDtoMapper familyDictionaryDtoMapper;

    @GetMapping(API_FAMILY_DICTIONARY_FIND_BY_ID)
    public FamilyDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return familyDictionaryDtoMapper.toDtoOut(searchFamilyDictionaryUseCase.findById(id));
    }

    @GetMapping(API_FAMILY_DICTIONARY_FIND_ALL)
    public List<FamilyDictionaryDtoOut> findAll() {
        return familyDictionaryDtoMapper.toDtoOut(searchFamilyDictionaryUseCase.findAll());
    }

    @PostMapping(API_FAMILY_DICTIONARY_SAVE)
    public FamilyDictionaryDtoOut save(@RequestBody FamilyDictionaryDtoIn dtoIn) {
        return familyDictionaryDtoMapper.toDtoOut(saveFamilyDictionaryUseCase.save(familyDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_FAMILY_DICTIONARY_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeFamilyDictionaryUseCase.remove(id);
    }

}
