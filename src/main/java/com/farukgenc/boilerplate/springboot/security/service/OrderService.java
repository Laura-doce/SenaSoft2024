package com.farukgenc.boilerplate.springboot.security.service;


import com.farukgenc.boilerplate.springboot.model.Orden;
import com.farukgenc.boilerplate.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {



    @Autowired
    private OrderRepository orderRepository;

    public Page<Orden> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }


    public Page<Orden> getAll(int page, int elements) {


        Pageable pageable = PageRequest.of(page, elements);
        return orderRepository.findAll(pageable);
    }


    /*public List<AnuncioR> findAllNombresYTitulos() {
        return orderRepository.findAll().stream()
                .map(orden -> new AnuncioR(orden.getNombre(), orden.getAsunto()))  // Mapea cada anuncio a un DTO
                .collect(Collectors.toList());  // Recoge el resultado en una lista de DTOs
    }*/







}
