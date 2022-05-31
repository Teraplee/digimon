package org.example.digimon.specifications.dictionary.typedictionary;

import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@And(value = {
        @Spec(path = "value", params = "value", spec = LikeIgnoreCase.class)
})
public interface TypeDictionarySpec extends Specification {
}
