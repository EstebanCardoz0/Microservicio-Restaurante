package org.example.platomicro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor

public class IngredienteDTO {
    private Long id_ingrediente;
    private String nombre_ingrediente;
    private List<String> platos;
}
