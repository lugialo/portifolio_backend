package com.example.exercicio12.dtos;

public record TransacaoRequest(
        String origem,
        String destino,
        Double valor
) {
}
