package org.example.digimon.common;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.player.RemovePlayerUseCase;
import org.example.digimon.application.ports.in.player.SavePlayerUseCase;
import org.example.digimon.application.ports.in.player.SearchPlayerUseCase;
import org.example.digimon.dto.digimon.DigimonDtoIn;
import org.example.digimon.dto.digimon.DigimonDtoOut;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {

    private final RemovePlayerUseCase removePlayerUseCase;
    private final SavePlayerUseCase savePlayerUseCase;
    private final SearchPlayerUseCase searchPlayerUseCase;
    private final PlayerDtoMapper playerDtoMapper;

    @GetMapping("/find/{id}")
    public PlayerDtoOut findById(@PathVariable("id") Long id) {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findById(id));
    }

    @GetMapping("/find/all")
    public List<PlayerDtoOut> findAll() {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findAll());
    }

    @PostMapping("/save")
    public PlayerDtoOut save(@RequestBody PlayerDtoIn dtoIn) {
        return playerDtoMapper.toDtoOut(savePlayerUseCase.save(playerDtoMapper.fromDtoIn(dtoIn)));
    }

    @GetMapping("/remove/{id}")
    public void remove(@PathVariable("id") Long id) {

        removePlayerUseCase.remove(id);

    }

}
