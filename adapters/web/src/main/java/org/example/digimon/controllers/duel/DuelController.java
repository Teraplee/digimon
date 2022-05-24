package org.example.digimon.controllers.duel;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.duel.RemoveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SaveDuelUseCase;
import org.example.digimon.application.ports.in.duel.SearchDuelUseCase;
import org.example.digimon.dto.duel.DuelDtoIn;
import org.example.digimon.dto.duel.DuelDtoOut;
import org.example.digimon.mappers.duel.DuelDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.duel.DuelEndPointConstants.*;
import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_DUEL)
public class DuelController {

    private final RemoveDuelUseCase removeDuelUseCase;
    private final SaveDuelUseCase saveDuelUseCase;
    private final SearchDuelUseCase searchDuelUseCase;
    private final DuelDtoMapper duelDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public DuelDtoOut findById(@PathVariable("id") Long id) {
        return duelDtoMapper.toDtoOut(searchDuelUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<DuelDtoOut> findAll() {
        return duelDtoMapper.toDtoOut(searchDuelUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public DuelDtoOut save(@RequestBody DuelDtoIn dtoIn) {
        return duelDtoMapper.toDtoOut(saveDuelUseCase.save(duelDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removeDuelUseCase.remove(id);
    }

}
