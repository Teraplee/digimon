package org.example.digimon.controllers.digimon;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.example.digimon.specifications.digimon.DigimonSpec;
import org.example.digimon.specifications.digimon.DigimonSpecClass;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

import static org.example.digimon.constants.digimon.DigimonEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_DIGIMON)
public class DigimonController {

    private final RemoveDigimonUseCase removeDigimonUseCase;
    private final SaveDigimonUseCase saveDigimonUseCase;
    private final SearchDigimonUseCase searchDigimonUseCase;
    private final DigimonDtoMapper digimonDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public DigimonDtoOut findById(@PathVariable("id") Long id) {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<DigimonDtoOut> findAll() {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findAll());
    }

    @GetMapping(value = API_FIND_ALL_BY)
    public List<DigimonDtoOut> findAll(DigimonSpec spec) {
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findAll(spec));
    }

    @GetMapping(value = API_FIND_ALL_BY + "/custom")
    public List<DigimonDtoOut> findAllByCustom(@RequestParam("dateAfter") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateAfter,
                                               @RequestParam("dateBefore") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateBefore,
                                               @RequestParam("attack_greatest_than") Double attack,
                                               @RequestParam("defence_less_than") Double defence) {
        Specification spec = Specification.where(DigimonSpecClass.between(dateAfter, dateBefore)
                .and(DigimonSpecClass.attackGreatestThan(attack).and(DigimonSpecClass.defenceLessThan(defence))));
        return digimonDtoMapper.toDtoOut(searchDigimonUseCase.findAllByCustom(spec));
    }

    @PostMapping(API_SAVE)
    public DigimonDtoOut save(@Valid @RequestBody DigimonDtoIn dtoIn) {
        return digimonDtoMapper.toDtoOut(saveDigimonUseCase.save(digimonDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeDigimonUseCase.remove(id);
    }

}
