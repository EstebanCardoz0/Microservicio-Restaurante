package org.example.ingrediente_micro.repository;

import org.example.ingrediente_micro.entity.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIngredienteRepository extends
        JpaRepository<Ingrediente, Long> {

    @Query("SELECT i FROM Ingrediente i WHERE " +
            ":plato MEMBER OF i.lista_platos")
    List<Ingrediente> findByNombre(String plato);
}
