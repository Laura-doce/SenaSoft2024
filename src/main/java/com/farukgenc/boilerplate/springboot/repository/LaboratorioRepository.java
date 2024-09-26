package com.farukgenc.boilerplate.springboot.repository;

import com.farukgenc.boilerplate.springboot.model.Laboratorio;
import org.springframework.data.repository.ListCrudRepository;

public interface LaboratorioRepository extends ListCrudRepository<Laboratorio, Long> {
}
