package org.example.digimon.controllers.dictionary.classDictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.classDictionary.RemoveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SaveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SearchClassDictionaryUseCase;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.classDictionary.ClassDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.dictionary.classDictionary.ClassDictionaryEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_CLASS_DICTIONARY)
public class ClassDictionaryController {

    private final RemoveClassDictionaryUseCase removeClassDictionaryUseCase;
    private final SaveClassDictionaryUseCase saveClassDictionaryUseCase;
    private final SearchClassDictionaryUseCase searchClassDictionaryUseCase;
    private final ClassDictionaryDtoMapper classDictionaryDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public ClassDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return classDictionaryDtoMapper.toDtoOut(searchClassDictionaryUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<ClassDictionaryDtoOut> findAll() {
        return classDictionaryDtoMapper.toDtoOut(searchClassDictionaryUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public ClassDictionaryDtoOut save(@RequestBody ClassDictionaryDtoIn dtoIn) {
        return classDictionaryDtoMapper.toDtoOut(saveClassDictionaryUseCase.save(classDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeClassDictionaryUseCase.remove(id);
    }

}
