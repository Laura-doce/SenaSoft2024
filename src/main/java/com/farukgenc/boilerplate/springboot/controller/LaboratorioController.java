package com.farukgenc.boilerplate.springboot.controller;


import com.farukgenc.boilerplate.springboot.model.Laboratorio;
import com.farukgenc.boilerplate.springboot.security.service.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    private final LaboratorioService laboratorioService;

    @Autowired
    public LaboratorioController(LaboratorioService laboratorioService) {
        this.laboratorioService = laboratorioService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Laboratorio>> getLabs(@PathVariable Long id) {
        Optional<Laboratorio> laboratorio = laboratorioService.findById(id);
        if (laboratorio != null) {
            return ResponseEntity.ok(laboratorio);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
