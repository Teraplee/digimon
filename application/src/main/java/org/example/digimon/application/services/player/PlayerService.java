package org.example.digimon.application.services.player;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.player.RemovePlayerUseCase;
import org.example.digimon.application.ports.in.player.SavePlayerUseCase;
import org.example.digimon.application.ports.in.player.SearchPlayerUseCase;
import org.example.digimon.application.ports.out.player.RemovePlayerPort;
import org.example.digimon.application.ports.out.player.SavePlayerPort;
import org.example.digimon.application.ports.out.player.SearchPlayerPort;
import org.example.digimon.domain.player.Player;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService implements RemovePlayerUseCase, SavePlayerUseCase, SearchPlayerUseCase {

    private final RemovePlayerPort removePlayerPort;
    private final SavePlayerPort savePlayerPort;
    private final SearchPlayerPort searchPlayerPort;


    @Override
    public void remove(@NonNull final Long id) {
        removePlayerPort.remove(id);
    }

    @Override
    public Player save(@NonNull final Player player) {
        return savePlayerPort.save(player);
    }

    @Override
    public Player findById(@NonNull final Long id) {
        return searchPlayerPort.findById(id);
    }

    @Override
    public List<Player> findAll() {
        return searchPlayerPort.findAll();
    }

    @Override
    public List<Player> findAll(Specification spec) {
        return searchPlayerPort.findAll(spec);
    }
}
