package org.example.platomicro.service;

import org.example.platomicro.dto.IngredienteDTO;
import org.example.platomicro.entity.Plato;
import org.example.platomicro.repository.IPlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PlatoService
        implements IPlatoService {

    @Autowired private IPlatoRepository platoRepo;

    RestTemplate api = new RestTemplate();


    @Override public void savePlato(String nombre,
                                    Double precio,
                                    String descripcion) {
        Plato plato = new Plato();
        List<String> listaIngrePlato =
                new ArrayList<String>();
        plato.setNombre(nombre);
        plato.setPrecio(precio);
        plato.setDescripcion(descripcion);


        List<IngredienteDTO> listaIngredientes =
                Arrays.asList(api.getForObject(
                        "http://localhost:9001" +
                                "/ingrediente" +
                                "/traerp/" +
                                nombre,
                        IngredienteDTO[].class));

        for (IngredienteDTO ingre :
                listaIngredientes) {
            listaIngrePlato.add(
                    ingre.getNombre_ingrediente());
        }

        plato.setIngredientes(listaIngrePlato);
        platoRepo.save(plato);


    }

    @Override
    public void updatePlato(Plato plato,
                            Long id) {
        Plato plato1 = this.getPlato(id);

        plato1.setNombre(plato.getNombre());
        plato1.setPrecio(plato.getPrecio());
        plato1.setDescripcion(
                plato.getDescripcion());
        plato1.setIngredientes(
                plato.getIngredientes());
        platoRepo.save(plato1);

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
