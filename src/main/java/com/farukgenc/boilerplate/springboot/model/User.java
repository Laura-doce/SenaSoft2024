package com.farukgenc.boilerplate.springboot.model;

import jakarta.persistence.*;
import lombok.*;


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


	@Column(unique = true)
	private String username;


	private String password;


	@Enumerated(EnumType.STRING)
	private UserRole userRole;

}
