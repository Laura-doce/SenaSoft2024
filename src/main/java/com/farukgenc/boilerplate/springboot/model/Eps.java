package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gen_p_eps")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Eps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 8)
    private String codigo;

    @Column(length = 250, name = "razonsocial")
    private String razonSocial;

    @Column(length = 20)
    private String nit;

    @Column
    private Boolean habilita;

}
