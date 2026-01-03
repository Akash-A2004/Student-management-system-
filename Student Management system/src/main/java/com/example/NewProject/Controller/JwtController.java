package com.example.NewProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NewProject.Security.Jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class JwtController {

    @Autowired
    public Jwt demo;
    
    @PostMapping("/value")
    public String nameandpassword(@RequestParam String name,@RequestParam String password) {
          if(name=="sivath" && password=="sivath1233"){

          }
          return "invalid";
    }
    
}
