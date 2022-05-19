package org.example.digimon.common;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.RemoveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SaveTypeDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.typeDictionary.SearchTypeDictionaryUseCase;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoIn;
import org.example.digimon.dto.dictionary.typeDictionary.TypeDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.typeDictionary.TypeDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionary/type")
public class TypeDictionaryController {

    private final RemoveTypeDictionaryUseCase removeTypeDictionaryUseCase;
    private final SaveTypeDictionaryUseCase saveTypeDictionaryUseCase;
    private final SearchTypeDictionaryUseCase searchTypeDictionaryUseCase;
    private final TypeDictionaryDtoMapper typeDictionaryDtoMapper;

    @GetMapping("/find/{id}")
    public TypeDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findById(id));
    }

    @GetMapping("/find/all")
    public List<TypeDictionaryDtoOut> findAll() {
        return typeDictionaryDtoMapper.toDtoOut(searchTypeDictionaryUseCase.findAll());
    }

    @PostMapping("/save")
    public TypeDictionaryDtoOut save(@RequestBody TypeDictionaryDtoIn dtoIn) {
        return typeDictionaryDtoMapper.toDtoOut(saveTypeDictionaryUseCase.save(typeDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping("/remove/{id}")
    public void remove(@PathVariable("id") Long id) {
        removeTypeDictionaryUseCase.remove(id);
    }

}
