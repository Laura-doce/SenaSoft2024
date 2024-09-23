package com.farukgenc.boilerplate.springboot.security.service;


import com.farukgenc.boilerplate.springboot.model.Anuncio;
import com.farukgenc.boilerplate.springboot.repository.AnuncioRepository;
import com.farukgenc.boilerplate.springboot.security.dto.AnuncioR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnuncioService {



    @Autowired
    private AnuncioRepository anuncioRepository;

    public List<Anuncio> findAll() {
        return anuncioRepository.findAll();
    }



    public List<AnuncioR> findAllNombresYTitulos() {
        return anuncioRepository.findAll().stream()
                .map(anuncio -> new AnuncioR(anuncio.getNombre(), anuncio.getAsunto()))  // Mapea cada anuncio a un DTO
                .collect(Collectors.toList());  // Recoge el resultado en una lista de DTOs
    }





    @Transactional
    public Anuncio save(Anuncio anuncio) {
        return anuncioRepository.save(anuncio);
    }


}
