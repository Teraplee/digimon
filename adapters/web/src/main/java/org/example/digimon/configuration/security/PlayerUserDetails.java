package org.example.digimon.configuration.security;

import org.example.digimon.domain.player.Player;
import org.example.digimon.domain.role.Role;
import org.example.digimon.dto.player.PlayerDtoOut;
import org.example.digimon.dto.role.RoleDtoOut;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class PlayerUserDetails implements UserDetails {

    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public static PlayerUserDetails toUserDetails(Player player) {
        PlayerUserDetails playerUserDetails = new PlayerUserDetails();
        playerUserDetails.username = player.getUsername();
        playerUserDetails.password = player.getPassword();
        playerUserDetails.grantedAuthorities = Collections.singletonList(
                new SimpleGrantedAuthority(player.getRoles()
                        .stream().map(Role::getRoleEnum).findFirst().toString())); //get first role from set
        return playerUserDetails;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
