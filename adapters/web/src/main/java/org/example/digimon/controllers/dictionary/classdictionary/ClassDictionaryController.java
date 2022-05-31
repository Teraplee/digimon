package org.example.digimon.controllers.dictionary.classdictionary;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.classdictionary.RemoveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classdictionary.SaveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classdictionary.SearchClassDictionaryUseCase;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classdictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.classdictionary.ClassDictionaryDtoMapper;
import org.example.digimon.specifications.dictionary.classdictionary.ClassDictionarySpec;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.example.digimon.constants.dictionary.classdictionary.ClassDictionaryEndPointConstants.*;
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

    @GetMapping(API_FIND_ALL_BY)
    public List<ClassDictionaryDtoOut> findAll(ClassDictionarySpec spec) {
        return classDictionaryDtoMapper.toDtoOut(searchClassDictionaryUseCase.findAll(spec));
    }

    @PostMapping(API_SAVE)
    public ClassDictionaryDtoOut save(@Valid @RequestBody ClassDictionaryDtoIn dtoIn) {
        return classDictionaryDtoMapper.toDtoOut(saveClassDictionaryUseCase.save(classDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeClassDictionaryUseCase.remove(id);
    }

}
