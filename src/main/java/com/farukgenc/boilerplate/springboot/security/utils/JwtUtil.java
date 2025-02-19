package com.farukgenc.boilerplate.springboot.security.utils;




import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;


import com.auth0.jwt.JWT;

import java.util.Date;
import java.util.concurrent.TimeUnit;



@Component
public class JwtUtil {
    private static String SECRET_KEY = "sena";
    private static Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);

    public String create(String username) {
        return JWT.create()
                .withSubject(username)
                .withIssuer("Sena")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
                .sign(ALGORITHM);
    }
}