package com.example.exercicio13.dto;

import jakarta.validation.constraints.NotBlank;

public class JogadorDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String apelido;

    private int habilidade;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
}