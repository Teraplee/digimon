package org.example.digimon.common;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/digimon")
public class DigimonController {

    private final RemoveDigimonUseCase removeDigimonUseCase;
    private final SaveDigimonUseCase saveDigimonUseCase;
    private final SearchDigimonUseCase searchDigimonUseCase;
    private final DigimonDtoMapper digimonDtoMapper;

    @GetMapping("/find/{id}")
    public DigimonDtoOut findById(@PathVariable("id") Long id) {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findById(id));
    }

    @GetMapping("/find/all")
    public List<DigimonDtoOut> findAll() {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findAll());
    }

    @PostMapping("/save")
    public DigimonDtoOut save(@RequestBody DigimonDtoIn dtoIn) {
        return digimonDtoMapper.toDtoOut(saveDigimonUseCase.save(digimonDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping("/remove/{id}")
    public void remove(@PathVariable("id") Long id) {
        removeDigimonUseCase.remove(id);
    }

}
