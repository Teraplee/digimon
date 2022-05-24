package org.example.digimon.controllers.player;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.player.RemovePlayerUseCase;
import org.example.digimon.application.ports.in.player.SavePlayerUseCase;
import org.example.digimon.application.ports.in.player.SearchPlayerUseCase;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.digimon.constants.endPointConstants.EndPointConstants.*;
import static org.example.digimon.constants.player.PlayerEndPointConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_PLAYER)
public class PlayerController {

    private final RemovePlayerUseCase removePlayerUseCase;
    private final SavePlayerUseCase savePlayerUseCase;
    private final SearchPlayerUseCase searchPlayerUseCase;
    private final PlayerDtoMapper playerDtoMapper;

    @GetMapping(API_FIND_BY_ID)
    public PlayerDtoOut findById(@PathVariable("id") Long id) {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findById(id));
    }

    @GetMapping(API_FIND_ALL)
    public List<PlayerDtoOut> findAll() {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findAll());
    }

    @PostMapping(API_SAVE)
    public PlayerDtoOut save(@RequestBody PlayerDtoIn dtoIn) {
        return playerDtoMapper.toDtoOut(savePlayerUseCase.save(playerDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {

        removePlayerUseCase.remove(id);

    }

}
