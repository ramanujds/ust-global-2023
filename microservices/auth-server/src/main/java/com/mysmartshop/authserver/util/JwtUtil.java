package com.mysmartshop.authserver.util;


import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	
	
private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	
	public String generateJwt(String username) {
		
		 	long currentMillis = System.currentTimeMillis();
	        long expiryMillis = currentMillis + (60 * 5 * 1000);
	        Date expiryDate = new Date(expiryMillis);
	        String token = Jwts.builder()
	                .signWith(key)
	                .setSubject(username)
	                .setExpiration(expiryDate)
	                .compact();

	        return token;
		
	}
	
	public String decodeJwt(String jwt) {
		
	    if (jwt == null || jwt.isEmpty()) {
            return null;
        }
        jwt = jwt.trim();
        Jws<Claims> jws = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(jwt);
        Claims claims = jws.getBody();
        String username = claims.getSubject();
        return username;
		
	}
	

}
