package com.cybersoft.cozastore03.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    @GetMapping("")
    public ResponseEntity<?> getAllProduct(){

        return new ResponseEntity<>("hello product", HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> insertProduct(){

        return new ResponseEntity<>("hello product", HttpStatus.OK);
    }
}
