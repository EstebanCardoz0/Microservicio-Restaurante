package org.example.platomicro.controller;

import org.example.platomicro.dto.PlatoDTO;
import org.example.platomicro.entity.Plato;
import org.example.platomicro.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/plato")
public class PlatoController {

    @Autowired private IPlatoService platoServ;

    @PostMapping("/crear")
    public String crearPlato(@RequestBody
                             PlatoDTO plato) {


        platoServ.savePlato(plato.getNombre(),
                plato.getPrecio(),
                plato.getDescripcion());
        return "Plato creado con éxito";
    }

    @GetMapping("/traer")
    public List<Plato> traerPlatos() {
        return platoServ.getPlatos();
    }

}
