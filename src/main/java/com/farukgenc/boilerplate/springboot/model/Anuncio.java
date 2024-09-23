package com.farukgenc.boilerplate.springboot.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "anuncio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String asunto;

    @Column(nullable = false, length = 200)
    private String descripcion;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor")
    private User autor;
}
