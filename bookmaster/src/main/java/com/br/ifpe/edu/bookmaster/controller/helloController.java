package com.br.ifpe.edu.bookmaster.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class helloController {

    @GetMapping("hello")
    public String Hello(){
        return "Hello, World";
    }

}
