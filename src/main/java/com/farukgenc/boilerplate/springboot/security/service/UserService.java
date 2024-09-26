package com.farukgenc.boilerplate.springboot.security.service;

import com.farukgenc.boilerplate.springboot.model.User;


public interface UserService {

	User findByUsername(String username);

}
