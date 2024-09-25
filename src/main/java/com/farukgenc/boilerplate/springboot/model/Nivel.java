package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fac_p_nivel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4)
    private String nivel;

    @Column(length = 50)
    private String nombre;
}
//FALTA REGIMEN Y EPS