package org.example.digimon.specifications.player;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Join(path = "digimons", alias = "d")
@And(value = {
        @Spec(path = "firstName", params = "first_name", spec = LikeIgnoreCase.class),
        @Spec(path = "middleName", params = "middle_name", spec = LikeIgnoreCase.class),
        @Spec(path = "lastName", params = "last_name", spec = LikeIgnoreCase.class),
        @Spec(path = "d.id", params = "digimon_id", spec = Equal.class)
})
public interface PlayerSpec extends Specification {
}
