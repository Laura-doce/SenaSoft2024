package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "fac_m_tarjetero")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Tarjetero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String historia;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_regimen", nullable = false)
    private ListaOpciones regimen;

    @ManyToOne
    @JoinColumn(name = "id_eps", nullable = false)
    private Eps eps;

    @ManyToOne
    @JoinColumn(name = "id_nivel", nullable = false)
    private Nivel nivel;





    /*@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor")
    private User autor;*/
}
