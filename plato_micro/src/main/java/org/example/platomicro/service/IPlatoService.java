package org.example.platomicro.service;

import org.example.platomicro.entity.Plato;

import java.util.List;

public interface IPlatoService {

    public void savePlato(Plato plato);

    public void updatePlato(Plato plato, Long id);

    public void deletePlato(Long id);

    public Plato getPlato(Long id);

    public List<Plato> getPlatos();
}
