package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "gen_m_persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 20)
    private Integer numeroId;

    @Column(nullable = false, length = 20)
    private String apellido1;

    @Column(nullable = false, length = 20)
    private String apellido2;

    @Column(nullable = false, length = 20)
    private String nombre1;

    @Column(length = 20)
    private String nombre2;

    @Column(nullable = false, unique = true, name = "fechanac")
    private Date fechaNacimiento;

    @Column
    private String direccion;

    @Column(name = "tel_movil")
    private String telefono;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_sexobiologico")
    private ListaOpciones listaOpciones;
}
