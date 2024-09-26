package com.farukgenc.boilerplate.springboot.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "orden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero_orden;

    @Column(length = 8)
    private String codigo;

    @Column
    private Date fechaOrden;

}
