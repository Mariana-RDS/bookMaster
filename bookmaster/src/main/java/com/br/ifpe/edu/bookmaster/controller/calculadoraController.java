package com.br.ifpe.edu.bookmaster.controller;

import org.springframework.web.bind.annotation.RestController;

import com.br.ifpe.edu.bookmaster.model.ResultadoDto;
import com.br.ifpe.edu.bookmaster.model.calculadora;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/calculadora")
public class calculadoraController {
    
    @Autowired
    private calculadora calculadora;

    @Autowired
    private ResultadoDto resultadoDto;

    @GetMapping("somar/{a}/{b}")
    public ResultadoDto calcularSoma(@PathVariable Integer a, @PathVariable Integer b){
        ///ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setOperacao("soma");
        resultadoDto.setResultado(this.calculadora.somar(a,b));
        return resultadoDto;

    }

    @GetMapping("multiplicar/{a}/{b}")
    public ResultadoDto calculadoraMultiplicar(@PathVariable Integer a, @PathVariable Integer b){
        //ResultadoDto resultadoDto = new ResultadoDto();
        resultadoDto.setOperacao("multiplica");
        resultadoDto.setResultado(this.calculadora.multiplicar(a,b));
        return resultadoDto;
    }

    @GetMapping("subtrair/{a}/{b}")
    public ResultadoDto calculadoraSubtracao(@PathVariable Integer a, @PathVariable Integer b){
        resultadoDto.setOperacao("subtracao");
        resultadoDto.setResultado(this.calculadora.subtrair(a, b));
        return resultadoDto;
    }

    @GetMapping("dividir/{a}/{b}")
    public ResultadoDto calculadoraDivisao(@PathVariable Integer a, @PathVariable Integer b){
        resultadoDto.setOperacao("divisao");
        resultadoDto.setResultado(this.calculadora.dividir(a, b));
        return resultadoDto;
    }


}
