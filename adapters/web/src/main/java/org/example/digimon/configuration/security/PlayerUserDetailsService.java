package org.example.digimon.configuration.security;

import lombok.RequiredArgsConstructor;
import org.example.digimon.application.ports.in.player.SearchPlayerUseCase;
import org.example.digimon.domain.player.Player;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.mappers.player.PlayerDtoMapper;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlayerUserDetailsService implements UserDetailsService {
    private final SearchPlayerUseCase searchPlayerUseCase;
    //private final PlayerDtoMapper playerDtoMapper;

    @Override
    public PlayerUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Player player = searchPlayerUseCase.findByUsername(username);
        return PlayerUserDetails.toUserDetails(player);
    }
}
