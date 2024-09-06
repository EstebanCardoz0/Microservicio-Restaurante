package org.example.ingrediente_micro.service;

import org.example.ingrediente_micro.entity.Ingrediente;

import java.util.List;

public interface IIngredienteService {

    public List<Ingrediente> listarIngredientes();

    public void crearIngrediente(
            Ingrediente ingrediente);

    public void editarIngrediente(
            Ingrediente ingrediente, Long id);

    public void eliminarIngrediente(Long id);

    public Ingrediente buscarIngrediente(Long id);

    public List<Ingrediente> getIngredienteByPlato(
            String nombrePlato);
}
