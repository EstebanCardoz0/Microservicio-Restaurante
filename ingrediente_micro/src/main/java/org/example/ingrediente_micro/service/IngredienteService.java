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


    }

    @Override public void editarIngrediente(
            Ingrediente ingrediente, Long id) {

    }

    @Override
    public void eliminarIngrediente(Long id) {

    }

    @Override
    public Ingrediente buscarIngrediente(
            Long id) {
        return null;
    }
}
