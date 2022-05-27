package org.example.digimon.player;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.player.RemovePlayerPort;
import org.example.digimon.application.ports.out.player.SavePlayerPort;
import org.example.digimon.application.ports.out.player.SearchPlayerPort;
import org.example.digimon.domain.player.Player;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PlayerPersistenceAdapter implements RemovePlayerPort, SavePlayerPort, SearchPlayerPort {

    private final PlayerJpaRepository playerJpaRepository;
    private final PlayerJpaMapper playerJpaMapper;

    @Override
    public void remove(Long id) {
        try {
            playerJpaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public Player save(Player player) {
        try {
            return playerJpaMapper.fromJpaEntity(playerJpaRepository.save(playerJpaMapper.toJpaEntity(player)));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Player findById(Long id) {
        try {
            return playerJpaMapper.fromJpaEntity(playerJpaRepository.findById(id).orElseThrow(NoSuchElementException::new));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Player> findAll() {
        try {
            return playerJpaMapper.fromJpaEntity(playerJpaRepository.findAll());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Player> findAll(Specification spec) {
        try {
            return playerJpaMapper.fromJpaEntity(playerJpaRepository.findAll(spec));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
