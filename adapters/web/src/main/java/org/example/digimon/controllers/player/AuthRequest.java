package org.example.digimon.controllers.player;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
