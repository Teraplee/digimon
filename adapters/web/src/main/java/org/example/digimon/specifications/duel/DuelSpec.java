package org.example.digimon.specifications.duel;

import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And(value = {
        @Spec(path = "date", params = {"dateAfter", "dateBefore"}, spec = Between.class)
})
public interface DuelSpec extends Specification {
}
