package com.example.server.PasswordGeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "password")
@CrossOrigin(origins = "http://localhost:3000")
public class PasswordController {

    private final PasswordService passwordService;

    @Autowired
    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    /*
        Citation: https://www.baeldung.com/spring-response-header
        Accessed: 4-21-2022
    */
    @GetMapping
    public ResponseEntity<Password> getRandomPassword(){
        return ResponseEntity.ok().body(passwordService.makeRandomPassword());
    }
}
