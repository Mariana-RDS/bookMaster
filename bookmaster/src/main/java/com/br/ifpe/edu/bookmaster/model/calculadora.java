package com.br.ifpe.edu.bookmaster.model;

import org.springframework.stereotype.Component;

@Component
public class calculadora {
    
    public double somar(double x, double y){
        return x + y;
    }

    public double multiplicar(double x, double y){
        return x * y;
    }

    public double subtrair(double x, double y){
        return x - y;
    }

    public double dividir(double x, double y){
        return x / y;
    }

}
