package org.example.platomicro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class PlatoDTO {
    private String nombre;
    private Double precio;
    private String descripcion;
}
