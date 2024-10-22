package com.example.exercicio12.dtos;

public record TransacaoResposta(
        ContaDTO origem,
        ContaDTO destino,
        Double valor)
{
}
