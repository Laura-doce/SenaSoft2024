package com.farukgenc.boilerplate.springboot.repository;

import com.farukgenc.boilerplate.springboot.model.Orden;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface OrdenRepo extends ListPagingAndSortingRepository<Orden, Long> {
}
