package org.example.digimon.specifications.duel;

import net.kaczmarzyk.spring.data.jpa.domain.Between;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.LessThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And(value = {
        @Spec(path = "date", params = "dateTo", spec = LessThanOrEqual.class),
        @Spec(path = "date", params = "dateFrom", spec = GreaterThanOrEqual.class)
})
public interface DuelSpec extends Specification {
}
