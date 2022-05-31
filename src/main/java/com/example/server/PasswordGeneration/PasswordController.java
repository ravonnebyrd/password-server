package com.example.server.PasswordGeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "password")
@CrossOrigin(origins = {"http://localhost:3000", "https://password-ui.herokuapp.com/"})
public class PasswordController {

    private final PasswordService passwordService;

    @Autowired
    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    /*
        Citation: https://www.baeldung.com/spring-response-header
        Citation: https://www.baeldung.com/sprint-boot-multipart-requests
        Accessed: 4-21-2022
    */
    @GetMapping
    public ResponseEntity<Password> getRandomPassword(){
        return ResponseEntity.ok().body(passwordService.makeRandomPassword());
    }

    @PostMapping
    public ResponseEntity<Password> getCustomizedPassword(@RequestBody CustomPasswordFilter customPasswordFilter){

        Password result = passwordService.customizedPassword(customPasswordFilter);

        return ResponseEntity.ok().body(result);

    }

    @PostMapping(path="passphrase")
    public ResponseEntity<Password> getPassphrase(@RequestBody NumberOfWords numberOfWords){

        Password result = passwordService.passphrase(numberOfWords);

        return ResponseEntity.ok().body(result);

    }


    @GetMapping(path="username")
    public ResponseEntity<Username> getRandomUsername(){


        Username result = passwordService.makeRandomUsername();

        return ResponseEntity.ok().body(result);
    }
}
