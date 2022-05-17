package org.example.digimon.domain.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.domain.digimon.Digimon;
import org.example.digimon.domain.duel.Duel;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private Long id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String username;
    private String password;
    private Date updatedAt;
    private String updatedBy;
    private Set<Digimon> digimons;
    private Set<Duel> duels;

}
