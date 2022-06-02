package org.example.digimon.controllers.digimon;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.digimon.RemoveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SaveDigimonUseCase;
import org.example.digimon.application.ports.in.digimon.SearchDigimonUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.mappers.digimon.DigimonDtoMapper;
import org.example.digimon.specifications.digimon.DigimonSpec;
import org.example.digimon.specifications.digimon.DigimonSpecification;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public Iterable<DigimonDtoOut> findAll(DigimonSpec spec, Pageable pageable) {
        return digimonDtoMapper.toDtoOut(
          pageable.equals(Pageable.unpaged())
          ? searchDigimonUseCase.findAll(spec)
          : searchDigimonUseCase.findAll(spec, pageable)
        );
    }

    @GetMapping(value = API_FIND_BY_DATES)
    public Iterable<DigimonDtoOut> findByDates(Pageable pageable,
                                               @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
                                               @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTo) {
        Specification spec = Specification.where(DigimonSpecification.between(dateFrom, dateTo));
        return digimonDtoMapper.toDtoOut(
                pageable.equals(Pageable.unpaged())
                        ? searchDigimonUseCase.findAll(spec)
                        : searchDigimonUseCase.findAll(spec, pageable)
        );
    }

    @GetMapping(value = API_FIND_BY_ATTACK)
    public Iterable<DigimonDtoOut> findByAttackGreatestThan(Pageable pageable, Double attack) {
        Specification spec = Specification.where(DigimonSpecification.attackGreatestThan(attack));
        return digimonDtoMapper.toDtoOut(
                pageable.equals(Pageable.unpaged())
                        ? searchDigimonUseCase.findAll(spec)
                        : searchDigimonUseCase.findAll(spec, pageable)
        );
    }

    @GetMapping(value = API_FIND_BY_DEFENCE)
    public Iterable<DigimonDtoOut> findByDefenceLessThan(Pageable pageable, Double defence) {
        Specification spec = Specification.where(DigimonSpecification.defenceLessThan(defence));
        return digimonDtoMapper.toDtoOut(
                pageable.equals(Pageable.unpaged())
                        ? searchDigimonUseCase.findAll(spec)
                        : searchDigimonUseCase.findAll(spec, pageable)
        );
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
