package com.farukgenc.boilerplate.springboot.security.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class LoginDto {
    private String tipoIdentificacion;
    private String username;
    private LocalDate fechaNacimiento;
}
