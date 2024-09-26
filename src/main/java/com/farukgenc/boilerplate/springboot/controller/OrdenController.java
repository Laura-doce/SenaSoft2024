package com.farukgenc.boilerplate.springboot.controller;


import com.farukgenc.boilerplate.springboot.model.Orden;
import com.farukgenc.boilerplate.springboot.security.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/oders")
public class OrdenController {

    private final OrderService orderService;

    @Autowired
    public OrdenController(OrderService orderService) {
        this.orderService = orderService;
    }

    /*@GetMapping("/consultar")
    public ResponseEntity<List<Orden>> consultar() {
        List<Orden> orders = orderService.findAll(orders);

        return ResponseEntity.ok(orders);

    }*/
    @GetMapping("/consult")
    public ResponseEntity<Page<Orden>> getAll(@PageableDefault(size = 10) Pageable pageable){
        Page<Orden> ordenPage = orderService.findAll(pageable);
        return ResponseEntity.ok(ordenPage);
    }




}

