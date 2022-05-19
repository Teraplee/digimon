package org.example.digimon.common;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.duel.RemoveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SaveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SearchDuelUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.example.digimon.mappers.duel.DuelDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/duel")
public class DuelController {

    private final RemoveDuelUseCase removeDuelUseCase;
    private final SaveDuelUseCase saveDuelUseCase;
    private final SearchDuelUseCase searchDuelUseCase;
    private final DuelDtoMapper duelDtoMapper;

    @GetMapping("/find/{id}")
    public DuelDtoOut findById(@PathVariable("id") Long id) {
        return duelDtoMapper.toDtoOut(searchDuelUseCase.findById(id));
    }

    @GetMapping("/find/all")
    public List<DuelDtoOut> findAll() {
        return duelDtoMapper.toDtoOut(searchDuelUseCase.findAll());
    }

    @PostMapping("/save")
    public DuelDtoOut save(@RequestBody DuelDtoIn dtoIn) {
        return duelDtoMapper.toDtoOut(saveDuelUseCase.save(duelDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping("/remove/{id}")
    public void remove(@PathVariable("id") Long id) {
        removeDuelUseCase.remove(id);
    }

}
