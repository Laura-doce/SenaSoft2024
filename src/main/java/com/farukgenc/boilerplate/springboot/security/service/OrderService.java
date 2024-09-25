package com.farukgenc.boilerplate.springboot.security.service;


import com.farukgenc.boilerplate.springboot.model.Tarjetero;
import com.farukgenc.boilerplate.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {



    @Autowired
    private OrderRepository orderRepository;

    public List<Tarjetero> findAll() {
        return orderRepository.findAll();
    }



    /*public List<AnuncioR> findAllNombresYTitulos() {
        return orderRepository.findAll().stream()
                .map(orden -> new AnuncioR(orden.getNombre(), orden.getAsunto()))  // Mapea cada anuncio a un DTO
                .collect(Collectors.toList());  // Recoge el resultado en una lista de DTOs
    }*/





    @Transactional
    public Tarjetero save(Tarjetero orden) {
        return orderRepository.save(orden);
    }


}
