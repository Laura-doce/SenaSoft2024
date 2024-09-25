package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fac_p_profesional")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(length = 4)
    private String codigo;

    @Column(length = 20)
    private String registroMedico;

    @ManyToOne
    @JoinColumn(name = "id_profesional")
    private ListaOpciones tipoProfesional;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
}
