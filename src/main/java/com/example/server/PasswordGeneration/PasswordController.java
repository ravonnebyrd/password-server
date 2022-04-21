package com.example.server.PasswordGeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<Password> getCustomizedPassword(@ModelAttribute CustomPasswordFilter customPasswordFilter){

        Password result = passwordService.customizedPassword(customPasswordFilter);

        if (!result.password.isBlank() && !result.password.isEmpty()){
            return ResponseEntity.ok().body(result);
        } else {
            return ResponseEntity.status(500).body(result);
        }

    }
}
