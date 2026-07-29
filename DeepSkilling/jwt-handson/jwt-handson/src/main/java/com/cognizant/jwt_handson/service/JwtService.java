package com.cognizant.jwt_handson.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.cognizant.jwt_handson.model.JwtResponse;
import com.cognizant.jwt_handson.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {

	private static final String SECRET_KEY = "cognizant";

	public JwtResponse generateToken(User user) {

		String token = Jwts.builder().setSubject(user.getUsername()).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();

		return new JwtResponse(token);
	}
}