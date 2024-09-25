package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fac_p_cups")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 8)
    private String codigo;

    @Column(length = 500)
    private String nombre;

    @Column
    private Boolean habilita;

}
