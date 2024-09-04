package org.example.ingrediente_micro.repository;

import org.example.ingrediente_micro.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredienteRepository extends
        JpaRepository<Ingrediente, Long> {
}
