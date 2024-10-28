package com.example.exercicio12.controllers;


import com.example.exercicio12.dtos.TransacaoRequest;
import com.example.exercicio12.dtos.TransacaoResposta;
import com.example.exercicio12.mappers.ContaMapper;
import com.example.exercicio12.models.ContaModelo;
import com.example.exercicio12.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public TransacaoResposta gerarTransacao(@RequestBody TransacaoRequest request) {
        ContaModelo origem = transacaoService.getContas().stream()
                .filter(conta -> conta.getCodigo().equals(request.origem()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Conta de origem não encontrada"));

        ContaModelo destino = transacaoService.getContas().stream()
                .filter(conta -> conta.getCodigo().equals(request.destino()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Conta de destino não encontrada"));

        return new TransacaoResposta(ContaMapper.toDTO(origem), ContaMapper.toDTO(destino), request.valor());
    }
}

