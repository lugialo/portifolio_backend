package com.example.exercicio12.mappers;

import com.example.exercicio12.dtos.ContaDTO;
import com.example.exercicio12.models.ContaModelo;

public record ContaMapper() {

    public static ContaDTO toDTO(ContaModelo conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}
