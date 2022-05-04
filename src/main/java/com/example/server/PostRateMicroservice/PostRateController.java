package com.example.server.PostRateMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "shipping")
@CrossOrigin(origins = {"http://localhost:3000", "https://password-ui.herokuapp.com/"})
public class PostRateController {

    private final PostRateService postRateService;

    @Autowired
    public PostRateController(PostRateService postRateService) {
        this.postRateService = postRateService;
    }

    @PostMapping
    public ResponseEntity<Shipping> getCustomizedPassword(@RequestBody CustomPostRateFilter customPostRateFilter){

        Shipping result = postRateService.getShipping(customPostRateFilter);

        return ResponseEntity.ok().body(result);

    }
}
