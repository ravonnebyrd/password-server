package com.example.server.PasswordGeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/custom")
    public ResponseEntity<Password> getCustomizedPassword(@RequestBody int length,
                                                          String symbols,
                                                          String uppercase,
                                                          String lowercase,
                                                          String numbers){

        System.out.println(length + ' ' + symbols + ' ' + uppercase + ' ' + lowercase + ' ' + numbers);

        Password result = passwordService.customizedPassword(length,
                                    symbols, uppercase, lowercase, numbers);

        if (!result.password.isBlank() && !result.password.isEmpty()){
            return ResponseEntity.ok().body(result);
        } else {
            return ResponseEntity.status(500).body(result);
        }

    }
}
