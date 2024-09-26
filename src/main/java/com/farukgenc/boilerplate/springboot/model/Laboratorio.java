package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "laboratorio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private GrupoSanguineo grupoSanguineo;


    @Enumerated(EnumType.STRING)
    private Procedimientos procedimiento;

    @ManyToOne
    @JoinColumn(name = "Resultados")
    private Resultados resultados;
}
