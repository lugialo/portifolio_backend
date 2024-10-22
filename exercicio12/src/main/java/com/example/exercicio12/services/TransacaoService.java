package com.example.exercicio12.services;

import com.example.exercicio12.models.ContaModelo;

import java.util.ArrayList;
import java.util.List;

public class TransacaoService {
    private List<ContaModelo> contas;

    public TransacaoService() {
        contas = new ArrayList<>();
        contas.add(new ContaModelo("500-1", "Fulano"));
        contas.add(new ContaModelo("320-2", "Ciclano"));
    }

    public List<ContaModelo> getContas() {
        return contas;
    }
}
