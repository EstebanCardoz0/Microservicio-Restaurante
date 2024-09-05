package org.example.platomicro.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Ingrediente {


    private Long id_ingrediente;
    private String nombre_ingrediente;
    private List<String> lista_platos;
}