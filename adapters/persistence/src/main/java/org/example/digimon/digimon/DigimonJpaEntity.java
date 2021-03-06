package org.example.digimon.digimon;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.digimon.dictionary.classdictionary.ClassDictionaryJpaEntity;
import org.example.digimon.dictionary.familydictionary.FamilyDictionaryJpaEntity;
import org.example.digimon.dictionary.groupdictionary.GroupDictionaryJpaEntity;
import org.example.digimon.dictionary.typedictionary.TypeDictionaryJpaEntity;
import org.example.digimon.domain.digimon.DigimonGenderEnum;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "digimon")
public class DigimonJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "attack")
    private Double attack;

    @Column(name = "defence")
    private Double defence;

    @Column(name = "level")
    private String level;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private TypeDictionaryJpaEntity typeDictionary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private ClassDictionaryJpaEntity classDictionary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private GroupDictionaryJpaEntity groupDictionary;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private DigimonGenderEnum gender;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @ManyToMany
    @JoinTable(name = "digimon_families_dictionary",
            joinColumns = @JoinColumn(name = "digimon_id"),
            inverseJoinColumns = @JoinColumn(name = "family_id"))
    private Set<FamilyDictionaryJpaEntity> families;

}
