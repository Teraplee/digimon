package org.example.digimon.controllers.dictionary.typedictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.typedictionary.RemoveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typedictionary.SaveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typedictionary.SearchTypeDictionaryUseCase;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typedictionary.TypeDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.typedictionary.TypeDictionaryDtoMapper;
import org.example.digimon.specifications.dictionary.typedictionary.TypeDictionarySpec;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.typedictionary.TypeDictionaryEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_TYPE_DICTIONARY)
public class TypeDictionaryController {

    private final RemoveTypeDictionaryUseCase removeTypeDictionaryUseCase;
    private final SaveTypeDictionaryUseCase saveTypeDictionaryUseCase;
    private final SearchTypeDictionaryUseCase searchTypeDictionaryUseCase;
    private final TypeDictionaryDtoMapper typeDictionaryDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public TypeDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<TypeDictionaryDtoOut> findAll() {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findAll());
    }

    @GetMapping(API_FIND_ALL_BY)
    public List<TypeDictionaryDtoOut> findAll(TypeDictionarySpec spec) {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findAll(spec));
    }

    @PostMapping(API_SAVE)
    public TypeDictionaryDtoOut save(@Valid @RequestBody TypeDictionaryDtoIn dtoIn) {
        return typeDictionaryDtoMapper.toDtoOut(saveTypeDictionaryUseCase.save(typeDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeTypeDictionaryUseCase.remove(id);
    }

}
