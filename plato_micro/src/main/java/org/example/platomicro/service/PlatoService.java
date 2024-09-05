package org.example.platomicro.service;

import org.example.platomicro.entity.Plato;
import org.example.platomicro.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService
        implements IPlatoService {

    @Autowired IPlatoRepository platoRepo;

    @Override public void savePlato(Plato plato) {

    }

    @Override
    public void updatePlato(Plato plato,
                            Long id) {
        Plato plato1 = this.getPlato(id);
        plato1.setNombre(plato.getNombre());
        plato1.setPrecio(plato.getPrecio());
        plato1.setDescripcion(
                plato.getDescripcion());
        this.savePlato(plato1);

    }

    @Override public void deletePlato(Long id) {
        platoRepo.deleteById(id);
    }

    @Override public Plato getPlato(Long id) {
        return platoRepo.findById(id)
                .orElse(null);
    }

    @Override public List<Plato> getPlatos() {
        return platoRepo.findAll();
    }
}
