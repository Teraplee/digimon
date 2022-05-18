package org.example.digimon.common;

import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/digimon")
public class DigimonController {

    private final RemoveDigimonUseCase removeDigimonUseCase;
    private final SaveDigimonUseCase saveDigimonUseCase;
    private final SearchDigimonUseCase searchDigimonUseCase;
    private final DigimonDtoMapper digimonDtoMapper;

    public DigimonController(RemoveDigimonUseCase removeDigimonUseCase, SaveDigimonUseCase saveDigimonUseCase, SearchDigimonUseCase searchDigimonUseCase, DigimonDtoMapper digimonDtoMapper) {
        this.removeDigimonUseCase = removeDigimonUseCase;
        this.saveDigimonUseCase = saveDigimonUseCase;
        this.searchDigimonUseCase = searchDigimonUseCase;
        this.digimonDtoMapper = digimonDtoMapper;
    }

    @GetMapping("/{id}")
    public DigimonDtoOut findById(@PathVariable("id") Long id) {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findById(id));
    }

    @GetMapping("/findAll")
    public List<DigimonDtoOut> findAll() {
        List<DigimonDtoOut> digimonDtoOuts = new ArrayList<>();
        searchDigimonUseCase.findAll().forEach(digimon -> digimonDtoOuts.add(digimonDtoMapper.toDtoOut(digimon)));
        return digimonDtoOuts;
    }

}
