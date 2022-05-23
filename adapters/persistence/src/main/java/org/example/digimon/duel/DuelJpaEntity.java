package org.example.digimon.duel;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.player.PlayerJpaEntity;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "duel")
public class DuelJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    //@Column(name = "updated_at")
    //private Date updatedAt;
//
    //@Column(name = "updated_by")
    //private String updatedBy;

    @ManyToMany
    @JoinTable(name = "duel_players",
            joinColumns = @JoinColumn(name = "duel_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<PlayerJpaEntity> players;

}
