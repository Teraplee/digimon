package org.example.digimon.specifications.digimon;

import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class DigimonSpecClass {

    public static Specification between(final Date dateAfter, final Date dateBefore) {
        return (root, query, cb) -> cb.between(root.get("updatedAt"), dateAfter, dateBefore);
    }

    public static Specification attackGreatestThan(final Double attack) {
        return (root, query, cb) -> cb.greaterThan(root.get("attack"), attack);
    }

    public static Specification defenceLessThan(final Double defence) {
        return (root, query, cb) -> cb.lessThan(root.get("defence"), defence);
    }

}
