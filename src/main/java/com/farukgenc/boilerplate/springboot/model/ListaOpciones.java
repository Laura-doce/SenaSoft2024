package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gen_p_listaopcion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ListaOpciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String variable;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 2)
    private Integer valor;

    @Column(length = 100)
    private String nombre;

    @Column(length = 10)
    private String abreviacion;

    @Column
    private Boolean habilita;
}
