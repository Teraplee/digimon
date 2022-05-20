package org.example.digimon.controllers.dictionary.typeDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.RemoveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SaveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SearchTypeDictionaryUseCase;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.typeDictionary.TypeDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.TypeDictionaryConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_TYPE_DICTIONARY)
public class TypeDictionaryController {

    private final RemoveTypeDictionaryUseCase removeTypeDictionaryUseCase;
    private final SaveTypeDictionaryUseCase saveTypeDictionaryUseCase;
    private final SearchTypeDictionaryUseCase searchTypeDictionaryUseCase;
    private final TypeDictionaryDtoMapper typeDictionaryDtoMapper;

    @GetMapping(API_TYPE_DICTIONARY_FIND_BY_ID)
    public TypeDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findById(id));
    }

    @GetMapping(API_TYPE_DICTIONARY_FIND_ALL)
    public List<TypeDictionaryDtoOut> findAll() {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findAll());
    }

    @PostMapping(API_TYPE_DICTIONARY_SAVE)
    public TypeDictionaryDtoOut save(@RequestBody TypeDictionaryDtoIn dtoIn) {
        return typeDictionaryDtoMapper.toDtoOut(saveTypeDictionaryUseCase.save(typeDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_TYPE_DICTIONARY_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeTypeDictionaryUseCase.remove(id);
    }

}
