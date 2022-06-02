package org.example.digimon.player;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.out.player.RemovePlayerPort;
import org.example.digimon.application.ports.out.player.SavePlayerPort;
import org.example.digimon.application.ports.out.player.SearchPlayerPort;
import org.example.digimon.digimon.DigimonJpaEntity;
import org.example.digimon.domain.player.Player;
import org.example.digimon.domain.role.Role;
import org.example.digimon.domain.role.RoleEnum;
import org.example.digimon.exceptions.AppException;
import org.example.digimon.role.RoleJpaEntity;
import org.example.digimon.role.RoleJpaMapper;
import org.example.digimon.role.RoleJpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PlayerPersistenceAdapter implements RemovePlayerPort, SavePlayerPort, SearchPlayerPort {

    private final PlayerJpaRepository playerJpaRepository;
    private final PlayerJpaMapper playerJpaMapper;


    @Override
    public void remove(Long id) {
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        playerJpaRepository.deleteById(id);
    }

    @Override
    public Player save(Player player) {
        if (player == null) {
            throw new AppException("player cannot be null");
        }
        if (playerJpaRepository.findByUsername(player.getUsername()) != null) {
            throw new AppException("User with username: " + player.getUsername() + " already exists");
        }
        PlayerJpaEntity playerJpaEntity = playerJpaMapper.toJpaEntity(player);

        return playerJpaMapper.fromJpaEntity(playerJpaRepository.save(playerJpaEntity));
    }

    @Override
    public Player findById(Long id) {
        if (id == null) {
            throw new AppException("id cannot be null");
        }
        return playerJpaMapper.fromJpaEntity(playerJpaRepository.findById(id).orElseThrow(() ->
                new AppException("Player with id: " + id + " not found")));
    }

    @Override
    public Player findByUsername(String username) {
        if (username == null) {
            throw new AppException("username cannot be null");
        }
        return playerJpaMapper.fromJpaEntity(playerJpaRepository.findByUsername(username));
    }

    @Override
    public List<Player> findAll() {
        final List<PlayerJpaEntity> playerJpaEntities = playerJpaRepository.findAll();

        return playerJpaMapper.fromJpaEntity(playerJpaEntities);
    }

    @Override
    public List<Player> findAll(Specification spec) {
        final List<PlayerJpaEntity> playerJpaEntities = playerJpaRepository.findAll(spec);

        return playerJpaMapper.fromJpaEntity(playerJpaEntities);
    }

    @Override
    public Page<Player> findAll(Specification spec, Pageable pageable) {
        final Page<PlayerJpaEntity> playerJpaEntities = playerJpaRepository.findAll(spec, pageable);

        return playerJpaMapper.fromJpaEntity(playerJpaEntities);
    }

    //@Override
    //public Player addDigimon(Long player_id, Long digimon_id) {
    //    PlayerJpaEntity playerJpaEntity = playerJpaRepository.findById(player_id).orElseThrow(() ->
    //            new AppException("Error in Player addDigimon(Long player_id, Long digimon_id). player_id: " + player_id));
    //    DigimonJpaEntity digimonJpaEntity =
    //}

}
