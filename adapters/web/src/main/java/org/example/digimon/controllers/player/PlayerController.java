package org.example.digimon.controllers.player;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.player.RemovePlayerUseCase;
import org.example.digimon.application.ports.in.player.SavePlayerUseCase;
import org.example.digimon.application.ports.in.player.SearchPlayerUseCase;
import org.example.digimon.configuration.security.JwtProvider;
import org.example.digimon.dto.player.PlayerDtoIn;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.exceptions.AppException;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.example.digimon.specifications.player.PlayerSpec;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    private final JwtProvider jwtProvider;

    private final PasswordEncoder passwordEncoder;

    @GetMapping(API_FIND_BY_ID)
    public PlayerDtoOut findById(@PathVariable("id") Long id) {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findById(id));
    }

    @GetMapping(API_FIND_BY + "/{username}")
    public PlayerDtoOut findByUsername(@PathVariable("username") String username) {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findByUsername(username));
    }

    @GetMapping(API_FIND_ALL)
    public List<PlayerDtoOut> findAll() {
        return playerDtoMapper.toDtoOut(searchPlayerUseCase.findAll());
    }

    @GetMapping(API_FIND_ALL_BY)
    public Iterable<PlayerDtoOut> findAll(PlayerSpec spec, Pageable pageable) {
        return playerDtoMapper.toDtoOut(
                pageable.equals(Pageable.unpaged()) ? searchPlayerUseCase.findAll(spec)
                        : searchPlayerUseCase.findAll(spec, pageable)
        );
    }

    @PostMapping(API_SAVE)
    public PlayerDtoOut save(@Valid @RequestBody PlayerDtoIn dtoIn) {
        dtoIn.setPassword(passwordEncoder.encode(dtoIn.getPassword()));
        return playerDtoMapper.toDtoOut(savePlayerUseCase.save(playerDtoMapper.fromDtoIn(dtoIn)));
    }

    @PostMapping("/auth")
    public AuthResponse auth(@RequestBody AuthRequest request) {
        PlayerDtoOut playerDtoOut = playerDtoMapper.toDtoOut(searchPlayerUseCase.findByUsername(request.getUsername()));
        if (playerDtoOut != null) {
            if (passwordEncoder.matches(request.getPassword(), playerDtoOut.getPassword())) {
                String token = jwtProvider.generateToken(playerDtoOut.getUsername());
                return new AuthResponse(token);
            } else {
                throw new AppException("password incorrect");
            }
        } else {
            throw new AppException("username incorrect");
        }

    }

    @GetMapping(API_REMOVE_BY_ID)
    public void remove(@PathVariable("id") Long id) {
        removePlayerUseCase.remove(id);
    }

}
