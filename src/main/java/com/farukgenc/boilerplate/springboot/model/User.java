package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;


/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(name = "tipo_identificacion")
	private String tipoIdentificacion;

	@Column(unique = true, nullable = false, name = "numero_identificacion")
	private String username;

	@Column(unique = true, name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;


	@Enumerated(EnumType.STRING)
	private UserRole userRole;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", tipoIdentificacion='" + tipoIdentificacion + '\'' +
				", username='" + username + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				'}';
	}
}
