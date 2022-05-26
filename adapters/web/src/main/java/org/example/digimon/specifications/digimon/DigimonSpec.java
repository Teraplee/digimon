package org.example.digimon.specifications.digimon;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And(value = {
        @Spec(path = "name", params = "name", spec = LikeIgnoreCase.class),
        @Spec(path = "attack", params = "attack", spec = Equal.class),
        @Spec(path = "defence", params = "defence", spec = Equal.class),
        @Spec(path = "level", params = "level", spec = LikeIgnoreCase.class),
        @Spec(path = "type_id", params = "type_id", spec = Equal.class),
        @Spec(path = "class_id", params = "class_id", spec = Equal.class),
        @Spec(path = "group_id", params = "group_id", spec = Equal.class),
        @Spec(path = "gender", params = "gender", spec = LikeIgnoreCase.class)
})
public interface DigimonSpec extends Specification {
}
