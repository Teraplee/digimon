package org.example.digimon.controllers.digimon;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.DigimonConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_DIGIMON)
public class DigimonController {

    private final RemoveDigimonUseCase removeDigimonUseCase;
    private final SaveDigimonUseCase saveDigimonUseCase;
    private final SearchDigimonUseCase searchDigimonUseCase;
    private final DigimonDtoMapper digimonDtoMapper;

    @GetMapping(API_DIGIMON_FIND_BY_ID)
    public DigimonDtoOut findById(@PathVariable("id") Long id) {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findById(id));
    }

    @GetMapping(API_DIGIMON_FIND_ALL)
    public List<DigimonDtoOut> findAll() {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findAll());
    }

    @PostMapping(API_DIGIMON_SAVE)
    public DigimonDtoOut save(@RequestBody DigimonDtoIn dtoIn) {
        return digimonDtoMapper.toDtoOut(saveDigimonUseCase.save(digimonDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_DIGIMON_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeDigimonUseCase.remove(id);
    }

}
