package com.br.ifpe.edu.bookmaster.model;

import org.springframework.stereotype.Component;

@Component
public class ResultadoDto {
    
    private String operacao;
    private double resultado;

    public ResultadoDto(){}
    
    public ResultadoDto(String operacao, double resultado){
        this.operacao = operacao;
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    

}
