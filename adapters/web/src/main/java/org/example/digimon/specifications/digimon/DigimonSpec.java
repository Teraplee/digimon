package org.example.digimon.specifications.digimon;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.EqualIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Join(path = "families", alias = "f")
@And(value = {
        @Spec(path = "name", params = "name", spec = LikeIgnoreCase.class),
        @Spec(path = "attack", params = "attack", spec = Equal.class),
        @Spec(path = "defence", params = "defence", spec = Equal.class),
        @Spec(path = "level", params = "level", spec = LikeIgnoreCase.class),
        @Spec(path = "typeDictionary.id", params = "type_id", spec = Equal.class),
        @Spec(path = "classDictionary.id", params = "class_id", spec = Equal.class),
        @Spec(path = "groupDictionary.id", params = "group_id", spec = Equal.class),
        @Spec(path = "gender", params = "gender", spec = EqualIgnoreCase.class),
        @Spec(path = "f.id", params = "family_id", spec = Equal.class)
})
public interface DigimonSpec extends Specification {
}
