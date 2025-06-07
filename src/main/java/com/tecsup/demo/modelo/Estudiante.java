package com.tecsup.demo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
}

