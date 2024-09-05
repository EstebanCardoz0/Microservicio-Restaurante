package org.example.platomicro.repository;

import org.example.platomicro.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlatoRepository extends
        JpaRepository<Plato, Long> {
}
