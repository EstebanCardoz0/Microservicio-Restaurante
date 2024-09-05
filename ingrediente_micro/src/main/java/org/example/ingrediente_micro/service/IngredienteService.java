package org.example.ingrediente_micro.service;

import org.example.ingrediente_micro.entity.Ingrediente;
import org.example.ingrediente_micro.repository.IIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService
        implements IIngredienteService {

    @Autowired IIngredienteRepository
            ingredienteRepo;

    @Override
    public List<Ingrediente> listarIngredientes() {
        return ingredienteRepo.findAll();
    }

    @Override public void crearIngrediente(
            Ingrediente ingrediente) {

        ingredienteRepo.save(ingrediente);
    }

    @Override public void editarIngrediente(
            Ingrediente ingrediente, Long id) {

        Ingrediente ingre =
                this.buscarIngrediente(id);
        ingre.setNombre_ingrediente(
                ingrediente.getNombre_ingrediente());
        ingre.setLista_platos(
                ingrediente.getLista_platos());
        this.crearIngrediente(ingre);

    }

    @Override
    public void eliminarIngrediente(Long id) {
        ingredienteRepo.deleteById(id);
    }

    @Override
    public Ingrediente buscarIngrediente(
            Long id) {
        return ingredienteRepo.findById(id)
                .orElse(null);

    }
}
