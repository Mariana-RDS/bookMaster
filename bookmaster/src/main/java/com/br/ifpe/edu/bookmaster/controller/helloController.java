package com.br.ifpe.edu.bookmaster.controller;

import org.springframework.web.bind.annotation.*;
import com.br.ifpe.edu.bookmaster.entity.usuarioEntity;

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


    // Request utilizando json
/*
 *     Json para requisição
 * [
        {
            "titulo": "Mistborn",
            "autor": "Brandon Sanderson",
            "editora": "Trama",
            "paginas": 716,
            "ISBN": "6581339180"
        }
    ]
 */


    @PostMapping("cadastro")
    public void cadastroLivro(@RequestBody String livroJson){
        System.out.println(livroJson);

    }

    // passando com objeto
    @GetMapping("usuario")
    public String usuario(@RequestBody usuarioEntity usuario) {
        return "Nome: " + usuario.getNome() + " Sobrenome: " + usuario.getSobrenome();
    }

}
