package com.farukgenc.boilerplate.springboot.security.service;


import com.farukgenc.boilerplate.springboot.model.Laboratorio;
import com.farukgenc.boilerplate.springboot.repository.LaboratorioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaboratorioService {

    private final LaboratorioRepository laboratorioRepository;

    public LaboratorioService(LaboratorioRepository laboratorioRepository) {
        this.laboratorioRepository = laboratorioRepository;


    }

    public Optional<Laboratorio> findById(Long id) {
        return laboratorioRepository.findById(id);
    }
}
