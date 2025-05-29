package com.br.ifpe.edu.bookmaster.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class helloController {

    @GetMapping("hello")
    public String Hello(){
        return "Hello, World";
    }

    
    // http://localhost:8080/api/param/Mari
    // http://localhost:8080/api/param/Mari/Santos

    @GetMapping("param/{nome}/{sobrenome}")
    public String helloParam(@PathVariable String nome, @PathVariable String sobrenome){
        return ("hello, " + nome +" "+ sobrenome);
    }

    // http://localhost:8080/api/paramNome?nome=Mari
    // http://localhost:8080/api/paramNome?nome=mariana&sobrenome=santos

    @GetMapping("paramNome")
    public String helloParamNome(@RequestParam String nome, @RequestParam String sobrenome){
        return ("hello, " + nome +" "+ sobrenome);
    }

}
