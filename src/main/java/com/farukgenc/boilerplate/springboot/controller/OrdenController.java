package com.farukgenc.boilerplate.springboot.controller;


import com.farukgenc.boilerplate.springboot.model.Tarjetero;
import com.farukgenc.boilerplate.springboot.security.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/oders")
public class OrdenController {

    private final OrderService orderService;

    @Autowired
    public OrdenController(OrderService orderService) {
        this.orderService = orderService;
    }

    /*@GetMapping("/consultar")
    public ResponseEntity<List<AnuncioR>> consultar() {
        List<AnuncioR> anuncios = orderService.findAllNombresYTitulos();

        return ResponseEntity.ok(anuncios);

    }*/



    @PostMapping("/crear")
    public ResponseEntity<String> createAnuncio(@RequestBody Tarjetero orden) {
        try {
            this.orderService.save(orden);
            return ResponseEntity.status(HttpStatus.CREATED).body("Anuncio creado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}

