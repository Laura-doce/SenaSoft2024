package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 20)
    private String numeroIdentificacion;

    @Column(nullable = false, length = 20)
    private String apellido1;

    @Column(nullable = false, length = 20)
    private String apellido2;

    @Column(nullable = false, length = 20)
    private String nombre1;

    @Column(length = 20)
    private String nombre2;

    @Column(nullable = false, unique = true)
    private Date fechaNacimiento;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private String email;

    @Enumerated(EnumType.STRING)
    private SexoBiologico sexo;
}

