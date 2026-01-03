package com.example.NewProject.Security;

import java.sql.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class Jwt {
    private String Secretkey="@1010";
     private String genaratetoken(String name){
           return io.jsonwebtoken.Jwts.builder()
                               .setSubject(name)
                            .setIssuedAt(new Date(0))//annotaion
                          .signWith(SignatureAlgorithm.ES256,Secretkey)
                        .compact(); 
     }
 
    public String extractToken(String value){
         return io.jsonwebtoken.Jwts.parser()
                                     .setSigningKey(Secretkey)
                                    .parseClaimsJwt(value)
                                  .getBody()
                                .getSubject();

            
    }
  }
