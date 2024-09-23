package com.farukgenc.boilerplate.springboot.controller;


import com.farukgenc.boilerplate.springboot.model.Anuncio;
import com.farukgenc.boilerplate.springboot.security.dto.AnuncioR;
import com.farukgenc.boilerplate.springboot.security.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

    private final AnuncioService anuncioService;

    @Autowired
    public AnuncioController(AnuncioService anuncioService) {
        this.anuncioService = anuncioService;
    }

    @GetMapping("/consultar")
    public ResponseEntity<List<AnuncioR>> consultar() {
        List<AnuncioR> anuncios = anuncioService.findAllNombresYTitulos();

        return ResponseEntity.ok(anuncios);

    }



    @PostMapping("/crear")
    public ResponseEntity<String> createAnuncio(@RequestBody Anuncio anuncio) {
        try {
            this.anuncioService.save(anuncio);
            return ResponseEntity.status(HttpStatus.CREATED).body("Anuncio creado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}

