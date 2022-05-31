package org.example.digimon.specifications.digimon;

import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class DigimonSpecification {

    public static Specification between(final Date dateFrom, final Date dateTo) {
        //if (dateFrom != null && dateTo != null) {
        //    return (root, query, cb) -> cb.and(cb.greaterThanOrEqualTo(root.get("updatedAt"), dateFrom),
        //            cb.lessThanOrEqualTo(root.get("updatedAt"), dateTo));
        //} else if (dateFrom != null) {
        //    return (root, query, cb) -> cb.greaterThanOrEqualTo(root.get("updatedAt"), dateFrom);
        //} else if (dateTo != null) {
        //    return (root, query, cb) -> cb.lessThanOrEqualTo(root.get("updatedAt"), dateTo);
        //} else {
        //    return null;
        //}

        return (dateFrom != null && dateTo != null) ?
                ((root, query, cb) -> cb.and(cb.greaterThanOrEqualTo(root.get("updatedAt"), dateFrom), cb.lessThanOrEqualTo(root.get("updatedAt"), dateTo)))
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