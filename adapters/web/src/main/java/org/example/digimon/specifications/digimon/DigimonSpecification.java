package org.example.digimon.specifications.digimon;

import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public class DigimonSpecification {

    public static Specification between(final LocalDate dateFrom, final LocalDate dateTo) {
        return (dateFrom != null && dateTo != null)
                ? ((root, query, cb) -> cb.and(cb.greaterThanOrEqualTo(root.get("updatedAt"), dateFrom), cb.lessThanOrEqualTo(root.get("updatedAt"), dateTo)))
                : ((dateFrom != null) ? ((root, query, cb) -> cb.greaterThanOrEqualTo(root.get("updatedAt"), dateFrom))
                : ((dateTo != null) ? ((root, query, cb) -> cb.lessThanOrEqualTo(root.get("updatedAt"), dateTo)) : null));
    }

    public static Specification attackGreatestThan(final Double attack) {
        return attack != null ? (root, query, cb) -> cb.greaterThan(root.get("attack"), attack) : null;
    }

    public static Specification defenceLessThan(final Double defence) {
        return defence != null ? (root, query, cb) -> cb.lessThan(root.get("defence"), defence) : null;
    }

}