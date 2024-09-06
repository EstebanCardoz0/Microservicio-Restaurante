package org.example.ingrediente_micro.controller;

import org.example.ingrediente_micro.entity.Ingrediente;
import org.example.ingrediente_micro.service.IIngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired IIngredienteService ingreServ;

    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody
                                   Ingrediente ingrediente) {
        ingreServ.crearIngrediente(ingrediente);
        return "Ingrediente creado con éxito";

    }

    @GetMapping("/traerp/{nombrePlato}")
    public List<Ingrediente> traerIngredientesByPlato(
            @PathVariable String nombrePlato) {
        return ingreServ.getIngredienteByPlato(
                nombrePlato);
    }

    @PutMapping("/editar/{id}")
    public Ingrediente editarIngrediente(
            @RequestBody
            Ingrediente ingrediente, @PathVariable
            Long id) {
        ingreServ.editarIngrediente(ingrediente,
                id);
        return this.traerIngrediente(id);
    }

    @GetMapping("/traer/{id}")
    public Ingrediente traerIngrediente(
            @PathVariable Long id) {
        return ingreServ.buscarIngrediente(id);
    }

    @GetMapping("/traer")
    public List<Ingrediente> traerIngredientes() {
        return ingreServ.listarIngredientes();
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarIngrediente(
            @PathVariable Long id) {
        ingreServ.eliminarIngrediente(id);
        return "Ingrediente borrado con éxito";
    }


}
