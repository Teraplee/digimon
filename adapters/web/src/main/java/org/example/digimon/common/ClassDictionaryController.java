package org.example.digimon.common;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.dictionary.classDictionary.RemoveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SaveClassDictionaryUseCase;
import org.example.digimon.application.ports.in.dictionary.classDictionary.SearchClassDictionaryUseCase;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoIn;
import org.example.digimon.dto.dictionary.classDictionary.ClassDictionaryDtoOut;
import org.example.digimon.mappers.dictionary.classDictionary.ClassDictionaryDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionary/class")
public class ClassDictionaryController {

    private final RemoveClassDictionaryUseCase removeClassDictionaryUseCase;
    private final SaveClassDictionaryUseCase saveClassDictionaryUseCase;
    private final SearchClassDictionaryUseCase searchClassDictionaryUseCase;
    private final ClassDictionaryDtoMapper classDictionaryDtoMapper;

    @GetMapping("/find/{id}")
    public ClassDictionaryDtoOut findById(@PathVariable("id") Long id) {
        return classDictionaryDtoMapper.toDtoOut(searchClassDictionaryUseCase.findById(id));
    }

    @GetMapping("/find/all")
    public List<ClassDictionaryDtoOut> findAll() {
        return classDictionaryDtoMapper.toDtoOut(searchClassDictionaryUseCase.findAll());
    }

    @PostMapping("/save")
    public ClassDictionaryDtoOut save(@RequestBody ClassDictionaryDtoIn dtoIn) {
        return classDictionaryDtoMapper.toDtoOut(saveClassDictionaryUseCase.save(classDictionaryDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping("/remove/{id}")
    public void remove(@PathVariable("id") Long id) {
        removeClassDictionaryUseCase.remove(id);
    }

}
